package role;

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
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
    comments = "Source: menu.proto")
public final class MenuGrpc {

  private MenuGrpc() {}

  public static final String SERVICE_NAME = "role.Menu";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<role.MenuOuterClass.Request,
      role.MenuOuterClass.Reply> getMenuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Menu",
      requestType = role.MenuOuterClass.Request.class,
      responseType = role.MenuOuterClass.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<role.MenuOuterClass.Request,
      role.MenuOuterClass.Reply> getMenuMethod() {
    io.grpc.MethodDescriptor<role.MenuOuterClass.Request, role.MenuOuterClass.Reply> getMenuMethod;
    if ((getMenuMethod = MenuGrpc.getMenuMethod) == null) {
      synchronized (MenuGrpc.class) {
        if ((getMenuMethod = MenuGrpc.getMenuMethod) == null) {
          MenuGrpc.getMenuMethod = getMenuMethod = 
              io.grpc.MethodDescriptor.<role.MenuOuterClass.Request, role.MenuOuterClass.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "role.Menu", "Menu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.MenuOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.MenuOuterClass.Reply.getDefaultInstance()))
                  .setSchemaDescriptor(new MenuMethodDescriptorSupplier("Menu"))
                  .build();
          }
        }
     }
     return getMenuMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MenuStub newStub(io.grpc.Channel channel) {
    return new MenuStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MenuBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MenuBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MenuFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MenuFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class MenuImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void menu(role.MenuOuterClass.Request request,
        io.grpc.stub.StreamObserver<role.MenuOuterClass.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getMenuMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                role.MenuOuterClass.Request,
                role.MenuOuterClass.Reply>(
                  this, METHODID_MENU)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MenuStub extends io.grpc.stub.AbstractStub<MenuStub> {
    private MenuStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void menu(role.MenuOuterClass.Request request,
        io.grpc.stub.StreamObserver<role.MenuOuterClass.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMenuMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MenuBlockingStub extends io.grpc.stub.AbstractStub<MenuBlockingStub> {
    private MenuBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public role.MenuOuterClass.Reply menu(role.MenuOuterClass.Request request) {
      return blockingUnaryCall(
          getChannel(), getMenuMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class MenuFutureStub extends io.grpc.stub.AbstractStub<MenuFutureStub> {
    private MenuFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MenuFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MenuFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MenuFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<role.MenuOuterClass.Reply> menu(
        role.MenuOuterClass.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getMenuMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MENU = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MenuImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MenuImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MENU:
          serviceImpl.menu((role.MenuOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<role.MenuOuterClass.Reply>) responseObserver);
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

  private static abstract class MenuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MenuBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return role.MenuOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Menu");
    }
  }

  private static final class MenuFileDescriptorSupplier
      extends MenuBaseDescriptorSupplier {
    MenuFileDescriptorSupplier() {}
  }

  private static final class MenuMethodDescriptorSupplier
      extends MenuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MenuMethodDescriptorSupplier(String methodName) {
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
      synchronized (MenuGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MenuFileDescriptorSupplier())
              .addMethod(getMenuMethod())
              .build();
        }
      }
    }
    return result;
  }
}
