package com.example.demo.serviceImpl.notificationService;

import com.google.protobuf.BoolValue;
import com.google.protobuf.Int32Value;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import jakarta.mail.*;
import jakarta.mail.internet.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import com.fasterxml.jackson.databind.ObjectMapper;

public class NotificationManagerImpl extends NotificationManagerGrpc.NotificationManagerImplBase {

    private static final String USERNAME = "igushkin.m@outlook.com";
    private static final String PASSWORD = "tmbcwbwhjjoszjfp";
    private static final String HOST = "smtp-mail.outlook.com";
    private static final int PORT = 587;
    private Map<Integer, Boolean> notificationStatus = new HashMap<>();
    private final File notificationStatusFileStorage;

    public NotificationManagerImpl() throws IOException {
        notificationStatusFileStorage = new File("notificationDB.txt");
        notificationStatusFileStorage.createNewFile();
        restoreData();
    }

    @Override
    public void turnOnNotifications(Int32Value request, StreamObserver<Int32Value> responseObserver) {
        try {
            notificationStatus.put(request.getValue(), true);
            saveToFile();
            responseObserver.onNext(Int32Value.newBuilder().setValue(request.getValue()).build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.UNKNOWN.asException());
        }
    }

    @Override
    public void turnOffNotifications(Int32Value request, StreamObserver<Int32Value> responseObserver) {
        try {
            notificationStatus.put(request.getValue(), false);
            saveToFile();
            responseObserver.onNext(Int32Value.newBuilder().setValue(request.getValue()).build());
            responseObserver.onCompleted();
        } catch (Exception e) {
            responseObserver.onError(Status.UNKNOWN.asException());
        }
    }

    @Override
    public StreamObserver<NotificationService.Notification> sendNotification(StreamObserver<BoolValue> responseObserver) {

        return new StreamObserver<>() {
            @Override
            public void onNext(NotificationService.Notification notification) {
                try {
                    if (notificationStatus.containsKey(notification.getUserID()) && !notificationStatus.get(notification.getUserID())) {
                        responseObserver.onNext(BoolValue.newBuilder().setValue(false).build());
                    } else {
                        sendEmail(notification.getUserEmail(), notification.getSubject(), notification.getMsg());
                        responseObserver.onNext(BoolValue.newBuilder().setValue(true).build());
                    }
                } catch (MessagingException e) {
                    throw new RuntimeException(e);
                }
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                // Task completed
                responseObserver.onCompleted();
            }
        };
    }

    private static void sendEmail(String recipient, String subject, String msg) throws MessagingException {
        Properties prop = getProperties();
        Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(USERNAME));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(recipient));

        message.setSubject(subject);
        MimeBodyPart mimeBodyPart = new MimeBodyPart();
        mimeBodyPart.setContent(msg, "text/html; charset=utf-8");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(mimeBodyPart);

        message.setContent(multipart);

        Transport.send(message);
    }

    private static Properties getProperties() {
        Properties prop = new Properties();
        prop.put("mail.smtp.auth", true);
        prop.put("mail.smtp.starttls.enable", "true");
        prop.put("mail.smtp.host", HOST);
        prop.put("mail.smtp.port", PORT);
        prop.put("mail.smtp.ssl.trust", HOST);

        return prop;
    }

    private void saveToFile() throws IOException {
        try (FileOutputStream output = new FileOutputStream(notificationStatusFileStorage, false)) {
            ObjectMapper mapper = new ObjectMapper();
            output.write(mapper.writeValueAsString(notificationStatus).getBytes(StandardCharsets.UTF_8));
        }
    }

    private void restoreData() {
        try (FileInputStream input = new FileInputStream(notificationStatusFileStorage)) {
            ObjectMapper mapper = new ObjectMapper();
            byte[] bytes = input.readAllBytes();
            String data = new String(bytes, StandardCharsets.UTF_8);
            this.notificationStatus = mapper.readValue(data, HashMap.class);
        } catch (Exception e) {
            System.out.println("Unsuccessful data recover in notification manager.");
        }
    }
}