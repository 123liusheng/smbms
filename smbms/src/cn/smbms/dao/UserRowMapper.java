package cn.smbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.smbms.entity.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public   User  mapRow(ResultSet rs, int arg1) throws SQLException {
		User  user = new  User();
		user.setId(rs.getInt("id"));
		user.setUserCode(rs.getString("userCode"));
		user.setUserName(rs.getString("userName"));
		user.setUserPassword(rs.getString("userPassword"));
		user.setGender(rs.getInt("gender"));
		user.setBirthday(rs.getString("birthday"));
		user.setPhone(rs.getString("phone"));
		user.setAddress(rs.getString("address"));
		user.setUserRole(rs.getInt("userRole"));
		user.setCreatedBy(rs.getInt("createdBy"));
		user.setCreationDate(rs.getString("creationDate"));
		user.setModifyBy(rs.getInt("modifyBy"));
		user.setModifyDate(rs.getString("modifyDate"));
		return user;
	}

}
