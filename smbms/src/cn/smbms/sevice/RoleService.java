package cn.smbms.sevice;

import java.util.List;

import cn.smbms.entity.Role;

/**
 * 用户角色逻辑层
 * @author liusheng
 *
 */
public interface RoleService {
	
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
