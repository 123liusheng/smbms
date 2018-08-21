package cn.smbms.dao;

import java.util.List;

import cn.smbms.entity.Role;

public interface RoleDao {
	
	/**
	 * 根据姓名模糊查询
	 * @param name
	 * @return
	 */
	public List<Role>  selbyName(String name);
	
	
	/**
	 * 新增角色信息表
	 * @param role
	 */
	public void  add(Role role);

}
