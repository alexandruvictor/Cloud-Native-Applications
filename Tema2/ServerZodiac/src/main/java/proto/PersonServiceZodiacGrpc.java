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
    comments = "Source: personZodiac.proto")
public final class PersonServiceZodiacGrpc {

  private PersonServiceZodiacGrpc() {}

  public static final String SERVICE_NAME = "PersonServiceZodiac";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.PersonZodiacOuterClass.PersonZodiac,
      proto.PersonZodiacOuterClass.PersonZodiacResponse> getGetPersonZodiacMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPersonZodiac",
      requestType = proto.PersonZodiacOuterClass.PersonZodiac.class,
      responseType = proto.PersonZodiacOuterClass.PersonZodiacResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.PersonZodiacOuterClass.PersonZodiac,
      proto.PersonZodiacOuterClass.PersonZodiacResponse> getGetPersonZodiacMethod() {
    io.grpc.MethodDescriptor<proto.PersonZodiacOuterClass.PersonZodiac, proto.PersonZodiacOuterClass.PersonZodiacResponse> getGetPersonZodiacMethod;
    if ((getGetPersonZodiacMethod = PersonServiceZodiacGrpc.getGetPersonZodiacMethod) == null) {
      synchronized (PersonServiceZodiacGrpc.class) {
        if ((getGetPersonZodiacMethod = PersonServiceZodiacGrpc.getGetPersonZodiacMethod) == null) {
          PersonServiceZodiacGrpc.getGetPersonZodiacMethod = getGetPersonZodiacMethod = 
              io.grpc.MethodDescriptor.<proto.PersonZodiacOuterClass.PersonZodiac, proto.PersonZodiacOuterClass.PersonZodiacResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonServiceZodiac", "getPersonZodiac"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonZodiacOuterClass.PersonZodiac.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonZodiacOuterClass.PersonZodiacResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceZodiacMethodDescriptorSupplier("getPersonZodiac"))
                  .build();
          }
        }
     }
     return getGetPersonZodiacMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceZodiacStub newStub(io.grpc.Channel channel) {
    return new PersonServiceZodiacStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceZodiacBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceZodiacBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceZodiacFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceZodiacFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceZodiacImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPersonZodiac(proto.PersonZodiacOuterClass.PersonZodiac request,
        io.grpc.stub.StreamObserver<proto.PersonZodiacOuterClass.PersonZodiacResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonZodiacMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPersonZodiacMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.PersonZodiacOuterClass.PersonZodiac,
                proto.PersonZodiacOuterClass.PersonZodiacResponse>(
                  this, METHODID_GET_PERSON_ZODIAC)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceZodiacStub extends io.grpc.stub.AbstractStub<PersonServiceZodiacStub> {
    private PersonServiceZodiacStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceZodiacStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceZodiacStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceZodiacStub(channel, callOptions);
    }

    /**
     */
    public void getPersonZodiac(proto.PersonZodiacOuterClass.PersonZodiac request,
        io.grpc.stub.StreamObserver<proto.PersonZodiacOuterClass.PersonZodiacResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPersonZodiacMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceZodiacBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceZodiacBlockingStub> {
    private PersonServiceZodiacBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceZodiacBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceZodiacBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceZodiacBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.PersonZodiacOuterClass.PersonZodiacResponse getPersonZodiac(proto.PersonZodiacOuterClass.PersonZodiac request) {
      return blockingUnaryCall(
          getChannel(), getGetPersonZodiacMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceZodiacFutureStub extends io.grpc.stub.AbstractStub<PersonServiceZodiacFutureStub> {
    private PersonServiceZodiacFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceZodiacFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceZodiacFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceZodiacFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PersonZodiacOuterClass.PersonZodiacResponse> getPersonZodiac(
        proto.PersonZodiacOuterClass.PersonZodiac request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPersonZodiacMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PERSON_ZODIAC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceZodiacImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceZodiacImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PERSON_ZODIAC:
          serviceImpl.getPersonZodiac((proto.PersonZodiacOuterClass.PersonZodiac) request,
              (io.grpc.stub.StreamObserver<proto.PersonZodiacOuterClass.PersonZodiacResponse>) responseObserver);
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

  private static abstract class PersonServiceZodiacBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceZodiacBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.PersonZodiacOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonServiceZodiac");
    }
  }

  private static final class PersonServiceZodiacFileDescriptorSupplier
      extends PersonServiceZodiacBaseDescriptorSupplier {
    PersonServiceZodiacFileDescriptorSupplier() {}
  }

  private static final class PersonServiceZodiacMethodDescriptorSupplier
      extends PersonServiceZodiacBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceZodiacMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceZodiacGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceZodiacFileDescriptorSupplier())
              .addMethod(getGetPersonZodiacMethod())
              .build();
        }
      }
    }
    return result;
  }
}
