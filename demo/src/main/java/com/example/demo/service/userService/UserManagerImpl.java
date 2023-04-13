package userService;

import com.example.demo.service.userService.UserManagerGrpc;
import com.example.demo.service.userService.UserService;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;

public class UserManagerImpl extends UserManagerGrpc.UserManagerImplBase {

    HashMap<Integer, UserService.User> userStorage;

    public UserManagerImpl() {
        this.userStorage = new HashMap<>();
    }

    @Override
    public void addUser(UserService.User request, StreamObserver<Int32Value> responseObserver) {
        if (!userStorage.containsKey(request.getId())) {
            userStorage.put(request.getId(), request);
            Int32Value id = Int32Value.newBuilder().setValue(request.getId()).build();
            responseObserver.onNext(id);
            responseObserver.onCompleted();

        } else {
            throw new IllegalArgumentException();
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
        UserService.User user = UserService.User.newBuilder().setId(1).build();
        responseObserver.onNext(user);
        responseObserver.onCompleted();
    }
}
