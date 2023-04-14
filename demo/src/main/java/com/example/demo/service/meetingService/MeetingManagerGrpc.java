package com.example.demo.service.meetingService;

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
    comments = "Source: book.proto")
public final class MeetingManagerGrpc {

  private MeetingManagerGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.service.meetingService.MeetingManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.service.meetingService.Book.Meeting,
      com.google.protobuf.Int32Value> getBookMeetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookMeeting",
      requestType = com.example.demo.service.meetingService.Book.Meeting.class,
      responseType = com.google.protobuf.Int32Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.service.meetingService.Book.Meeting,
      com.google.protobuf.Int32Value> getBookMeetingMethod() {
    io.grpc.MethodDescriptor<com.example.demo.service.meetingService.Book.Meeting, com.google.protobuf.Int32Value> getBookMeetingMethod;
    if ((getBookMeetingMethod = MeetingManagerGrpc.getBookMeetingMethod) == null) {
      synchronized (MeetingManagerGrpc.class) {
        if ((getBookMeetingMethod = MeetingManagerGrpc.getBookMeetingMethod) == null) {
          MeetingManagerGrpc.getBookMeetingMethod = getBookMeetingMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.service.meetingService.Book.Meeting, com.google.protobuf.Int32Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.service.meetingService.MeetingManager", "bookMeeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.service.meetingService.Book.Meeting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingManagerMethodDescriptorSupplier("bookMeeting"))
                  .build();
          }
        }
     }
     return getBookMeetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.example.demo.service.meetingService.Book.Meeting> getGetUserMeetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserMeetings",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = com.example.demo.service.meetingService.Book.Meeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.example.demo.service.meetingService.Book.Meeting> getGetUserMeetingsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, com.example.demo.service.meetingService.Book.Meeting> getGetUserMeetingsMethod;
    if ((getGetUserMeetingsMethod = MeetingManagerGrpc.getGetUserMeetingsMethod) == null) {
      synchronized (MeetingManagerGrpc.class) {
        if ((getGetUserMeetingsMethod = MeetingManagerGrpc.getGetUserMeetingsMethod) == null) {
          MeetingManagerGrpc.getGetUserMeetingsMethod = getGetUserMeetingsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, com.example.demo.service.meetingService.Book.Meeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.service.meetingService.MeetingManager", "getUserMeetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.service.meetingService.Book.Meeting.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingManagerMethodDescriptorSupplier("getUserMeetings"))
                  .build();
          }
        }
     }
     return getGetUserMeetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.demo.service.meetingService.Book.Meeting,
      com.google.protobuf.Int32Value> getCountMeetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countMeetings",
      requestType = com.example.demo.service.meetingService.Book.Meeting.class,
      responseType = com.google.protobuf.Int32Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.example.demo.service.meetingService.Book.Meeting,
      com.google.protobuf.Int32Value> getCountMeetingsMethod() {
    io.grpc.MethodDescriptor<com.example.demo.service.meetingService.Book.Meeting, com.google.protobuf.Int32Value> getCountMeetingsMethod;
    if ((getCountMeetingsMethod = MeetingManagerGrpc.getCountMeetingsMethod) == null) {
      synchronized (MeetingManagerGrpc.class) {
        if ((getCountMeetingsMethod = MeetingManagerGrpc.getCountMeetingsMethod) == null) {
          MeetingManagerGrpc.getCountMeetingsMethod = getCountMeetingsMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.service.meetingService.Book.Meeting, com.google.protobuf.Int32Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.service.meetingService.MeetingManager", "countMeetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.service.meetingService.Book.Meeting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingManagerMethodDescriptorSupplier("countMeetings"))
                  .build();
          }
        }
     }
     return getCountMeetingsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MeetingManagerStub newStub(io.grpc.Channel channel) {
    return new MeetingManagerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MeetingManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MeetingManagerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MeetingManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MeetingManagerFutureStub(channel);
  }

  /**
   */
  public static abstract class MeetingManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void bookMeeting(com.example.demo.service.meetingService.Book.Meeting request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnimplementedUnaryCall(getBookMeetingMethod(), responseObserver);
    }

    /**
     */
    public void getUserMeetings(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.example.demo.service.meetingService.Book.Meeting> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMeetingsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.service.meetingService.Book.Meeting> countMeetings(
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      return asyncUnimplementedStreamingCall(getCountMeetingsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBookMeetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.service.meetingService.Book.Meeting,
                com.google.protobuf.Int32Value>(
                  this, METHODID_BOOK_MEETING)))
          .addMethod(
            getGetUserMeetingsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Int32Value,
                com.example.demo.service.meetingService.Book.Meeting>(
                  this, METHODID_GET_USER_MEETINGS)))
          .addMethod(
            getCountMeetingsMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.example.demo.service.meetingService.Book.Meeting,
                com.google.protobuf.Int32Value>(
                  this, METHODID_COUNT_MEETINGS)))
          .build();
    }
  }

  /**
   */
  public static final class MeetingManagerStub extends io.grpc.stub.AbstractStub<MeetingManagerStub> {
    private MeetingManagerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingManagerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingManagerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingManagerStub(channel, callOptions);
    }

    /**
     */
    public void bookMeeting(com.example.demo.service.meetingService.Book.Meeting request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBookMeetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserMeetings(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.example.demo.service.meetingService.Book.Meeting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetUserMeetingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.example.demo.service.meetingService.Book.Meeting> countMeetings(
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getCountMeetingsMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class MeetingManagerBlockingStub extends io.grpc.stub.AbstractStub<MeetingManagerBlockingStub> {
    private MeetingManagerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingManagerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingManagerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Int32Value bookMeeting(com.example.demo.service.meetingService.Book.Meeting request) {
      return blockingUnaryCall(
          getChannel(), getBookMeetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.demo.service.meetingService.Book.Meeting> getUserMeetings(
        com.google.protobuf.Int32Value request) {
      return blockingServerStreamingCall(
          getChannel(), getGetUserMeetingsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MeetingManagerFutureStub extends io.grpc.stub.AbstractStub<MeetingManagerFutureStub> {
    private MeetingManagerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MeetingManagerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MeetingManagerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MeetingManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Int32Value> bookMeeting(
        com.example.demo.service.meetingService.Book.Meeting request) {
      return futureUnaryCall(
          getChannel().newCall(getBookMeetingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BOOK_MEETING = 0;
  private static final int METHODID_GET_USER_MEETINGS = 1;
  private static final int METHODID_COUNT_MEETINGS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MeetingManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MeetingManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BOOK_MEETING:
          serviceImpl.bookMeeting((com.example.demo.service.meetingService.Book.Meeting) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value>) responseObserver);
          break;
        case METHODID_GET_USER_MEETINGS:
          serviceImpl.getUserMeetings((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<com.example.demo.service.meetingService.Book.Meeting>) responseObserver);
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
        case METHODID_COUNT_MEETINGS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.countMeetings(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class MeetingManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MeetingManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.demo.service.meetingService.Book.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MeetingManager");
    }
  }

  private static final class MeetingManagerFileDescriptorSupplier
      extends MeetingManagerBaseDescriptorSupplier {
    MeetingManagerFileDescriptorSupplier() {}
  }

  private static final class MeetingManagerMethodDescriptorSupplier
      extends MeetingManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MeetingManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (MeetingManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MeetingManagerFileDescriptorSupplier())
              .addMethod(getBookMeetingMethod())
              .addMethod(getGetUserMeetingsMethod())
              .addMethod(getCountMeetingsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
