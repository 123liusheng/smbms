package cn.smbms.sevice.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.smbms.dao.UserDao;
import cn.smbms.sevice.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private  UserDao  userDao;
	

	@Override
	public int loginForUser(String name, String pwd) {
		return userDao.loginForUser(name, pwd);
	}

}
