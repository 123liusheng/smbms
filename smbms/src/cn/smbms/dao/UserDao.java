package cn.smbms.dao;
/**
 * �û�Dao�ӿ�
 * @author liusheng
 *
 */
public interface UserDao {
	
	
		/**
		 * ��֤�û���¼
		 * @param name
		 * @param pwd
		 * @return
		 */
		int  loginForUser(String name, String  pwd);
	

}
