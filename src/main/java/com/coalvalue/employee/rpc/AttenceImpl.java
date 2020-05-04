package com.coalvalue.employee.rpc;


import com.coalvalue.employee.domain.entity.Employee;
import com.coalvalue.employee.domain.entity.EmployeeRole;
import com.coalvalue.employee.domain.entity.Role;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.EmployeeStatusEnum;
import com.coalvalue.employee.repository.EmployeeRepository;
import com.coalvalue.employee.repository.EmployeeRoleRepository;
import com.coalvalue.employee.repository.RoleRepository;
import com.coalvalue.employee.repository.UserRepository;
import com.coalvalue.employee.service.PermissionService;
import io.grpc.stub.StreamObserver;
//import org.lognet.springboot.grpc.GRpcService;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import role.RoleGrpc;
import role.RoleOuterClass;

import java.util.*;

@GrpcService
//@GRpcService
	// 实现 定义一个实现服务接口的类
	public class AttenceImpl extends RoleGrpc.RoleImplBase {

	@Autowired
	private PermissionService permissionService;

	@Autowired
	private EmployeeRoleRepository employeeRoleRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private UserRepository userRepository;


		@Override
		public void role(RoleOuterClass.Request req, StreamObserver<RoleOuterClass.Reply> responseObserver) {
			System.out.println("service:"+req.getId());
			User user = userRepository.findByUserId(req.getId());
			List<Employee> employeees = employeeRepository.findByUserNo(user.getUserId());
			Optional<Employee> employeeOptional = employeees.stream().filter(e->!EmployeeStatusEnum.Terminated.getText().equals(e.getStatus())).findFirst();

			Set<String> userRoles = new HashSet<String>();
			if(employeeOptional.isPresent()){
				Set<String> employeeRoles = permissionService.queryEmployeeRoles(employeeOptional.get().getUuid());
				userRoles.addAll(employeeRoles);
			}




			Set<String> userRoles___ = permissionService.queryUserRoles(user.getId());
			userRoles.addAll(userRoles___);

			//	employeeService.getUserInfo("aa");
/*			Attence employee = employeeRepository.findByUuid(req.getId());

			User user = userRepository.findByUuid(employee.getUserId());
			UserInfo company = employeeService.getUserInfo(user);*/

			RoleOuterClass.Reply.Builder reply = RoleOuterClass.Reply.newBuilder();

			userRoles.stream().forEach(e->{
				reply.addRoles(e);

			});


			responseObserver.onNext(reply.build());
			responseObserver.onCompleted();
		}




	@Override
	public void employeeRole(RoleOuterClass.EmployeeRoleRequest req, StreamObserver<RoleOuterClass.EmployeeRoleReply> responseObserver) {
		System.out.println("service:"+req.getId());




		List<EmployeeRole> roles = employeeRoleRepository.findByUserId(req.getId());



		RoleOuterClass.EmployeeRoleReply.Builder reply = RoleOuterClass.EmployeeRoleReply.newBuilder();


		for(EmployeeRole employeeRole:roles){
			Role role = roleRepository.findById(employeeRole.getRoleId()).get();
			RoleOuterClass.EmployeeRole map = RoleOuterClass.EmployeeRole.newBuilder()
					.setId(employeeRole.getUuid())
					.setName(role.getRoleName())
					.setDesc(role.getRoleDesc()).build();
			reply.addRoles(map);

		}

		responseObserver.onNext(reply.build());
		responseObserver.onCompleted();
	}




}