package com.example.demo.serviceImpl.userService;

import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;

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
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {

        }
    }

    @Override
    public void findUser(StringValue request, StreamObserver<UserService.User> responseObserver) {
        for (UserService.User user : userStorage.values()) {
            String userName = user.getName().toLowerCase();
            //if (userName.startsWith(request.getValue().toLowerCase())) {
            responseObserver.onNext(user);
            //}
        }
        //UserService.User user = UserService.User.newBuilder().setId(1).build();
        //responseObserver.onNext(user);
        responseObserver.onCompleted();
    }

    private void saveToFile() throws IOException {
        try (FileOutputStream output = new FileOutputStream(userFileStorage, false)) {
            for (UserService.User user : userStorage.values()) {
                user.writeDelimitedTo(output);
            }
        }
    }

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