package cn.smbms.sevice;

import java.util.List;

import cn.smbms.entity.Role;

/**
 * �û���ɫ�߼���
 * @author liusheng
 *
 */
public interface RoleService {
	
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
