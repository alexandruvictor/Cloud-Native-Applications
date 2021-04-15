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
    comments = "Source: personZodiacChinese.proto")
public final class PersonServiceZodiacChineseGrpc {

  private PersonServiceZodiacChineseGrpc() {}

  public static final String SERVICE_NAME = "PersonServiceZodiacChinese";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.PersonZodiacChineseOuterClass.PersonZodiacChinese,
      proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse> getGetPersonZodiacChineseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPersonZodiacChinese",
      requestType = proto.PersonZodiacChineseOuterClass.PersonZodiacChinese.class,
      responseType = proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.PersonZodiacChineseOuterClass.PersonZodiacChinese,
      proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse> getGetPersonZodiacChineseMethod() {
    io.grpc.MethodDescriptor<proto.PersonZodiacChineseOuterClass.PersonZodiacChinese, proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse> getGetPersonZodiacChineseMethod;
    if ((getGetPersonZodiacChineseMethod = PersonServiceZodiacChineseGrpc.getGetPersonZodiacChineseMethod) == null) {
      synchronized (PersonServiceZodiacChineseGrpc.class) {
        if ((getGetPersonZodiacChineseMethod = PersonServiceZodiacChineseGrpc.getGetPersonZodiacChineseMethod) == null) {
          PersonServiceZodiacChineseGrpc.getGetPersonZodiacChineseMethod = getGetPersonZodiacChineseMethod = 
              io.grpc.MethodDescriptor.<proto.PersonZodiacChineseOuterClass.PersonZodiacChinese, proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonServiceZodiacChinese", "getPersonZodiacChinese"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonZodiacChineseOuterClass.PersonZodiacChinese.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceZodiacChineseMethodDescriptorSupplier("getPersonZodiacChinese"))
                  .build();
          }
        }
     }
     return getGetPersonZodiacChineseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceZodiacChineseStub newStub(io.grpc.Channel channel) {
    return new PersonServiceZodiacChineseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceZodiacChineseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceZodiacChineseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceZodiacChineseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceZodiacChineseFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceZodiacChineseImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPersonZodiacChinese(proto.PersonZodiacChineseOuterClass.PersonZodiacChinese request,
        io.grpc.stub.StreamObserver<proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonZodiacChineseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPersonZodiacChineseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.PersonZodiacChineseOuterClass.PersonZodiacChinese,
                proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse>(
                  this, METHODID_GET_PERSON_ZODIAC_CHINESE)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceZodiacChineseStub extends io.grpc.stub.AbstractStub<PersonServiceZodiacChineseStub> {
    private PersonServiceZodiacChineseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceZodiacChineseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceZodiacChineseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceZodiacChineseStub(channel, callOptions);
    }

    /**
     */
    public void getPersonZodiacChinese(proto.PersonZodiacChineseOuterClass.PersonZodiacChinese request,
        io.grpc.stub.StreamObserver<proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPersonZodiacChineseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceZodiacChineseBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceZodiacChineseBlockingStub> {
    private PersonServiceZodiacChineseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceZodiacChineseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceZodiacChineseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceZodiacChineseBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse getPersonZodiacChinese(proto.PersonZodiacChineseOuterClass.PersonZodiacChinese request) {
      return blockingUnaryCall(
          getChannel(), getGetPersonZodiacChineseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceZodiacChineseFutureStub extends io.grpc.stub.AbstractStub<PersonServiceZodiacChineseFutureStub> {
    private PersonServiceZodiacChineseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceZodiacChineseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceZodiacChineseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceZodiacChineseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse> getPersonZodiacChinese(
        proto.PersonZodiacChineseOuterClass.PersonZodiacChinese request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPersonZodiacChineseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PERSON_ZODIAC_CHINESE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceZodiacChineseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceZodiacChineseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PERSON_ZODIAC_CHINESE:
          serviceImpl.getPersonZodiacChinese((proto.PersonZodiacChineseOuterClass.PersonZodiacChinese) request,
              (io.grpc.stub.StreamObserver<proto.PersonZodiacChineseOuterClass.PersonZodiacChineseResponse>) responseObserver);
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

  private static abstract class PersonServiceZodiacChineseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceZodiacChineseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.PersonZodiacChineseOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonServiceZodiacChinese");
    }
  }

  private static final class PersonServiceZodiacChineseFileDescriptorSupplier
      extends PersonServiceZodiacChineseBaseDescriptorSupplier {
    PersonServiceZodiacChineseFileDescriptorSupplier() {}
  }

  private static final class PersonServiceZodiacChineseMethodDescriptorSupplier
      extends PersonServiceZodiacChineseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceZodiacChineseMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceZodiacChineseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceZodiacChineseFileDescriptorSupplier())
              .addMethod(getGetPersonZodiacChineseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
