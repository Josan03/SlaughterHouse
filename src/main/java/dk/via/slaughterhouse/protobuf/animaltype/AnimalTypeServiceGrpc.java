package dk.via.slaughterhouse.protobuf.animaltype;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: AnimalType.proto")
public final class AnimalTypeServiceGrpc {

  private AnimalTypeServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.slaughterhouse.protobuf.animaltype.AnimalTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest,
      dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse> getCreateAnimalTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimalType",
      requestType = dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest,
      dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse> getCreateAnimalTypeMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest, dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse> getCreateAnimalTypeMethod;
    if ((getCreateAnimalTypeMethod = AnimalTypeServiceGrpc.getCreateAnimalTypeMethod) == null) {
      synchronized (AnimalTypeServiceGrpc.class) {
        if ((getCreateAnimalTypeMethod = AnimalTypeServiceGrpc.getCreateAnimalTypeMethod) == null) {
          AnimalTypeServiceGrpc.getCreateAnimalTypeMethod = getCreateAnimalTypeMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest, dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimalType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalTypeServiceMethodDescriptorSupplier("createAnimalType"))
              .build();
        }
      }
    }
    return getCreateAnimalTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest,
      dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse> getGetAnimalTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalType",
      requestType = dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest,
      dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse> getGetAnimalTypeMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest, dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse> getGetAnimalTypeMethod;
    if ((getGetAnimalTypeMethod = AnimalTypeServiceGrpc.getGetAnimalTypeMethod) == null) {
      synchronized (AnimalTypeServiceGrpc.class) {
        if ((getGetAnimalTypeMethod = AnimalTypeServiceGrpc.getGetAnimalTypeMethod) == null) {
          AnimalTypeServiceGrpc.getGetAnimalTypeMethod = getGetAnimalTypeMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest, dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalTypeServiceMethodDescriptorSupplier("getAnimalType"))
              .build();
        }
      }
    }
    return getGetAnimalTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceStub>() {
        @java.lang.Override
        public AnimalTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalTypeServiceStub(channel, callOptions);
        }
      };
    return AnimalTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceBlockingStub>() {
        @java.lang.Override
        public AnimalTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalTypeServiceFutureStub>() {
        @java.lang.Override
        public AnimalTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalTypeServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalTypeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAnimalType(dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalTypeMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalType(dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalTypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAnimalTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest,
                dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse>(
                  this, METHODID_CREATE_ANIMAL_TYPE)))
          .addMethod(
            getGetAnimalTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest,
                dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse>(
                  this, METHODID_GET_ANIMAL_TYPE)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalTypeServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalTypeServiceStub> {
    private AnimalTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalTypeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAnimalType(dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalType(dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalTypeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalTypeServiceBlockingStub> {
    private AnimalTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse createAnimalType(dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse getAnimalType(dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalTypeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalTypeServiceFutureStub> {
    private AnimalTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalTypeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse> createAnimalType(
        dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse> getAnimalType(
        dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL_TYPE = 0;
  private static final int METHODID_GET_ANIMAL_TYPE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalTypeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalTypeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ANIMAL_TYPE:
          serviceImpl.createAnimalType((dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animaltype.CreateAnimalTypeResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_TYPE:
          serviceImpl.getAnimalType((dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animaltype.GetAnimalTypeResponse>) responseObserver);
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

  private static abstract class AnimalTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.slaughterhouse.protobuf.animaltype.AnimalType.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalTypeService");
    }
  }

  private static final class AnimalTypeServiceFileDescriptorSupplier
      extends AnimalTypeServiceBaseDescriptorSupplier {
    AnimalTypeServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalTypeServiceMethodDescriptorSupplier
      extends AnimalTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalTypeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalTypeServiceFileDescriptorSupplier())
              .addMethod(getCreateAnimalTypeMethod())
              .addMethod(getGetAnimalTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
