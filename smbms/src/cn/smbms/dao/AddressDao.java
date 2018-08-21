package cn.smbms.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.smbms.entity.Address;
public interface AddressDao {
	/**
	 * ��ѯ������Ϣ
	 * 
	 * @return
	 */
	List<Address> fandForAdderss();

	/**
	 * ������ַ��Ϣ
	 * 
	 * @param addre
	 * @return
	 */
	int add(Address addre);

	/**
	 * ����id�޸���Ϣ
	 * 
	 * @param addrs
	 * @return
	 */
	int update(Address addrs);

	/**
	 * ����idɾ����Ϣ
	 * 
	 * @param id
	 * @return
	 */
	int delById(int id);

}
