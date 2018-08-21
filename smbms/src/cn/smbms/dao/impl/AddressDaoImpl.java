package cn.smbms.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.AddressDao;
import cn.smbms.dao.AddressRowMapper;
import cn.smbms.entity.Address;

@Repository
public class AddressDaoImpl implements  AddressDao  {
	
	@Autowired
	private  JdbcTemplate   jdbcTemplate;
	
	@Override
	public List<Address> fandForAdderss() {
		String sql = "select * from smbms_address";
		return jdbcTemplate.query(sql,  new  AddressRowMapper());
	}

	@Override
	public int add(Address addre) {
		String  sql = "INSERT INTO `smbms_address` (`contact`,`addressDesc`,`postCode`,`tel`,`createdBy`,`creationDate`,`modifyBy`,`modifyDate`,`userId`)\r\n" + 
								"VALUES (?,?,?,?,?,?,?,?,?)";
		return jdbcTemplate.update(sql, addre.getContact(),addre.getAddressDesc(),addre.getPostCode(),addre.getTel(),
													addre.getCreatedBy(),addre.getCreationDate(),addre.getModifyBy(),addre.getModifyDate(),addre.getUserId());
	}
	
	@Transactional
	@Override
	public int update(Address addre) {
		String sql = "UPDATE `smbms_address`  \r\n" + 
				"SET `contact` = ?,`addressDesc` = ?,`postCode` = ?,\r\n" + 
				"	`tel` = ?,`createdBy` = ?,`creationDate` = ?,`modifyBy` = ?,`modifyDate` = ?,`userId` = ?\r\n" + 
				"WHERE `id` = ? ";
		return jdbcTemplate.update(sql, addre.getContact(),addre.getAddressDesc(),addre.getPostCode(),addre.getTel(),
				addre.getCreatedBy(),addre.getCreationDate(),addre.getModifyBy(),addre.getModifyDate(),addre.getUserId(),addre.getId());
	}

	@Override
	public int delById(int id) {
		String sql = "delete from  smbms_address  where id = ?";
		return jdbcTemplate.update(sql,id);
	}

}
