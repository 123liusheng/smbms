package cn.smbms.sevice;

import java.util.List;

import cn.smbms.entity.Address;

public interface AddressService {
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
