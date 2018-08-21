package smbms.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.entity.Role;
import cn.smbms.sevice.RoleService;

public class RoleTest {
	
	@org.junit.Test
	public void Test() {
		ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		RoleService  roleSer = (RoleService) context.getBean("roleServiceImpl");
		Role  role = new Role();
		role.setRoleCode("ceshi");
		role.setRoleName("ceshi001");
		role.setCreatedBy("2");
		role.setCreationDate("2018-7-8");
		roleSer.add(role);
	}
	
	@org.junit.Test
	public void Test_01() {
		ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		RoleService  roleSer = (RoleService) context.getBean("roleServiceImpl");
		List<Role> list =   roleSer.selbyName("ce");
		for (Role role : list) {
			System.out.println(role);
		}
		
	}

}
