package cn.smbms.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.smbms.entity.Address;
public interface AddressDao {
	/**
	 * 查询所有信息
	 * 
	 * @return
	 */
	List<Address> fandForAdderss();

	/**
	 * 新增地址信息
	 * 
	 * @param addre
	 * @return
	 */
	int add(Address addre);

	/**
	 * 根据id修改信息
	 * 
	 * @param addrs
	 * @return
	 */
	int update(Address addrs);

	/**
	 * 根据id删除信息
	 * 
	 * @param id
	 * @return
	 */
	int delById(int id);

}
