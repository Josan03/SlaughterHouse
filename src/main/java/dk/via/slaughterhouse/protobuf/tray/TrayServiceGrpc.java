package dk.via.slaughterhouse.protobuf.tray;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Tray.proto")
public final class TrayServiceGrpc {

  private TrayServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.slaughterhouse.protobuf.tray.TrayService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest,
      dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse> getCreateTrayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTray",
      requestType = dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest,
      dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse> getCreateTrayMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest, dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse> getCreateTrayMethod;
    if ((getCreateTrayMethod = TrayServiceGrpc.getCreateTrayMethod) == null) {
      synchronized (TrayServiceGrpc.class) {
        if ((getCreateTrayMethod = TrayServiceGrpc.getCreateTrayMethod) == null) {
          TrayServiceGrpc.getCreateTrayMethod = getCreateTrayMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest, dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTray"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayServiceMethodDescriptorSupplier("createTray"))
              .build();
        }
      }
    }
    return getCreateTrayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.tray.GetTrayRequest,
      dk.via.slaughterhouse.protobuf.tray.GetTrayResponse> getGetTrayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTray",
      requestType = dk.via.slaughterhouse.protobuf.tray.GetTrayRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.tray.GetTrayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.tray.GetTrayRequest,
      dk.via.slaughterhouse.protobuf.tray.GetTrayResponse> getGetTrayMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.tray.GetTrayRequest, dk.via.slaughterhouse.protobuf.tray.GetTrayResponse> getGetTrayMethod;
    if ((getGetTrayMethod = TrayServiceGrpc.getGetTrayMethod) == null) {
      synchronized (TrayServiceGrpc.class) {
        if ((getGetTrayMethod = TrayServiceGrpc.getGetTrayMethod) == null) {
          TrayServiceGrpc.getGetTrayMethod = getGetTrayMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.tray.GetTrayRequest, dk.via.slaughterhouse.protobuf.tray.GetTrayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTray"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.tray.GetTrayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.tray.GetTrayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TrayServiceMethodDescriptorSupplier("getTray"))
              .build();
        }
      }
    }
    return getGetTrayMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrayServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceStub>() {
        @java.lang.Override
        public TrayServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceStub(channel, callOptions);
        }
      };
    return TrayServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrayServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceBlockingStub>() {
        @java.lang.Override
        public TrayServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceBlockingStub(channel, callOptions);
        }
      };
    return TrayServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrayServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TrayServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TrayServiceFutureStub>() {
        @java.lang.Override
        public TrayServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TrayServiceFutureStub(channel, callOptions);
        }
      };
    return TrayServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TrayServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTray(dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTrayMethod(), responseObserver);
    }

    /**
     */
    public void getTray(dk.via.slaughterhouse.protobuf.tray.GetTrayRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.tray.GetTrayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTrayMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTrayMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest,
                dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse>(
                  this, METHODID_CREATE_TRAY)))
          .addMethod(
            getGetTrayMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.tray.GetTrayRequest,
                dk.via.slaughterhouse.protobuf.tray.GetTrayResponse>(
                  this, METHODID_GET_TRAY)))
          .build();
    }
  }

  /**
   */
  public static final class TrayServiceStub extends io.grpc.stub.AbstractAsyncStub<TrayServiceStub> {
    private TrayServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTray(dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTrayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTray(dk.via.slaughterhouse.protobuf.tray.GetTrayRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.tray.GetTrayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTrayMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrayServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TrayServiceBlockingStub> {
    private TrayServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse createTray(dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTrayMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.tray.GetTrayResponse getTray(dk.via.slaughterhouse.protobuf.tray.GetTrayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTrayMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrayServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TrayServiceFutureStub> {
    private TrayServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrayServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TrayServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse> createTray(
        dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTrayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.tray.GetTrayResponse> getTray(
        dk.via.slaughterhouse.protobuf.tray.GetTrayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTrayMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRAY = 0;
  private static final int METHODID_GET_TRAY = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrayServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrayServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TRAY:
          serviceImpl.createTray((dk.via.slaughterhouse.protobuf.tray.CreateTrayRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.tray.CreateTrayResponse>) responseObserver);
          break;
        case METHODID_GET_TRAY:
          serviceImpl.getTray((dk.via.slaughterhouse.protobuf.tray.GetTrayRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.tray.GetTrayResponse>) responseObserver);
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

  private static abstract class TrayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrayServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.slaughterhouse.protobuf.tray.Tray.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrayService");
    }
  }

  private static final class TrayServiceFileDescriptorSupplier
      extends TrayServiceBaseDescriptorSupplier {
    TrayServiceFileDescriptorSupplier() {}
  }

  private static final class TrayServiceMethodDescriptorSupplier
      extends TrayServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrayServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (TrayServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrayServiceFileDescriptorSupplier())
              .addMethod(getCreateTrayMethod())
              .addMethod(getGetTrayMethod())
              .build();
        }
      }
    }
    return result;
  }
}
