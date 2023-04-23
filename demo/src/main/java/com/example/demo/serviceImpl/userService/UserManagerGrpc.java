package com.example.demo.serviceImpl.userService;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: userService.proto")
public final class UserManagerGrpc {

  private UserManagerGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.serviceImpl.userService.UserManager";

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
                  "com.example.demo.serviceImpl.userService.UserManager", "addUser"))
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

  private static volatile io.grpc.MethodDescriptor<com.example.demo.serviceImpl.userService.UserService.User,
      com.google.protobuf.Int32Value> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUser",
      requestType = com.example.demo.serviceImpl.userService.UserService.User.class,
      responseType = com.google.protobuf.Int32Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.serviceImpl.userService.UserService.User,
      com.google.protobuf.Int32Value> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.example.demo.serviceImpl.userService.UserService.User, com.google.protobuf.Int32Value> getUpdateUserMethod;
    if ((getUpdateUserMethod = UserManagerGrpc.getUpdateUserMethod) == null) {
      synchronized (UserManagerGrpc.class) {
        if ((getUpdateUserMethod = UserManagerGrpc.getUpdateUserMethod) == null) {
          UserManagerGrpc.getUpdateUserMethod = getUpdateUserMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.serviceImpl.userService.UserService.User, com.google.protobuf.Int32Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.serviceImpl.userService.UserManager", "updateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.serviceImpl.userService.UserService.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
                  .setSchemaDescriptor(new UserManagerMethodDescriptorSupplier("updateUser"))
                  .build();
          }
        }
     }
     return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.demo.serviceImpl.userService.UserService.User> getGetAllUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllUsers",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.example.demo.serviceImpl.userService.UserService.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.demo.serviceImpl.userService.UserService.User> getGetAllUsersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.example.demo.serviceImpl.userService.UserService.User> getGetAllUsersMethod;
    if ((getGetAllUsersMethod = UserManagerGrpc.getGetAllUsersMethod) == null) {
      synchronized (UserManagerGrpc.class) {
        if ((getGetAllUsersMethod = UserManagerGrpc.getGetAllUsersMethod) == null) {
          UserManagerGrpc.getGetAllUsersMethod = getGetAllUsersMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.example.demo.serviceImpl.userService.UserService.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.serviceImpl.userService.UserManager", "getAllUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.serviceImpl.userService.UserService.User.getDefaultInstance()))
                  .setSchemaDescriptor(new UserManagerMethodDescriptorSupplier("getAllUsers"))
                  .build();
          }
        }
     }
     return getGetAllUsersMethod;
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
    public void updateUser(com.example.demo.serviceImpl.userService.UserService.User request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void getAllUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.userService.UserService.User> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllUsersMethod(), responseObserver);
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
            getUpdateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.serviceImpl.userService.UserService.User,
                com.google.protobuf.Int32Value>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getGetAllUsersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.example.demo.serviceImpl.userService.UserService.User>(
                  this, METHODID_GET_ALL_USERS)))
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
    public void updateUser(com.example.demo.serviceImpl.userService.UserService.User request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllUsers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.userService.UserService.User> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllUsersMethod(), getCallOptions()), request, responseObserver);
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
    public com.google.protobuf.Int32Value updateUser(com.example.demo.serviceImpl.userService.UserService.User request) {
      return blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.demo.serviceImpl.userService.UserService.User> getAllUsers(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllUsersMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Int32Value> updateUser(
        com.example.demo.serviceImpl.userService.UserService.User request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_UPDATE_USER = 1;
  private static final int METHODID_GET_ALL_USERS = 2;

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
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.example.demo.serviceImpl.userService.UserService.User) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value>) responseObserver);
          break;
        case METHODID_GET_ALL_USERS:
          serviceImpl.getAllUsers((com.google.protobuf.Empty) request,
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
              .addMethod(getUpdateUserMethod())
              .addMethod(getGetAllUsersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
