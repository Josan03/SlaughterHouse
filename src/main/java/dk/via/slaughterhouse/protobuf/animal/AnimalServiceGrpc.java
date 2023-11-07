package dk.via.slaughterhouse.protobuf.animal;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Animal.proto")
public final class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final String SERVICE_NAME = "dk.via.slaughterhouse.protobuf.animal.AnimalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest,
      dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse> getCreateAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAnimal",
      requestType = dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest,
      dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse> getCreateAnimalMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest, dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse> getCreateAnimalMethod;
    if ((getCreateAnimalMethod = AnimalServiceGrpc.getCreateAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getCreateAnimalMethod = AnimalServiceGrpc.getCreateAnimalMethod) == null) {
          AnimalServiceGrpc.getCreateAnimalMethod = getCreateAnimalMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest, dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("createAnimal"))
              .build();
        }
      }
    }
    return getCreateAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest,
      dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse> getGetAnimalMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimal",
      requestType = dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest,
      dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse> getGetAnimalMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest, dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse> getGetAnimalMethod;
    if ((getGetAnimalMethod = AnimalServiceGrpc.getGetAnimalMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalMethod = AnimalServiceGrpc.getGetAnimalMethod) == null) {
          AnimalServiceGrpc.getGetAnimalMethod = getGetAnimalMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest, dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimal"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("getAnimal"))
              .build();
        }
      }
    }
    return getGetAnimalMethod;
  }

  private static volatile io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest,
      dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse> getGetAnimalIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnimalIds",
      requestType = dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest.class,
      responseType = dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest,
      dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse> getGetAnimalIdsMethod() {
    io.grpc.MethodDescriptor<dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest, dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse> getGetAnimalIdsMethod;
    if ((getGetAnimalIdsMethod = AnimalServiceGrpc.getGetAnimalIdsMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetAnimalIdsMethod = AnimalServiceGrpc.getGetAnimalIdsMethod) == null) {
          AnimalServiceGrpc.getGetAnimalIdsMethod = getGetAnimalIdsMethod =
              io.grpc.MethodDescriptor.<dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest, dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnimalIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("getAnimalIds"))
              .build();
        }
      }
    }
    return getGetAnimalIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub>() {
        @java.lang.Override
        public AnimalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceStub(channel, callOptions);
        }
      };
    return AnimalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub>() {
        @java.lang.Override
        public AnimalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub>() {
        @java.lang.Override
        public AnimalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAnimal(dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAnimal(dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalMethod(), responseObserver);
    }

    /**
     */
    public void getAnimalIds(dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAnimalIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest,
                dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse>(
                  this, METHODID_CREATE_ANIMAL)))
          .addMethod(
            getGetAnimalMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest,
                dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse>(
                  this, METHODID_GET_ANIMAL)))
          .addMethod(
            getGetAnimalIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest,
                dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse>(
                  this, METHODID_GET_ANIMAL_IDS)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalServiceStub> {
    private AnimalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAnimal(dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimal(dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnimalIds(dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest request,
        io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAnimalIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse createAnimal(dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse getAnimal(dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalMethod(), getCallOptions(), request);
    }

    /**
     */
    public dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse getAnimalIds(dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAnimalIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse> createAnimal(
        dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse> getAnimal(
        dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse> getAnimalIds(
        dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAnimalIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ANIMAL = 0;
  private static final int METHODID_GET_ANIMAL = 1;
  private static final int METHODID_GET_ANIMAL_IDS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ANIMAL:
          serviceImpl.createAnimal((dk.via.slaughterhouse.protobuf.animal.CreateAnimalRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.CreateAnimalResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL:
          serviceImpl.getAnimal((dk.via.slaughterhouse.protobuf.animal.GetAnimalRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.GetAnimalResponse>) responseObserver);
          break;
        case METHODID_GET_ANIMAL_IDS:
          serviceImpl.getAnimalIds((dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsRequest) request,
              (io.grpc.stub.StreamObserver<dk.via.slaughterhouse.protobuf.animal.GetAnimalIdsResponse>) responseObserver);
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

  private static abstract class AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return dk.via.slaughterhouse.protobuf.animal.Animal.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalService");
    }
  }

  private static final class AnimalServiceFileDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier {
    AnimalServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalServiceMethodDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalServiceFileDescriptorSupplier())
              .addMethod(getCreateAnimalMethod())
              .addMethod(getGetAnimalMethod())
              .addMethod(getGetAnimalIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
