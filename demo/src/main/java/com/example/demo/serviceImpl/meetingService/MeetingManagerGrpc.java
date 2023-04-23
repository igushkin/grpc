package com.example.demo.serviceImpl.meetingService;

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
    comments = "Source: meetingService.proto")
public final class MeetingManagerGrpc {

  private MeetingManagerGrpc() {}

  public static final String SERVICE_NAME = "com.example.demo.serviceImpl.meetingService.MeetingManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.example.demo.serviceImpl.meetingService.MeetingService.Meeting,
      com.google.protobuf.Int32Value> getAddMeetingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addMeeting",
      requestType = com.example.demo.serviceImpl.meetingService.MeetingService.Meeting.class,
      responseType = com.google.protobuf.Int32Value.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.demo.serviceImpl.meetingService.MeetingService.Meeting,
      com.google.protobuf.Int32Value> getAddMeetingMethod() {
    io.grpc.MethodDescriptor<com.example.demo.serviceImpl.meetingService.MeetingService.Meeting, com.google.protobuf.Int32Value> getAddMeetingMethod;
    if ((getAddMeetingMethod = MeetingManagerGrpc.getAddMeetingMethod) == null) {
      synchronized (MeetingManagerGrpc.class) {
        if ((getAddMeetingMethod = MeetingManagerGrpc.getAddMeetingMethod) == null) {
          MeetingManagerGrpc.getAddMeetingMethod = getAddMeetingMethod = 
              io.grpc.MethodDescriptor.<com.example.demo.serviceImpl.meetingService.MeetingService.Meeting, com.google.protobuf.Int32Value>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.serviceImpl.meetingService.MeetingManager", "addMeeting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.serviceImpl.meetingService.MeetingService.Meeting.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingManagerMethodDescriptorSupplier("addMeeting"))
                  .build();
          }
        }
     }
     return getAddMeetingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.example.demo.serviceImpl.meetingService.MeetingService.Meeting> getGetUserMeetingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUserMeetings",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = com.example.demo.serviceImpl.meetingService.MeetingService.Meeting.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.example.demo.serviceImpl.meetingService.MeetingService.Meeting> getGetUserMeetingsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, com.example.demo.serviceImpl.meetingService.MeetingService.Meeting> getGetUserMeetingsMethod;
    if ((getGetUserMeetingsMethod = MeetingManagerGrpc.getGetUserMeetingsMethod) == null) {
      synchronized (MeetingManagerGrpc.class) {
        if ((getGetUserMeetingsMethod = MeetingManagerGrpc.getGetUserMeetingsMethod) == null) {
          MeetingManagerGrpc.getGetUserMeetingsMethod = getGetUserMeetingsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, com.example.demo.serviceImpl.meetingService.MeetingService.Meeting>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.serviceImpl.meetingService.MeetingManager", "getUserMeetings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.serviceImpl.meetingService.MeetingService.Meeting.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingManagerMethodDescriptorSupplier("getUserMeetings"))
                  .build();
          }
        }
     }
     return getGetUserMeetingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.example.demo.serviceImpl.meetingService.MeetingService.Report> getGetReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getReport",
      requestType = com.google.protobuf.Int32Value.class,
      responseType = com.example.demo.serviceImpl.meetingService.MeetingService.Report.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Int32Value,
      com.example.demo.serviceImpl.meetingService.MeetingService.Report> getGetReportMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Int32Value, com.example.demo.serviceImpl.meetingService.MeetingService.Report> getGetReportMethod;
    if ((getGetReportMethod = MeetingManagerGrpc.getGetReportMethod) == null) {
      synchronized (MeetingManagerGrpc.class) {
        if ((getGetReportMethod = MeetingManagerGrpc.getGetReportMethod) == null) {
          MeetingManagerGrpc.getGetReportMethod = getGetReportMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Int32Value, com.example.demo.serviceImpl.meetingService.MeetingService.Report>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.example.demo.serviceImpl.meetingService.MeetingManager", "getReport"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Int32Value.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.demo.serviceImpl.meetingService.MeetingService.Report.getDefaultInstance()))
                  .setSchemaDescriptor(new MeetingManagerMethodDescriptorSupplier("getReport"))
                  .build();
          }
        }
     }
     return getGetReportMethod;
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
    public void addMeeting(com.example.demo.serviceImpl.meetingService.MeetingService.Meeting request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnimplementedUnaryCall(getAddMeetingMethod(), responseObserver);
    }

    /**
     */
    public void getUserMeetings(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.meetingService.MeetingService.Meeting> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMeetingsMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> getReport(
        io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.meetingService.MeetingService.Report> responseObserver) {
      return asyncUnimplementedStreamingCall(getGetReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddMeetingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.example.demo.serviceImpl.meetingService.MeetingService.Meeting,
                com.google.protobuf.Int32Value>(
                  this, METHODID_ADD_MEETING)))
          .addMethod(
            getGetUserMeetingsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Int32Value,
                com.example.demo.serviceImpl.meetingService.MeetingService.Meeting>(
                  this, METHODID_GET_USER_MEETINGS)))
          .addMethod(
            getGetReportMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Int32Value,
                com.example.demo.serviceImpl.meetingService.MeetingService.Report>(
                  this, METHODID_GET_REPORT)))
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
    public void addMeeting(com.example.demo.serviceImpl.meetingService.MeetingService.Meeting request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddMeetingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserMeetings(com.google.protobuf.Int32Value request,
        io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.meetingService.MeetingService.Meeting> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetUserMeetingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value> getReport(
        io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.meetingService.MeetingService.Report> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getGetReportMethod(), getCallOptions()), responseObserver);
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
    public com.google.protobuf.Int32Value addMeeting(com.example.demo.serviceImpl.meetingService.MeetingService.Meeting request) {
      return blockingUnaryCall(
          getChannel(), getAddMeetingMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.example.demo.serviceImpl.meetingService.MeetingService.Meeting> getUserMeetings(
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Int32Value> addMeeting(
        com.example.demo.serviceImpl.meetingService.MeetingService.Meeting request) {
      return futureUnaryCall(
          getChannel().newCall(getAddMeetingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_MEETING = 0;
  private static final int METHODID_GET_USER_MEETINGS = 1;
  private static final int METHODID_GET_REPORT = 2;

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
        case METHODID_ADD_MEETING:
          serviceImpl.addMeeting((com.example.demo.serviceImpl.meetingService.MeetingService.Meeting) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Int32Value>) responseObserver);
          break;
        case METHODID_GET_USER_MEETINGS:
          serviceImpl.getUserMeetings((com.google.protobuf.Int32Value) request,
              (io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.meetingService.MeetingService.Meeting>) responseObserver);
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
        case METHODID_GET_REPORT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getReport(
              (io.grpc.stub.StreamObserver<com.example.demo.serviceImpl.meetingService.MeetingService.Report>) responseObserver);
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
      return com.example.demo.serviceImpl.meetingService.MeetingService.getDescriptor();
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
              .addMethod(getAddMeetingMethod())
              .addMethod(getGetUserMeetingsMethod())
              .addMethod(getGetReportMethod())
              .build();
        }
      }
    }
    return result;
  }
}
