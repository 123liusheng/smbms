package smbms.test;


import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.dao.AddressDao;
import cn.smbms.entity.Address;
import cn.smbms.sevice.AddressService;

class AddressTest {

	@Test
	 public void test_01() {
		ApplicationContext  context = new  ClassPathXmlApplicationContext("beans.xml");
		AddressService  addDao = (AddressService) context.getBean("addressServiceImpl");
		 List<Address>  list =  addDao.fandForAdderss();
		 for (Address address : list) {
			System.out.println(address);
		}
	}
	
	@Test
	 public void test_02() {
		ApplicationContext  context = new  ClassPathXmlApplicationContext("beans.xml");
		AddressService  addDao = (AddressService) context.getBean("addressServiceImpl");		Address   address = new Address();
		address.setAddressDesc("北京市朝阳区朝阳门南大街14号");
		address.setContact("測試");
		address.setCreatedBy("1");
		address.setCreationDate("2016-04-13");
		address.setModifyDate("2016-04-15");
		address.setId(7);
		address.setModifyBy("3");
		address.setPostCode("2016-04-15");
		address.setTel("13568902323");
		address.setUserId("2");
		 int  count =  addDao.add(address);
		System.out.println(count);
	}
	
	@Test
	 public void test_03() {
		ApplicationContext  context = new  ClassPathXmlApplicationContext("beans.xml");
		AddressService  addDao = (AddressService) context.getBean("addressServiceImpl");		
		Address   address = new Address();
		address.setAddressDesc("北京市朝阳区朝阳门南大街14号");
		address.setContact("ceshi");
		address.setCreatedBy("1");
		address.setCreationDate("2016-04-13");
		address.setModifyDate("2016-04-15");
		/*address.setId(rs.getInt("id"));*/
		address.setModifyBy("3");
		address.setPostCode("2016-04-15");
		address.setTel("13568902323");
		address.setUserId("2");
		 int  count =  addDao.add(address);
		System.out.println(count);
	}
	
	@Test
	 public void test_04() {
		ApplicationContext  context = new  ClassPathXmlApplicationContext("beans.xml");
		AddressService  addDao = (AddressService) context.getBean("addressServiceImpl");
		int  count =  addDao.delById(3);
		System.out.println(count);
	}


}
