package smbms.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.smbms.entity.Provider;
import cn.smbms.sevice.ProviderService;

class ProviderTest {

	@Test
	void test() {
		ApplicationContext  context = new  ClassPathXmlApplicationContext("beans.xml");
		Provider  provider = new Provider();
		provider.setProCode("ceshi002");
		provider.setProName("ceshi");
		provider.setProDesc("ceshi003");
		provider.setProContact("ceshi001");
		provider.setProPhone("1233321");
		provider.setProAddress("≤‚ ‘µÿ÷∑");
		provider.setProFax("0755-67776212");
		provider.setCreatedBy("1");
		provider.setCreationDate("2018-8-6");
		 ProviderService   proSer =    (ProviderService) context.getBean("providerServiceImpl");
		 proSer.add(provider);
	}
	
	@Test
	void test_01() {
		ApplicationContext  context = new  ClassPathXmlApplicationContext("beans.xml");
		Provider  provider = new Provider();
		provider.setProCode("ceshi002");
		provider.setProName("ceshi");
		provider.setProDesc("ceshi003");
		provider.setProContact("ceshi001");
		provider.setProPhone("1233321");
		provider.setProAddress("≤‚ ‘µÿ÷∑");
		provider.setProFax("0755-67776212");
		provider.setCreatedBy("1");
		provider.setCreationDate("2018-8-6");
		provider.setId(20);
		 ProviderService   proSer =    (ProviderService) context.getBean("providerServiceImpl");
		 proSer.add(provider);
	}

}
