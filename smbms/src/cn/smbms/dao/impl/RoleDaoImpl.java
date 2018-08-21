package cn.smbms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import cn.smbms.entity.Role;
import cn.smbms.dao.RoleDao;
import cn.smbms.dao.RoleRowMapper;

@Repository
public class RoleDaoImpl implements RoleDao {
	
	@Autowired
	private JdbcTemplate  jdbcTemplate;
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Role> selbyName(String name) {
		String sql = "select * from smbms_role where  roleCode LIKE  concat('%','"+name+"','%') ";
		return   jdbcTemplate.query(sql, new RoleRowMapper());
	}


	@Override
	public void add(Role role) {
		String sql = "INSERT INTO `smbms_role` (`roleCode`,`roleName`,`createdBy`,`creationDate`)\r\n" + 
							"VALUES(?,?,?,?) ";
		jdbcTemplate.update(sql,role.getRoleCode(),role.getRoleName(),role.getCreatedBy(),role.getCreationDate());
	}

}
