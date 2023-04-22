package com.example.demo.serviceImpl.notificationService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: notificationService.proto")
public final class NotificationManagerGrpc {

  private NotificationManagerGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.service.notificationService.NotificationManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.serviceImpl.notificationService.NotificationService.Notification,
      com.google.protobuf.Int32Value> getSendNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendNotification",
      requestType = com.example.demo.serviceImpl.notificationService.NotificationService.Notification.class,
      responseType = com.google.protobuf.Int32Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.demo.serviceImpl.notificationService.NotificationService.Notification,
      com.google.protobuf.Int32Value> getSendNotificationMethod() {
    io.grpc.MethodDescriptor<com.example.demo.serviceImpl.notificationService.NotificationService.Notification, com.google.protobuf.Int32Value> getSendNotificationMethod;
    if ((getSendNotificationMethod = NotificationManagerGrpc.getSendNotificationMethod) == null) {
      synchronized (NotificationManagerGrpc.class) {
        if ((getSendNotificationMethod = NotificationManagerGrpc.getSendNotificationMethod) == null) {
          NotificationManagerGrpc.getSendNotificationMethod = getSendNotificationMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.serviceImpl.notificationService.NotificationService.Notification, com.google.protobuf.Int32Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.service.notificationService.NotificationManager", "sendNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.serviceImpl.notificationService.NotificationService.Notification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationManagerMethodDescriptorSupplier("sendNotification"))
                  .build();
          }
        }
     }
     return getSendNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.google.protobuf.Int32Value> getTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "test",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = com.google.protobuf.Int32Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.google.protobuf.Int32Value> getTestMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, com.google.protobuf.Int32Value> getTestMethod;
    if ((getTestMethod = NotificationManagerGrpc.getTestMethod) == null) {
      synchronized (NotificationManagerGrpc.class) {
        if ((getTestMethod = NotificationManagerGrpc.getTestMethod) == null) {
          NotificationManagerGrpc.getTestMethod = getTestMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, com.google.protobuf.Int32Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.service.notificationService.NotificationManager", "test"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
                  .setSchemaDescriptor(new NotificationManagerMethodDescriptorSupplier("test"))
                  .build();
          }
        }
     }
     return getTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationManagerStub newStub(io.grpc.Channel channel) {
    return new NotificationManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new NotificationManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new NotificationManagerFutureStub(channel);
  }

  /**
   */
  public static abstract class NotificationManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.notificationService.NotificationService.Notification> sendNotification(
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendNotificationMethod(), responseObserver);
    }

    /**
     */
    public void test(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnimplementedUnaryCall(getTestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendNotificationMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.example.demo.serviceImpl.notificationService.NotificationService.Notification,
                com.google.protobuf.Int32Value>(
                  this, METHODID_SEND_NOTIFICATION)))
          .addMethod(
            getTestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Int32Value,
                com.google.protobuf.Int32Value>(
                  this, METHODID_TEST)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationManagerStub extends io.grpc.stub.AbstractStub<NotificationManagerStub> {
    private NotificationManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationManagerStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.notificationService.NotificationService.Notification> sendNotification(
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendNotificationMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void test(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotificationManagerBlockingStub extends io.grpc.stub.AbstractStub<NotificationManagerBlockingStub> {
    private NotificationManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Int32Value test(com.google.protobuf.Int32Value request) {
      return blockingUnaryCall(
          getChannel(), getTestMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationManagerFutureStub extends io.grpc.stub.AbstractStub<NotificationManagerFutureStub> {
    private NotificationManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private NotificationManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new NotificationManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Int32Value> test(
        com.google.protobuf.Int32Value request) {
      return futureUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST = 0;
  private static final int METHODID_SEND_NOTIFICATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST:
          serviceImpl.test((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_NOTIFICATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.sendNotification(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NotificationManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.serviceImpl.notificationService.NotificationService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotificationManager");
    }
  }

  private static final class NotificationManagerFileDescriptorSupplier
      extends NotificationManagerBaseDescriptorSupplier {
    NotificationManagerFileDescriptorSupplier() {}
  }

  private static final class NotificationManagerMethodDescriptorSupplier
      extends NotificationManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationManagerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NotificationManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationManagerFileDescriptorSupplier())
              .addMethod(getSendNotificationMethod())
              .addMethod(getTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
