package cn.smbms.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cn.smbms.entity.Address;

public class AddressRowMapper   implements RowMapper<Address>  {

	@Override
	public Address mapRow(ResultSet rs, int arg1) throws SQLException {
		Address   address = new Address();
		address.setAddressDesc(rs.getString("addressDesc"));
		address.setContact(rs.getString("contact"));
		address.setCreatedBy(rs.getString("createdBy"));
		address.setCreationDate(rs.getString("creationDate"));
		address.setModifyDate("modifyDate");
		address.setId(rs.getInt("id"));
		address.setModifyBy(rs.getString("modifyBy"));
		address.setPostCode(rs.getString("postCode"));
		address.setTel(rs.getString("tel"));
		address.setUserId(rs.getString("userId"));
		return address;
	}

}
