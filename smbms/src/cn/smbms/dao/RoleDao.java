package cn.smbms.dao;

import java.util.List;

import cn.smbms.entity.Role;

public interface RoleDao {
	
	/**
	 * ��������ģ����ѯ
	 * @param name
	 * @return
	 */
	public List<Role>  selbyName(String name);
	
	
	/**
	 * ������ɫ��Ϣ��
	 * @param role
	 */
	public void  add(Role role);

}
