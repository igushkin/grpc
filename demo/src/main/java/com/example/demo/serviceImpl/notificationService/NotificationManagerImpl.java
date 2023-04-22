package com.example.demo.serviceImpl.notificationService;

import com.google.protobuf.Int32Value;
import io.grpc.stub.StreamObserver;
import jakarta.mail.*;
import jakarta.mail.internet.*;

import java.util.Properties;

public class NotificationManagerImpl extends NotificationManagerGrpc.NotificationManagerImplBase {

    private static final String USERNAME = "igushkin.m@outlook.com";
    private static final String PASSWORD = "tmbcwbwhjjoszjfp";
    private static final String HOST = "smtp-mail.outlook.com";
    private static final int PORT = 587;

    @Override
    public void test(Int32Value request, StreamObserver<Int32Value> responseObserver) {
        //Int32Value id = Int32Value.newBuilder().setValue(request.getId()).build();
        responseObserver.onNext(Int32Value.newBuilder().setValue(1).build());
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<NotificationService.Notification> sendNotification(StreamObserver<Int32Value> responseObserver) {

        return new StreamObserver<>() {
            @Override
            public void onNext(NotificationService.Notification notification) {
                try {
                    sendEmail(notification.getUserEmail(), notification.getSubject(), notification.getMsg());
                    responseObserver.onNext(Int32Value.newBuilder().setValue(1).build());
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
        //String msg = "This is my second email using JavaMailer";

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
}