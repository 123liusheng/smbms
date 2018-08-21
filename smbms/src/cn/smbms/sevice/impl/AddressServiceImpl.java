package cn.smbms.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import cn.smbms.dao.AddressDao;
import cn.smbms.entity.Address;
import cn.smbms.sevice.AddressService;
@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressDao addressDaoImpl;
	

	@Override
	public List<Address> fandForAdderss() {
		return addressDaoImpl.fandForAdderss();
	}

	@Override
	public int add(Address addre) {
		return addressDaoImpl.add(addre);
	}

	@Override
	public int update(Address addrs) {
		return addressDaoImpl.update(addrs);
	}

	@Override
	public int delById(int id) {
		return addressDaoImpl.delById(id);
	}

}
