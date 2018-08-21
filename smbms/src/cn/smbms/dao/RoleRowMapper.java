package cn.smbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.smbms.entity.Role;

public class RoleRowMapper   implements  RowMapper<Role>  {

	@Override
	public Role mapRow(ResultSet rs, int arg1) throws SQLException {
		Role  role = new  Role();
		role.setCreatedBy(rs.getString("createdBy"));
		role.setCreationDate(rs.getString("creationDate"));
		role.setId(rs.getInt("id"));
		role.setModifyBy(rs.getString("modifyBy"));
		role.setModifyDate(rs.getString("modifyDate"));
		role.setRoleCode(rs.getString("roleCode"));
		role.setRoleName(rs.getString("roleName"));
		return role;
	}

}
