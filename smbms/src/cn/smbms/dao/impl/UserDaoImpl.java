package cn.smbms.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.smbms.dao.AddressRowMapper;
import cn.smbms.dao.UserDao;
import cn.smbms.dao.UserRowMapper;
import cn.smbms.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	
	@Autowired
	private  JdbcTemplate   jdbcTemplate;
	

	@Override
	public int loginForUser(String name, String pwd) {
		
		String sql = "select * from smbms_address   where   userName = "+name+"   and   userPassword = "+pwd+"  ";
		User  user = (User) jdbcTemplate.query(sql,  new  UserRowMapper());
		int count = 0;
		if(user != null) {
			count = 1;
		}
		return count;
	}

}
