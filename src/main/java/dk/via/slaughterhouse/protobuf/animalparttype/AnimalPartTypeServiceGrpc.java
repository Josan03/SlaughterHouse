package dk.via.slaughterhouse.protobuf.animalparttype;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: AnimalPartType.proto")
public final class AnimalPartTypeServiceGrpc {

  private AnimalPartTypeServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.slaughterhouse.protobuf.animalparttype.AnimalPartTypeService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest,
      dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse> getCreateAnimalPartTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimalPartType",
      requestType = dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest,
      dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse> getCreateAnimalPartTypeMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest, dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse> getCreateAnimalPartTypeMethod;
    if ((getCreateAnimalPartTypeMethod = AnimalPartTypeServiceGrpc.getCreateAnimalPartTypeMethod) == null) {
      synchronized (AnimalPartTypeServiceGrpc.class) {
        if ((getCreateAnimalPartTypeMethod = AnimalPartTypeServiceGrpc.getCreateAnimalPartTypeMethod) == null) {
          AnimalPartTypeServiceGrpc.getCreateAnimalPartTypeMethod = getCreateAnimalPartTypeMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest, dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimalPartType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartTypeServiceMethodDescriptorSupplier("createAnimalPartType"))
              .build();
        }
      }
    }
    return getCreateAnimalPartTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest,
      dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse> getGetAnimalPartTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalPartType",
      requestType = dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest,
      dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse> getGetAnimalPartTypeMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest, dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse> getGetAnimalPartTypeMethod;
    if ((getGetAnimalPartTypeMethod = AnimalPartTypeServiceGrpc.getGetAnimalPartTypeMethod) == null) {
      synchronized (AnimalPartTypeServiceGrpc.class) {
        if ((getGetAnimalPartTypeMethod = AnimalPartTypeServiceGrpc.getGetAnimalPartTypeMethod) == null) {
          AnimalPartTypeServiceGrpc.getGetAnimalPartTypeMethod = getGetAnimalPartTypeMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest, dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalPartType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalPartTypeServiceMethodDescriptorSupplier("getAnimalPartType"))
              .build();
        }
      }
    }
    return getGetAnimalPartTypeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalPartTypeServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceStub>() {
        @java.lang.Override
        public AnimalPartTypeServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartTypeServiceStub(channel, callOptions);
        }
      };
    return AnimalPartTypeServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalPartTypeServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceBlockingStub>() {
        @java.lang.Override
        public AnimalPartTypeServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartTypeServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalPartTypeServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalPartTypeServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalPartTypeServiceFutureStub>() {
        @java.lang.Override
        public AnimalPartTypeServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalPartTypeServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalPartTypeServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalPartTypeServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAnimalPartType(dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalPartTypeMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalPartType(dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalPartTypeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAnimalPartTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest,
                dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse>(
                  this, METHODID_CREATE_ANIMAL_PART_TYPE)))
          .addMethod(
            getGetAnimalPartTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest,
                dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse>(
                  this, METHODID_GET_ANIMAL_PART_TYPE)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalPartTypeServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalPartTypeServiceStub> {
    private AnimalPartTypeServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartTypeServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartTypeServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAnimalPartType(dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalPartTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalPartType(dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalPartTypeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalPartTypeServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalPartTypeServiceBlockingStub> {
    private AnimalPartTypeServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartTypeServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartTypeServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse createAnimalPartType(dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalPartTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse getAnimalPartType(dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalPartTypeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalPartTypeServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalPartTypeServiceFutureStub> {
    private AnimalPartTypeServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalPartTypeServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalPartTypeServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse> createAnimalPartType(
        dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalPartTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse> getAnimalPartType(
        dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalPartTypeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL_PART_TYPE = 0;
  private static final int METHODID_GET_ANIMAL_PART_TYPE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalPartTypeServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalPartTypeServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ANIMAL_PART_TYPE:
          serviceImpl.createAnimalPartType((dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalparttype.CreateAnimalPartTypeResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_PART_TYPE:
          serviceImpl.getAnimalPartType((dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animalparttype.GetAnimalPartTypeResponse>) responseObserver);
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

  private static abstract class AnimalPartTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalPartTypeServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.slaughterhouse.protobuf.animalparttype.AnimalPartType.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalPartTypeService");
    }
  }

  private static final class AnimalPartTypeServiceFileDescriptorSupplier
      extends AnimalPartTypeServiceBaseDescriptorSupplier {
    AnimalPartTypeServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalPartTypeServiceMethodDescriptorSupplier
      extends AnimalPartTypeServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalPartTypeServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalPartTypeServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalPartTypeServiceFileDescriptorSupplier())
              .addMethod(getCreateAnimalPartTypeMethod())
              .addMethod(getGetAnimalPartTypeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
