package generated;

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
    comments = "Source: listaTelefonica.proto")
public final class ListaGrpc {

  private ListaGrpc() {}

  public static final String SERVICE_NAME = "proto.Lista";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.CreateRequest,
      generated.Response> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = generated.CreateRequest.class,
      responseType = generated.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.CreateRequest,
      generated.Response> getCreateMethod() {
    io.grpc.MethodDescriptor<generated.CreateRequest, generated.Response> getCreateMethod;
    if ((getCreateMethod = ListaGrpc.getCreateMethod) == null) {
      synchronized (ListaGrpc.class) {
        if ((getCreateMethod = ListaGrpc.getCreateMethod) == null) {
          ListaGrpc.getCreateMethod = getCreateMethod = 
              io.grpc.MethodDescriptor.<generated.CreateRequest, generated.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.Lista", "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ListaMethodDescriptorSupplier("create"))
                  .build();
          }
        }
     }
     return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.DeleteRequest,
      generated.Response> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = generated.DeleteRequest.class,
      responseType = generated.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.DeleteRequest,
      generated.Response> getDeleteMethod() {
    io.grpc.MethodDescriptor<generated.DeleteRequest, generated.Response> getDeleteMethod;
    if ((getDeleteMethod = ListaGrpc.getDeleteMethod) == null) {
      synchronized (ListaGrpc.class) {
        if ((getDeleteMethod = ListaGrpc.getDeleteMethod) == null) {
          ListaGrpc.getDeleteMethod = getDeleteMethod = 
              io.grpc.MethodDescriptor.<generated.DeleteRequest, generated.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.Lista", "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ListaMethodDescriptorSupplier("delete"))
                  .build();
          }
        }
     }
     return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.UpdateRequest,
      generated.Response> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = generated.UpdateRequest.class,
      responseType = generated.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.UpdateRequest,
      generated.Response> getUpdateMethod() {
    io.grpc.MethodDescriptor<generated.UpdateRequest, generated.Response> getUpdateMethod;
    if ((getUpdateMethod = ListaGrpc.getUpdateMethod) == null) {
      synchronized (ListaGrpc.class) {
        if ((getUpdateMethod = ListaGrpc.getUpdateMethod) == null) {
          ListaGrpc.getUpdateMethod = getUpdateMethod = 
              io.grpc.MethodDescriptor.<generated.UpdateRequest, generated.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.Lista", "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ListaMethodDescriptorSupplier("update"))
                  .build();
          }
        }
     }
     return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.ReadOneRequest,
      generated.Response> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read",
      requestType = generated.ReadOneRequest.class,
      responseType = generated.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.ReadOneRequest,
      generated.Response> getReadMethod() {
    io.grpc.MethodDescriptor<generated.ReadOneRequest, generated.Response> getReadMethod;
    if ((getReadMethod = ListaGrpc.getReadMethod) == null) {
      synchronized (ListaGrpc.class) {
        if ((getReadMethod = ListaGrpc.getReadMethod) == null) {
          ListaGrpc.getReadMethod = getReadMethod = 
              io.grpc.MethodDescriptor.<generated.ReadOneRequest, generated.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.Lista", "read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.ReadOneRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ListaMethodDescriptorSupplier("read"))
                  .build();
          }
        }
     }
     return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.Empty,
      generated.Response> getReadAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "readAll",
      requestType = generated.Empty.class,
      responseType = generated.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.Empty,
      generated.Response> getReadAllMethod() {
    io.grpc.MethodDescriptor<generated.Empty, generated.Response> getReadAllMethod;
    if ((getReadAllMethod = ListaGrpc.getReadAllMethod) == null) {
      synchronized (ListaGrpc.class) {
        if ((getReadAllMethod = ListaGrpc.getReadAllMethod) == null) {
          ListaGrpc.getReadAllMethod = getReadAllMethod = 
              io.grpc.MethodDescriptor.<generated.Empty, generated.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.Lista", "readAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.Response.getDefaultInstance()))
                  .setSchemaDescriptor(new ListaMethodDescriptorSupplier("readAll"))
                  .build();
          }
        }
     }
     return getReadAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ListaStub newStub(io.grpc.Channel channel) {
    return new ListaStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ListaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ListaBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ListaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ListaFutureStub(channel);
  }

  /**
   */
  public static abstract class ListaImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(generated.CreateRequest request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void delete(generated.DeleteRequest request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void update(generated.UpdateRequest request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void read(generated.ReadOneRequest request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void readAll(generated.Empty request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getReadAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.CreateRequest,
                generated.Response>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.DeleteRequest,
                generated.Response>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.UpdateRequest,
                generated.Response>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.ReadOneRequest,
                generated.Response>(
                  this, METHODID_READ)))
          .addMethod(
            getReadAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.Empty,
                generated.Response>(
                  this, METHODID_READ_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class ListaStub extends io.grpc.stub.AbstractStub<ListaStub> {
    private ListaStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ListaStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListaStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ListaStub(channel, callOptions);
    }

    /**
     */
    public void create(generated.CreateRequest request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(generated.DeleteRequest request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(generated.UpdateRequest request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void read(generated.ReadOneRequest request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readAll(generated.Empty request,
        io.grpc.stub.StreamObserver<generated.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ListaBlockingStub extends io.grpc.stub.AbstractStub<ListaBlockingStub> {
    private ListaBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ListaBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListaBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ListaBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.Response create(generated.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Response delete(generated.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Response update(generated.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Response read(generated.ReadOneRequest request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.Response readAll(generated.Empty request) {
      return blockingUnaryCall(
          getChannel(), getReadAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ListaFutureStub extends io.grpc.stub.AbstractStub<ListaFutureStub> {
    private ListaFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ListaFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ListaFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ListaFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Response> create(
        generated.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Response> delete(
        generated.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Response> update(
        generated.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Response> read(
        generated.ReadOneRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.Response> readAll(
        generated.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getReadAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_UPDATE = 2;
  private static final int METHODID_READ = 3;
  private static final int METHODID_READ_ALL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ListaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ListaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((generated.CreateRequest) request,
              (io.grpc.stub.StreamObserver<generated.Response>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((generated.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<generated.Response>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((generated.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<generated.Response>) responseObserver);
          break;
        case METHODID_READ:
          serviceImpl.read((generated.ReadOneRequest) request,
              (io.grpc.stub.StreamObserver<generated.Response>) responseObserver);
          break;
        case METHODID_READ_ALL:
          serviceImpl.readAll((generated.Empty) request,
              (io.grpc.stub.StreamObserver<generated.Response>) responseObserver);
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

  private static abstract class ListaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ListaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.UserProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Lista");
    }
  }

  private static final class ListaFileDescriptorSupplier
      extends ListaBaseDescriptorSupplier {
    ListaFileDescriptorSupplier() {}
  }

  private static final class ListaMethodDescriptorSupplier
      extends ListaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ListaMethodDescriptorSupplier(String methodName) {
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
      synchronized (ListaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ListaFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getReadMethod())
              .addMethod(getReadAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
