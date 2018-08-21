package cn.smbms.sevice;
/**
 * 用户服务层
 * @author liusheng
 *
 */
public interface UserService {

	/**
	 * 验证用户登录
	 * @param name
	 * @param pwd
	 * @return
	 */
	int  loginForUser(String name, String  pwd);

		
	

}
