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
    comments = "Source: role.proto")
public final class RoleGrpc {

  private RoleGrpc() {}

  public static final String SERVICE_NAME = "role.Role";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<role.RoleOuterClass.Request,
      role.RoleOuterClass.Reply> getRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Role",
      requestType = role.RoleOuterClass.Request.class,
      responseType = role.RoleOuterClass.Reply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<role.RoleOuterClass.Request,
      role.RoleOuterClass.Reply> getRoleMethod() {
    io.grpc.MethodDescriptor<role.RoleOuterClass.Request, role.RoleOuterClass.Reply> getRoleMethod;
    if ((getRoleMethod = RoleGrpc.getRoleMethod) == null) {
      synchronized (RoleGrpc.class) {
        if ((getRoleMethod = RoleGrpc.getRoleMethod) == null) {
          RoleGrpc.getRoleMethod = getRoleMethod = 
              io.grpc.MethodDescriptor.<role.RoleOuterClass.Request, role.RoleOuterClass.Reply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "role.Role", "Role"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.RoleOuterClass.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.RoleOuterClass.Reply.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleMethodDescriptorSupplier("Role"))
                  .build();
          }
        }
     }
     return getRoleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<role.RoleOuterClass.EmployeeRoleRequest,
      role.RoleOuterClass.EmployeeRoleReply> getEmployeeRoleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EmployeeRole",
      requestType = role.RoleOuterClass.EmployeeRoleRequest.class,
      responseType = role.RoleOuterClass.EmployeeRoleReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<role.RoleOuterClass.EmployeeRoleRequest,
      role.RoleOuterClass.EmployeeRoleReply> getEmployeeRoleMethod() {
    io.grpc.MethodDescriptor<role.RoleOuterClass.EmployeeRoleRequest, role.RoleOuterClass.EmployeeRoleReply> getEmployeeRoleMethod;
    if ((getEmployeeRoleMethod = RoleGrpc.getEmployeeRoleMethod) == null) {
      synchronized (RoleGrpc.class) {
        if ((getEmployeeRoleMethod = RoleGrpc.getEmployeeRoleMethod) == null) {
          RoleGrpc.getEmployeeRoleMethod = getEmployeeRoleMethod = 
              io.grpc.MethodDescriptor.<role.RoleOuterClass.EmployeeRoleRequest, role.RoleOuterClass.EmployeeRoleReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "role.Role", "EmployeeRole"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.RoleOuterClass.EmployeeRoleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  role.RoleOuterClass.EmployeeRoleReply.getDefaultInstance()))
                  .setSchemaDescriptor(new RoleMethodDescriptorSupplier("EmployeeRole"))
                  .build();
          }
        }
     }
     return getEmployeeRoleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RoleStub newStub(io.grpc.Channel channel) {
    return new RoleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RoleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RoleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RoleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RoleFutureStub(channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class RoleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void role(role.RoleOuterClass.Request request,
        io.grpc.stub.StreamObserver<role.RoleOuterClass.Reply> responseObserver) {
      asyncUnimplementedUnaryCall(getRoleMethod(), responseObserver);
    }

    /**
     */
    public void employeeRole(role.RoleOuterClass.EmployeeRoleRequest request,
        io.grpc.stub.StreamObserver<role.RoleOuterClass.EmployeeRoleReply> responseObserver) {
      asyncUnimplementedUnaryCall(getEmployeeRoleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                role.RoleOuterClass.Request,
                role.RoleOuterClass.Reply>(
                  this, METHODID_ROLE)))
          .addMethod(
            getEmployeeRoleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                role.RoleOuterClass.EmployeeRoleRequest,
                role.RoleOuterClass.EmployeeRoleReply>(
                  this, METHODID_EMPLOYEE_ROLE)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RoleStub extends io.grpc.stub.AbstractStub<RoleStub> {
    private RoleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void role(role.RoleOuterClass.Request request,
        io.grpc.stub.StreamObserver<role.RoleOuterClass.Reply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRoleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void employeeRole(role.RoleOuterClass.EmployeeRoleRequest request,
        io.grpc.stub.StreamObserver<role.RoleOuterClass.EmployeeRoleReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEmployeeRoleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RoleBlockingStub extends io.grpc.stub.AbstractStub<RoleBlockingStub> {
    private RoleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public role.RoleOuterClass.Reply role(role.RoleOuterClass.Request request) {
      return blockingUnaryCall(
          getChannel(), getRoleMethod(), getCallOptions(), request);
    }

    /**
     */
    public role.RoleOuterClass.EmployeeRoleReply employeeRole(role.RoleOuterClass.EmployeeRoleRequest request) {
      return blockingUnaryCall(
          getChannel(), getEmployeeRoleMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class RoleFutureStub extends io.grpc.stub.AbstractStub<RoleFutureStub> {
    private RoleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RoleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RoleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RoleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<role.RoleOuterClass.Reply> role(
        role.RoleOuterClass.Request request) {
      return futureUnaryCall(
          getChannel().newCall(getRoleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<role.RoleOuterClass.EmployeeRoleReply> employeeRole(
        role.RoleOuterClass.EmployeeRoleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEmployeeRoleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ROLE = 0;
  private static final int METHODID_EMPLOYEE_ROLE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RoleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RoleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ROLE:
          serviceImpl.role((role.RoleOuterClass.Request) request,
              (io.grpc.stub.StreamObserver<role.RoleOuterClass.Reply>) responseObserver);
          break;
        case METHODID_EMPLOYEE_ROLE:
          serviceImpl.employeeRole((role.RoleOuterClass.EmployeeRoleRequest) request,
              (io.grpc.stub.StreamObserver<role.RoleOuterClass.EmployeeRoleReply>) responseObserver);
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

  private static abstract class RoleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RoleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return role.RoleOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Role");
    }
  }

  private static final class RoleFileDescriptorSupplier
      extends RoleBaseDescriptorSupplier {
    RoleFileDescriptorSupplier() {}
  }

  private static final class RoleMethodDescriptorSupplier
      extends RoleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RoleMethodDescriptorSupplier(String methodName) {
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
      synchronized (RoleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RoleFileDescriptorSupplier())
              .addMethod(getRoleMethod())
              .addMethod(getEmployeeRoleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
