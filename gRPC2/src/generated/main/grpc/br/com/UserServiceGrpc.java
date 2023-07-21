package br.com;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: UserService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "br.com.UserService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<br.com.UserRequest,
      br.com.UserResponse> getUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "user",
      requestType = br.com.UserRequest.class,
      responseType = br.com.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<br.com.UserRequest,
      br.com.UserResponse> getUserMethod() {
    io.grpc.MethodDescriptor<br.com.UserRequest, br.com.UserResponse> getUserMethod;
    if ((getUserMethod = UserServiceGrpc.getUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUserMethod = UserServiceGrpc.getUserMethod) == null) {
          UserServiceGrpc.getUserMethod = getUserMethod =
              io.grpc.MethodDescriptor.<br.com.UserRequest, br.com.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "user"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("user"))
              .build();
        }
      }
    }
    return getUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.UserRequestStream,
      br.com.UserResponseStream> getUserStreamServerSideStreaminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userStreamServerSideStreamin",
      requestType = br.com.UserRequestStream.class,
      responseType = br.com.UserResponseStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.UserRequestStream,
      br.com.UserResponseStream> getUserStreamServerSideStreaminMethod() {
    io.grpc.MethodDescriptor<br.com.UserRequestStream, br.com.UserResponseStream> getUserStreamServerSideStreaminMethod;
    if ((getUserStreamServerSideStreaminMethod = UserServiceGrpc.getUserStreamServerSideStreaminMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUserStreamServerSideStreaminMethod = UserServiceGrpc.getUserStreamServerSideStreaminMethod) == null) {
          UserServiceGrpc.getUserStreamServerSideStreaminMethod = getUserStreamServerSideStreaminMethod =
              io.grpc.MethodDescriptor.<br.com.UserRequestStream, br.com.UserResponseStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "userStreamServerSideStreamin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.UserRequestStream.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.UserResponseStream.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("userStreamServerSideStreamin"))
              .build();
        }
      }
    }
    return getUserStreamServerSideStreaminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.UserRequestStream,
      br.com.UserResponseStream> getUserStreamClientSideStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userStreamClientSideStreaming",
      requestType = br.com.UserRequestStream.class,
      responseType = br.com.UserResponseStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.UserRequestStream,
      br.com.UserResponseStream> getUserStreamClientSideStreamingMethod() {
    io.grpc.MethodDescriptor<br.com.UserRequestStream, br.com.UserResponseStream> getUserStreamClientSideStreamingMethod;
    if ((getUserStreamClientSideStreamingMethod = UserServiceGrpc.getUserStreamClientSideStreamingMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUserStreamClientSideStreamingMethod = UserServiceGrpc.getUserStreamClientSideStreamingMethod) == null) {
          UserServiceGrpc.getUserStreamClientSideStreamingMethod = getUserStreamClientSideStreamingMethod =
              io.grpc.MethodDescriptor.<br.com.UserRequestStream, br.com.UserResponseStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "userStreamClientSideStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.UserRequestStream.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.UserResponseStream.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("userStreamClientSideStreaming"))
              .build();
        }
      }
    }
    return getUserStreamClientSideStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<br.com.UserRequestStream,
      br.com.UserResponseStream> getUserStreamBidirectionalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "userStreamBidirectional",
      requestType = br.com.UserRequestStream.class,
      responseType = br.com.UserResponseStream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<br.com.UserRequestStream,
      br.com.UserResponseStream> getUserStreamBidirectionalMethod() {
    io.grpc.MethodDescriptor<br.com.UserRequestStream, br.com.UserResponseStream> getUserStreamBidirectionalMethod;
    if ((getUserStreamBidirectionalMethod = UserServiceGrpc.getUserStreamBidirectionalMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getUserStreamBidirectionalMethod = UserServiceGrpc.getUserStreamBidirectionalMethod) == null) {
          UserServiceGrpc.getUserStreamBidirectionalMethod = getUserStreamBidirectionalMethod =
              io.grpc.MethodDescriptor.<br.com.UserRequestStream, br.com.UserResponseStream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "userStreamBidirectional"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.UserRequestStream.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  br.com.UserResponseStream.getDefaultInstance()))
              .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("userStreamBidirectional"))
              .build();
        }
      }
    }
    return getUserStreamBidirectionalMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceStub>() {
        @java.lang.Override
        public UserServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceStub(channel, callOptions);
        }
      };
    return UserServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceBlockingStub>() {
        @java.lang.Override
        public UserServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceBlockingStub(channel, callOptions);
        }
      };
    return UserServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServiceFutureStub>() {
        @java.lang.Override
        public UserServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServiceFutureStub(channel, callOptions);
        }
      };
    return UserServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void user(br.com.UserRequest request,
        io.grpc.stub.StreamObserver<br.com.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserMethod(), responseObserver);
    }

    /**
     */
    public void userStreamServerSideStreamin(br.com.UserRequestStream request,
        io.grpc.stub.StreamObserver<br.com.UserResponseStream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUserStreamServerSideStreaminMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.UserRequestStream> userStreamClientSideStreaming(
        io.grpc.stub.StreamObserver<br.com.UserResponseStream> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUserStreamClientSideStreamingMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.UserRequestStream> userStreamBidirectional(
        io.grpc.stub.StreamObserver<br.com.UserResponseStream> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUserStreamBidirectionalMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                br.com.UserRequest,
                br.com.UserResponse>(
                  this, METHODID_USER)))
          .addMethod(
            getUserStreamServerSideStreaminMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                br.com.UserRequestStream,
                br.com.UserResponseStream>(
                  this, METHODID_USER_STREAM_SERVER_SIDE_STREAMIN)))
          .addMethod(
            getUserStreamClientSideStreamingMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                br.com.UserRequestStream,
                br.com.UserResponseStream>(
                  this, METHODID_USER_STREAM_CLIENT_SIDE_STREAMING)))
          .addMethod(
            getUserStreamBidirectionalMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                br.com.UserRequestStream,
                br.com.UserResponseStream>(
                  this, METHODID_USER_STREAM_BIDIRECTIONAL)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractAsyncStub<UserServiceStub> {
    private UserServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     */
    public void user(br.com.UserRequest request,
        io.grpc.stub.StreamObserver<br.com.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void userStreamServerSideStreamin(br.com.UserRequestStream request,
        io.grpc.stub.StreamObserver<br.com.UserResponseStream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getUserStreamServerSideStreaminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.UserRequestStream> userStreamClientSideStreaming(
        io.grpc.stub.StreamObserver<br.com.UserResponseStream> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUserStreamClientSideStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<br.com.UserRequestStream> userStreamBidirectional(
        io.grpc.stub.StreamObserver<br.com.UserResponseStream> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getUserStreamBidirectionalMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public br.com.UserResponse user(br.com.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<br.com.UserResponseStream> userStreamServerSideStreamin(
        br.com.UserRequestStream request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getUserStreamServerSideStreaminMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServiceFutureStub> {
    private UserServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<br.com.UserResponse> user(
        br.com.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_USER = 0;
  private static final int METHODID_USER_STREAM_SERVER_SIDE_STREAMIN = 1;
  private static final int METHODID_USER_STREAM_CLIENT_SIDE_STREAMING = 2;
  private static final int METHODID_USER_STREAM_BIDIRECTIONAL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_USER:
          serviceImpl.user((br.com.UserRequest) request,
              (io.grpc.stub.StreamObserver<br.com.UserResponse>) responseObserver);
          break;
        case METHODID_USER_STREAM_SERVER_SIDE_STREAMIN:
          serviceImpl.userStreamServerSideStreamin((br.com.UserRequestStream) request,
              (io.grpc.stub.StreamObserver<br.com.UserResponseStream>) responseObserver);
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
        case METHODID_USER_STREAM_CLIENT_SIDE_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.userStreamClientSideStreaming(
              (io.grpc.stub.StreamObserver<br.com.UserResponseStream>) responseObserver);
        case METHODID_USER_STREAM_BIDIRECTIONAL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.userStreamBidirectional(
              (io.grpc.stub.StreamObserver<br.com.UserResponseStream>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return br.com.UserServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getUserMethod())
              .addMethod(getUserStreamServerSideStreaminMethod())
              .addMethod(getUserStreamClientSideStreamingMethod())
              .addMethod(getUserStreamBidirectionalMethod())
              .build();
        }
      }
    }
    return result;
  }
}
