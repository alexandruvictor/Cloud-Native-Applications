package proto;

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
    comments = "Source: zodiacEuropean.proto")
public final class ServiceZodiacEuropeanGrpc {

  private ServiceZodiacEuropeanGrpc() {}

  public static final String SERVICE_NAME = "ServiceZodiacEuropean";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Gate.PersonRequest,
      proto.Gate.PersonResponse> getGetZodiacEuropeanMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getZodiacEuropean",
      requestType = proto.Gate.PersonRequest.class,
      responseType = proto.Gate.PersonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Gate.PersonRequest,
      proto.Gate.PersonResponse> getGetZodiacEuropeanMethod() {
    io.grpc.MethodDescriptor<proto.Gate.PersonRequest, proto.Gate.PersonResponse> getGetZodiacEuropeanMethod;
    if ((getGetZodiacEuropeanMethod = ServiceZodiacEuropeanGrpc.getGetZodiacEuropeanMethod) == null) {
      synchronized (ServiceZodiacEuropeanGrpc.class) {
        if ((getGetZodiacEuropeanMethod = ServiceZodiacEuropeanGrpc.getGetZodiacEuropeanMethod) == null) {
          ServiceZodiacEuropeanGrpc.getGetZodiacEuropeanMethod = getGetZodiacEuropeanMethod = 
              io.grpc.MethodDescriptor.<proto.Gate.PersonRequest, proto.Gate.PersonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceZodiacEuropean", "getZodiacEuropean"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.PersonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceZodiacEuropeanMethodDescriptorSupplier("getZodiacEuropean"))
                  .build();
          }
        }
     }
     return getGetZodiacEuropeanMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceZodiacEuropeanStub newStub(io.grpc.Channel channel) {
    return new ServiceZodiacEuropeanStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceZodiacEuropeanBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceZodiacEuropeanBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceZodiacEuropeanFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceZodiacEuropeanFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceZodiacEuropeanImplBase implements io.grpc.BindableService {

    /**
     */
    public void getZodiacEuropean(proto.Gate.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.Gate.PersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetZodiacEuropeanMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetZodiacEuropeanMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Gate.PersonRequest,
                proto.Gate.PersonResponse>(
                  this, METHODID_GET_ZODIAC_EUROPEAN)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceZodiacEuropeanStub extends io.grpc.stub.AbstractStub<ServiceZodiacEuropeanStub> {
    private ServiceZodiacEuropeanStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceZodiacEuropeanStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceZodiacEuropeanStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceZodiacEuropeanStub(channel, callOptions);
    }

    /**
     */
    public void getZodiacEuropean(proto.Gate.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.Gate.PersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetZodiacEuropeanMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceZodiacEuropeanBlockingStub extends io.grpc.stub.AbstractStub<ServiceZodiacEuropeanBlockingStub> {
    private ServiceZodiacEuropeanBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceZodiacEuropeanBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceZodiacEuropeanBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceZodiacEuropeanBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Gate.PersonResponse getZodiacEuropean(proto.Gate.PersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetZodiacEuropeanMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceZodiacEuropeanFutureStub extends io.grpc.stub.AbstractStub<ServiceZodiacEuropeanFutureStub> {
    private ServiceZodiacEuropeanFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceZodiacEuropeanFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceZodiacEuropeanFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceZodiacEuropeanFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Gate.PersonResponse> getZodiacEuropean(
        proto.Gate.PersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetZodiacEuropeanMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ZODIAC_EUROPEAN = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceZodiacEuropeanImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceZodiacEuropeanImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ZODIAC_EUROPEAN:
          serviceImpl.getZodiacEuropean((proto.Gate.PersonRequest) request,
              (io.grpc.stub.StreamObserver<proto.Gate.PersonResponse>) responseObserver);
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

  private static abstract class ServiceZodiacEuropeanBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceZodiacEuropeanBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ZodiacEuropean.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceZodiacEuropean");
    }
  }

  private static final class ServiceZodiacEuropeanFileDescriptorSupplier
      extends ServiceZodiacEuropeanBaseDescriptorSupplier {
    ServiceZodiacEuropeanFileDescriptorSupplier() {}
  }

  private static final class ServiceZodiacEuropeanMethodDescriptorSupplier
      extends ServiceZodiacEuropeanBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceZodiacEuropeanMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceZodiacEuropeanGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceZodiacEuropeanFileDescriptorSupplier())
              .addMethod(getGetZodiacEuropeanMethod())
              .build();
        }
      }
    }
    return result;
  }
}
