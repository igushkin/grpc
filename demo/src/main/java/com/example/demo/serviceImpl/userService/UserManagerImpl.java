package com.example.demo.serviceImpl.userService;

import com.google.protobuf.Empty;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UserManagerImpl extends UserManagerGrpc.UserManagerImplBase {

    private final Map<Integer, UserService.User> userStorage;
    private final File userFileStorage;

    // Constructor
    public UserManagerImpl() throws IOException {
        this.userStorage = new HashMap<>();
        userFileStorage = new File("usersDB.txt");
        userFileStorage.createNewFile();
        // Restore data from the file
        restoreData();
    }

    // Unary
    @Override
    public void addUser(UserService.User request, StreamObserver<Int32Value> responseObserver) {
        try {
            if (!userStorage.containsKey(request.getId())) {
                userStorage.put(request.getId(), request);
                saveToFile();
                Int32Value id = Int32Value.newBuilder().setValue(request.getId()).build();
                responseObserver.onNext(id);
                responseObserver.onCompleted();

            } else {
                responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(String.format("A user with id: '%d' already exists", request.getId())).asException());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Unary
    @Override
    public void updateUser(UserService.User request, StreamObserver<Int32Value> responseObserver) {
        try {
            if (userStorage.containsKey(request.getId())) {
                userStorage.put(request.getId(), request);
                saveToFile();
                Int32Value id = Int32Value.newBuilder().setValue(request.getId()).build();
                responseObserver.onNext(id);
                responseObserver.onCompleted();

            } else {
                responseObserver.onError(Status.INVALID_ARGUMENT.withDescription(String.format("No user with id:'%d' in the system", request.getId())).asException());
            }
        } catch (Exception e) {

        }
    }

    // Server stream
    @Override
    public void getAllUsers(Empty request, StreamObserver<UserService.User> responseObserver) {
        for (UserService.User user : userStorage.values()) {
            responseObserver.onNext(user);
        }
        responseObserver.onCompleted();
    }

    // Save user data to the file
    private void saveToFile() throws IOException {
        try (FileOutputStream output = new FileOutputStream(userFileStorage, false)) {
            for (UserService.User user : userStorage.values()) {
                user.writeDelimitedTo(output);
            }
        }
    }

    // Restore data from the file
    private void restoreData() throws IOException {
        try (FileInputStream input = new FileInputStream(userFileStorage)) {
            while (true) {
                UserService.User user = UserService.User.parseDelimitedFrom(input);
                if (user == null) { // parseDelimitedFrom returns null on EOF
                    break;
                }
                this.userStorage.put(user.getId(), user);
            }
        }
    }
}
