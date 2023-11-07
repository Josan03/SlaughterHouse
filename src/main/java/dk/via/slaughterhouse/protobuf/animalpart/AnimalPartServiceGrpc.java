package dk.via.slaughterhouse.protobuf.animalpart;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: AnimalPart.proto")
public final class AnimalPartServiceGrpc {

  private AnimalPartServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.slaughterhouse.protobuf.animalpart.AnimalPartService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest,
      dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse> getCreateAnimalPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimalPart",
      requestType = dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest,
      dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse> getCreateAnimalPartMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest, dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse> getCreateAnimalPartMethod;
    if ((getCreateAnimalPartMethod = AnimalPartServiceGrpc.getCreateAnimalPartMethod) == null) {
      synchronized (AnimalPartServiceGrpc.class) {
        if ((getCreateAnimalPartMethod = AnimalPartServiceGrpc.getCreateAnimalPartMethod) == null) {
          AnimalPartServiceGrpc.getCreateAnimalPartMethod = getCreateAnimalPartMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest, dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimalPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartServiceMethodDescriptorSupplier("createAnimalPart"))
              .build();
        }
      }
    }
    return getCreateAnimalPartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest,
      dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse> getGetAnimalPartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalPart",
      requestType = dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest,
      dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse> getGetAnimalPartMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest, dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse> getGetAnimalPartMethod;
    if ((getGetAnimalPartMethod = AnimalPartServiceGrpc.getGetAnimalPartMethod) == null) {
      synchronized (AnimalPartServiceGrpc.class) {
        if ((getGetAnimalPartMethod = AnimalPartServiceGrpc.getGetAnimalPartMethod) == null) {
          AnimalPartServiceGrpc.getGetAnimalPartMethod = getGetAnimalPartMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest, dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalPart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartServiceMethodDescriptorSupplier("getAnimalPart"))
              .build();
        }
      }
    }
    return getGetAnimalPartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalPartServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceStub>() {
        @java.lang.Override
        public AnimalPartServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartServiceStub(channel, callOptions);
        }
      };
    return AnimalPartServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalPartServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceBlockingStub>() {
        @java.lang.Override
        public AnimalPartServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalPartServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalPartServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartServiceFutureStub>() {
        @java.lang.Override
        public AnimalPartServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalPartServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalPartServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAnimalPart(dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalPartMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalPart(dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalPartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAnimalPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest,
                dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse>(
                  this, METHODID_CREATE_ANIMAL_PART)))
          .addMethod(
            getGetAnimalPartMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest,
                dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse>(
                  this, METHODID_GET_ANIMAL_PART)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalPartServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalPartServiceStub> {
    private AnimalPartServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAnimalPart(dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalPartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalPart(dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalPartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalPartServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalPartServiceBlockingStub> {
    private AnimalPartServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse createAnimalPart(dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalPartMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse getAnimalPart(dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalPartMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalPartServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalPartServiceFutureStub> {
    private AnimalPartServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse> createAnimalPart(
        dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalPartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse> getAnimalPart(
        dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalPartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL_PART = 0;
  private static final int METHODID_GET_ANIMAL_PART = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalPartServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalPartServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ANIMAL_PART:
          serviceImpl.createAnimalPart((dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalpart.CreateAnimalPartResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_PART:
          serviceImpl.getAnimalPart((dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalpart.GetAnimalPartResponse>) responseObserver);
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

  private static abstract class AnimalPartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalPartServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.slaughterhouse.protobuf.animalpart.AnimalPart.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalPartService");
    }
  }

  private static final class AnimalPartServiceFileDescriptorSupplier
      extends AnimalPartServiceBaseDescriptorSupplier {
    AnimalPartServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalPartServiceMethodDescriptorSupplier
      extends AnimalPartServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalPartServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalPartServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalPartServiceFileDescriptorSupplier())
              .addMethod(getCreateAnimalPartMethod())
              .addMethod(getGetAnimalPartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
