package com.example.demo.controller;

import com.example.demo.discovery.ServiceDiscovery;
import com.example.demo.service.notificationService.NotificationManagerGrpc;
import com.example.demo.service.notificationService.NotificationService;
import com.example.demo.server.NotificationServiceServer;
import com.example.demo.service.userService.UserManagerGrpc;
import com.example.demo.service.userService.UserService;
import com.example.demo.server.UserServiceServer;
import com.google.protobuf.Int32Value;
import com.google.protobuf.StringValue;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.jmdns.ServiceInfo;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping("/notification-manager")
public class NotificationManagerController {
    private ServiceInfo userService;
    private ServiceInfo notificationService;

    public NotificationManagerController() throws InterruptedException {
        userService = ServiceDiscovery.getServiceInfo(UserServiceServer.SERVICE_TYPE);
        notificationService = ServiceDiscovery.getServiceInfo(NotificationServiceServer.SERVICE_TYPE);
    }

    @GetMapping("/notify")
    public ModelAndView notifyUsers() {
        List<UserService.User> users = getUsers(getChannel(userService));
        ModelAndView modelAndView = new ModelAndView("notificationService/method/sendNotification.html");
        modelAndView.addObject("users", users);

        return modelAndView;
    }

    @PostMapping("/notify")
    public ModelAndView notifyUserss(@RequestBody MultiValueMap<String, String> formData) throws UnknownHostException, InterruptedException {

        List<String> userEmails = formData.get("userEmails");
        String subject = formData.getFirst("subject");
        String message = formData.getFirst("message");

        ManagedChannel channel = getChannel(notificationService);

        NotificationManagerGrpc.NotificationManagerStub stub = NotificationManagerGrpc.newStub(channel);

        StreamObserver<Int32Value> responseObserver = new StreamObserver<>() {
            @Override
            public void onNext(Int32Value value) {
                System.out.println("Value : " + value);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("Finish : ");
            }
        };

        StreamObserver<NotificationService.Notification> observer = stub.sendNotification(responseObserver);

        for (String userEmail : userEmails) {
            observer.onNext(NotificationService.Notification
                    .newBuilder()
                    .setUserID(1)
                    .setUserEmail(userEmail)
                    .setSubject(subject)
                    .setMsg(message)
                    .build());
        }

        observer.onCompleted();
        Thread.sleep(100);
        return null;
    }

    private ManagedChannel getChannel(ServiceInfo serviceInfo) {
        String host = serviceInfo.getHostAddresses()[0];
        int port = serviceInfo.getPort();

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext()
                .build();

        return channel;
    }

    private List<UserService.User> getUsers(ManagedChannel channel) {
        UserManagerGrpc.UserManagerBlockingStub blockingStub = UserManagerGrpc.newBlockingStub(channel);
        List<UserService.User> users = new ArrayList<>();
        Iterator<UserService.User> itr = blockingStub.findUser(StringValue.newBuilder().build());
        itr.forEachRemaining(users::add);

        return users;
    }
}
