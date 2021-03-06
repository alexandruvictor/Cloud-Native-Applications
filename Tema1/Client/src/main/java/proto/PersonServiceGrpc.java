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
    comments = "Source: person.proto")
public final class PersonServiceGrpc {

  private PersonServiceGrpc() {}

  public static final String SERVICE_NAME = "PersonService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.PersonOuterClass.Person,
      proto.PersonOuterClass.Empty> getSetPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPerson",
      requestType = proto.PersonOuterClass.Person.class,
      responseType = proto.PersonOuterClass.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.PersonOuterClass.Person,
      proto.PersonOuterClass.Empty> getSetPersonMethod() {
    io.grpc.MethodDescriptor<proto.PersonOuterClass.Person, proto.PersonOuterClass.Empty> getSetPersonMethod;
    if ((getSetPersonMethod = PersonServiceGrpc.getSetPersonMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getSetPersonMethod = PersonServiceGrpc.getSetPersonMethod) == null) {
          PersonServiceGrpc.getSetPersonMethod = getSetPersonMethod = 
              io.grpc.MethodDescriptor.<proto.PersonOuterClass.Person, proto.PersonOuterClass.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "setPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonOuterClass.Person.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonOuterClass.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("setPerson"))
                  .build();
          }
        }
     }
     return getSetPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.PersonOuterClass.PersonRequest,
      proto.PersonOuterClass.PersonResponse> getGetPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPerson",
      requestType = proto.PersonOuterClass.PersonRequest.class,
      responseType = proto.PersonOuterClass.PersonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.PersonOuterClass.PersonRequest,
      proto.PersonOuterClass.PersonResponse> getGetPersonMethod() {
    io.grpc.MethodDescriptor<proto.PersonOuterClass.PersonRequest, proto.PersonOuterClass.PersonResponse> getGetPersonMethod;
    if ((getGetPersonMethod = PersonServiceGrpc.getGetPersonMethod) == null) {
      synchronized (PersonServiceGrpc.class) {
        if ((getGetPersonMethod = PersonServiceGrpc.getGetPersonMethod) == null) {
          PersonServiceGrpc.getGetPersonMethod = getGetPersonMethod = 
              io.grpc.MethodDescriptor.<proto.PersonOuterClass.PersonRequest, proto.PersonOuterClass.PersonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "PersonService", "getPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonOuterClass.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  proto.PersonOuterClass.PersonResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PersonServiceMethodDescriptorSupplier("getPerson"))
                  .build();
          }
        }
     }
     return getGetPersonMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PersonServiceStub newStub(io.grpc.Channel channel) {
    return new PersonServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PersonServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PersonServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PersonServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PersonServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PersonServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void setPerson(proto.PersonOuterClass.Person request,
        io.grpc.stub.StreamObserver<proto.PersonOuterClass.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetPersonMethod(), responseObserver);
    }

    /**
     */
    public void getPerson(proto.PersonOuterClass.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.PersonOuterClass.PersonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPersonMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.PersonOuterClass.Person,
                proto.PersonOuterClass.Empty>(
                  this, METHODID_SET_PERSON)))
          .addMethod(
            getGetPersonMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                proto.PersonOuterClass.PersonRequest,
                proto.PersonOuterClass.PersonResponse>(
                  this, METHODID_GET_PERSON)))
          .build();
    }
  }

  /**
   */
  public static final class PersonServiceStub extends io.grpc.stub.AbstractStub<PersonServiceStub> {
    private PersonServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceStub(channel, callOptions);
    }

    /**
     */
    public void setPerson(proto.PersonOuterClass.Person request,
        io.grpc.stub.StreamObserver<proto.PersonOuterClass.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPerson(proto.PersonOuterClass.PersonRequest request,
        io.grpc.stub.StreamObserver<proto.PersonOuterClass.PersonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetPersonMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PersonServiceBlockingStub extends io.grpc.stub.AbstractStub<PersonServiceBlockingStub> {
    private PersonServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.PersonOuterClass.Empty setPerson(proto.PersonOuterClass.Person request) {
      return blockingUnaryCall(
          getChannel(), getSetPersonMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.PersonOuterClass.PersonResponse getPerson(proto.PersonOuterClass.PersonRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetPersonMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PersonServiceFutureStub extends io.grpc.stub.AbstractStub<PersonServiceFutureStub> {
    private PersonServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PersonServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PersonServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PersonServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PersonOuterClass.Empty> setPerson(
        proto.PersonOuterClass.Person request) {
      return futureUnaryCall(
          getChannel().newCall(getSetPersonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.PersonOuterClass.PersonResponse> getPerson(
        proto.PersonOuterClass.PersonRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetPersonMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_PERSON = 0;
  private static final int METHODID_GET_PERSON = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PersonServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PersonServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SET_PERSON:
          serviceImpl.setPerson((proto.PersonOuterClass.Person) request,
              (io.grpc.stub.StreamObserver<proto.PersonOuterClass.Empty>) responseObserver);
          break;
        case METHODID_GET_PERSON:
          serviceImpl.getPerson((proto.PersonOuterClass.PersonRequest) request,
              (io.grpc.stub.StreamObserver<proto.PersonOuterClass.PersonResponse>) responseObserver);
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

  private static abstract class PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PersonServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return proto.PersonOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PersonService");
    }
  }

  private static final class PersonServiceFileDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier {
    PersonServiceFileDescriptorSupplier() {}
  }

  private static final class PersonServiceMethodDescriptorSupplier
      extends PersonServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PersonServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PersonServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PersonServiceFileDescriptorSupplier())
              .addMethod(getSetPersonMethod())
              .addMethod(getGetPersonMethod())
              .build();
        }
      }
    }
    return result;
  }
}
