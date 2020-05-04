package com.coalvalue.employee.rpc;


import com.coalvalue.employee.domain.entity.Employee;

import com.coalvalue.employee.domain.entity.Menu;
import com.coalvalue.employee.domain.entity.MenuNode;
import com.coalvalue.employee.domain.entity.User;
import com.coalvalue.employee.enumType.EmployeeStatusEnum;
import com.coalvalue.employee.repository.EmployeeRepository;

import com.coalvalue.employee.repository.MenuRepository;
import com.coalvalue.employee.repository.UserRepository;
import com.coalvalue.employee.service.MenuService;
import com.coalvalue.employee.service.PermissionService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import role.MenuGrpc;
import role.MenuOuterClass;


import java.util.*;

//import org.lognet.springboot.grpc.GRpcService;

@GrpcService
//@GRpcService
	// 实现 定义一个实现服务接口的类
	public class MenuAttenceImpl extends MenuGrpc.MenuImplBase {

	@Autowired
	private PermissionService permissionService;

	@Autowired
	private MenuService menuService;
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private UserRepository userRepository;



	private MenuOuterClass.MenuItem getSubMenus(MenuNode menuNode) {
		List<MenuOuterClass.MenuItem> childs = new ArrayList<>();


		MenuOuterClass.MenuItem.Builder menuItemBuilder = MenuOuterClass.MenuItem.newBuilder();
		menuItemBuilder.setMenuname(menuNode.getCurrent().getMenuName())
				.setMenucode(menuNode.getCurrent().getId()+"")
				.setSeq(menuNode.getCurrent().getMenuSeq()+"");
			//	.addAllMenuchild(_childs.getMenuchildList());


		for (MenuNode menuNode_ : menuNode.getChilds()) {

				MenuOuterClass.MenuItem _childs = getSubMenus(menuNode_);
				childs.add(menuItemBuilder.build());

		}
		menuItemBuilder.addAllMenuchild(childs);
		return menuItemBuilder.build();
	}




		@Override
		public void menu(MenuOuterClass.Request req, StreamObserver<MenuOuterClass.Reply> responseObserver) {
			System.out.println("service:"+req.getId());
			//User user = userRepository.findByUserId(req.getId());

				MenuNode employeeMenus = menuService.queryHierarchyUserMenus(Integer.valueOf(req.getId()));

				MenuOuterClass.MenuItem menuNodes = getSubMenus(employeeMenus);





			MenuOuterClass.Reply.Builder reply = MenuOuterClass.Reply.newBuilder();


				reply.setMenuItem(menuNodes);



			responseObserver.onNext(reply.build());
			responseObserver.onCompleted();
		}





}