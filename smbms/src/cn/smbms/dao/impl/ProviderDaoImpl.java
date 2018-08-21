package cn.smbms.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.ProviderDao;
import cn.smbms.entity.Provider;

@Repository
public class ProviderDaoImpl implements ProviderDao {
	
	
	@Autowired
	private   JdbcTemplate  jdbcTemplate;
	
	
	
	@Override
	public void add(Provider provider) {
			String sql = "INSERT INTO `smbms_provider` (`proCode`,`proName`,`proDesc`,`proContact`,`proPhone`,`proAddress`,`proFax`,`createdBy`,`creationDate`)\r\n" + 
								"VALUES(?,?,?,?,?,?,?,?,?) ";
			jdbcTemplate.update(sql,provider.getProCode(),provider.getProName(),provider.getProDesc(),provider.getProContact(),provider.getProPhone(),provider.getProAddress(),
													provider.getProFax(),provider.getCreatedBy(),provider.getCreationDate());
	}



	@Override
	public void del(int id) {
		String sql = "delete from smbms_provider where  id = ?";
		jdbcTemplate.update(sql,id);
	}

}
