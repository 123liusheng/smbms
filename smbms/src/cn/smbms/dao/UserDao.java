package cn.smbms.dao;
/**
 * 用户Dao接口
 * @author liusheng
 *
 */
public interface UserDao {
	
	
		/**
		 * 验证用户登录
		 * @param name
		 * @param pwd
		 * @return
		 */
		int  loginForUser(String name, String  pwd);
	

}
