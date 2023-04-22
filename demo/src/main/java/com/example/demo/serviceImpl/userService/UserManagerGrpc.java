package com.example.demo.serviceImpl.userService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: userService.proto")
public final class UserManagerGrpc {

  private UserManagerGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.service.userService.UserManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.serviceImpl.userService.UserService.User,
      com.google.protobuf.Int32Value> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUser",
      requestType = com.example.demo.serviceImpl.userService.UserService.User.class,
      responseType = com.google.protobuf.Int32Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.serviceImpl.userService.UserService.User,
      com.google.protobuf.Int32Value> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.example.demo.serviceImpl.userService.UserService.User, com.google.protobuf.Int32Value> getAddUserMethod;
    if ((getAddUserMethod = UserManagerGrpc.getAddUserMethod) == null) {
      synchronized (UserManagerGrpc.class) {
        if ((getAddUserMethod = UserManagerGrpc.getAddUserMethod) == null) {
          UserManagerGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.serviceImpl.userService.UserService.User, com.google.protobuf.Int32Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.service.userService.UserManager", "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.serviceImpl.userService.UserService.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
                  .setSchemaDescriptor(new UserManagerMethodDescriptorSupplier("addUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.example.demo.serviceImpl.userService.UserService.User> getFindUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findUser",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.example.demo.serviceImpl.userService.UserService.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.example.demo.serviceImpl.userService.UserService.User> getFindUserMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.example.demo.serviceImpl.userService.UserService.User> getFindUserMethod;
    if ((getFindUserMethod = UserManagerGrpc.getFindUserMethod) == null) {
      synchronized (UserManagerGrpc.class) {
        if ((getFindUserMethod = UserManagerGrpc.getFindUserMethod) == null) {
          UserManagerGrpc.getFindUserMethod = getFindUserMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.example.demo.serviceImpl.userService.UserService.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.service.userService.UserManager", "findUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.serviceImpl.userService.UserService.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserManagerMethodDescriptorSupplier("findUser"))
                  .build();
          }
        }
     }
     return getFindUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserManagerStub newStub(io.grpc.Channel channel) {
    return new UserManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserManagerFutureStub(channel);
  }

  /**
   */
  public static abstract class UserManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(com.example.demo.serviceImpl.userService.UserService.User request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void findUser(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.userService.UserService.User> responseObserver) {
      asyncUnimplementedUnaryCall(getFindUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.serviceImpl.userService.UserService.User,
                com.google.protobuf.Int32Value>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getFindUserMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.StringValue,
                com.example.demo.serviceImpl.userService.UserService.User>(
                  this, METHODID_FIND_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserManagerStub extends io.grpc.stub.AbstractStub<UserManagerStub> {
    private UserManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagerStub(channel, callOptions);
    }

    /**
     */
    public void addUser(com.example.demo.serviceImpl.userService.UserService.User request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findUser(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.userService.UserService.User> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getFindUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserManagerBlockingStub extends io.grpc.stub.AbstractStub<UserManagerBlockingStub> {
    private UserManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Int32Value addUser(com.example.demo.serviceImpl.userService.UserService.User request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.demo.serviceImpl.userService.UserService.User> findUser(
        com.google.protobuf.StringValue request) {
      return blockingServerStreamingCall(
          getChannel(), getFindUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserManagerFutureStub extends io.grpc.stub.AbstractStub<UserManagerFutureStub> {
    private UserManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Int32Value> addUser(
        com.example.demo.serviceImpl.userService.UserService.User request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_FIND_USER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.example.demo.serviceImpl.userService.UserService.User) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value>) responseObserver);
          break;
        case METHODID_FIND_USER:
          serviceImpl.findUser((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.userService.UserService.User>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.serviceImpl.userService.UserService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserManager");
    }
  }

  private static final class UserManagerFileDescriptorSupplier
      extends UserManagerBaseDescriptorSupplier {
    UserManagerFileDescriptorSupplier() {}
  }

  private static final class UserManagerMethodDescriptorSupplier
      extends UserManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserManagerFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getFindUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
