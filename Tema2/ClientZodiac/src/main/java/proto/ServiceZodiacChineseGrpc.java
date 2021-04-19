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
    comments = "Source: zodiacChinese.proto")
public final class ServiceZodiacChineseGrpc {

  private ServiceZodiacChineseGrpc() {}

  public static final String SERVICE_NAME = "ServiceZodiacChinese";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.Gate.PersonRequest,
      proto.Gate.PersonResponse> getGeZodiacChineseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "geZodiacChinese",
      requestType = proto.Gate.PersonRequest.class,
      responseType = proto.Gate.PersonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.Gate.PersonRequest,
      proto.Gate.PersonResponse> getGeZodiacChineseMethod() {
    io.grpc.MethodDescriptor<proto.Gate.PersonRequest, proto.Gate.PersonResponse> getGeZodiacChineseMethod;
    if ((getGeZodiacChineseMethod = ServiceZodiacChineseGrpc.getGeZodiacChineseMethod) == null) {
      synchronized (ServiceZodiacChineseGrpc.class) {
        if ((getGeZodiacChineseMethod = ServiceZodiacChineseGrpc.getGeZodiacChineseMethod) == null) {
          ServiceZodiacChineseGrpc.getGeZodiacChineseMethod = getGeZodiacChineseMethod = 
              io.grpc.MethodDescriptor.<proto.Gate.PersonRequest, proto.Gate.PersonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServiceZodiacChinese", "geZodiacChinese"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.Gate.PersonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ServiceZodiacChineseMethodDescriptorSupplier("geZodiacChinese"))
                  .build();
          }
        }
     }
     return getGeZodiacChineseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceZodiacChineseStub newStub(io.grpc.Channel channel) {
    return new ServiceZodiacChineseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceZodiacChineseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServiceZodiacChineseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceZodiacChineseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServiceZodiacChineseFutureStub(channel);
  }

  /**
   */
  public static abstract class ServiceZodiacChineseImplBase implements io.grpc.BindableService {

    /**
     */
    public void geZodiacChinese(proto.Gate.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.Gate.PersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGeZodiacChineseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGeZodiacChineseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.Gate.PersonRequest,
                proto.Gate.PersonResponse>(
                  this, METHODID_GE_ZODIAC_CHINESE)))
          .build();
    }
  }

  /**
   */
  public static final class ServiceZodiacChineseStub extends io.grpc.stub.AbstractStub<ServiceZodiacChineseStub> {
    private ServiceZodiacChineseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceZodiacChineseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceZodiacChineseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceZodiacChineseStub(channel, callOptions);
    }

    /**
     */
    public void geZodiacChinese(proto.Gate.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.Gate.PersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGeZodiacChineseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServiceZodiacChineseBlockingStub extends io.grpc.stub.AbstractStub<ServiceZodiacChineseBlockingStub> {
    private ServiceZodiacChineseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceZodiacChineseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceZodiacChineseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceZodiacChineseBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.Gate.PersonResponse geZodiacChinese(proto.Gate.PersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getGeZodiacChineseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServiceZodiacChineseFutureStub extends io.grpc.stub.AbstractStub<ServiceZodiacChineseFutureStub> {
    private ServiceZodiacChineseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServiceZodiacChineseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceZodiacChineseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServiceZodiacChineseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.Gate.PersonResponse> geZodiacChinese(
        proto.Gate.PersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGeZodiacChineseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GE_ZODIAC_CHINESE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServiceZodiacChineseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServiceZodiacChineseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GE_ZODIAC_CHINESE:
          serviceImpl.geZodiacChinese((proto.Gate.PersonRequest) request,
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

  private static abstract class ServiceZodiacChineseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceZodiacChineseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.ZodiacChinese.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServiceZodiacChinese");
    }
  }

  private static final class ServiceZodiacChineseFileDescriptorSupplier
      extends ServiceZodiacChineseBaseDescriptorSupplier {
    ServiceZodiacChineseFileDescriptorSupplier() {}
  }

  private static final class ServiceZodiacChineseMethodDescriptorSupplier
      extends ServiceZodiacChineseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServiceZodiacChineseMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServiceZodiacChineseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceZodiacChineseFileDescriptorSupplier())
              .addMethod(getGeZodiacChineseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
