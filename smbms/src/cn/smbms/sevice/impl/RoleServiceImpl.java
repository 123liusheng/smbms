package cn.smbms.sevice.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.RoleDao;
import cn.smbms.entity.Role;
import cn.smbms.sevice.RoleService;
@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleDao  roleDaoImpl;
	

	@Override
	public List<Role> selbyName(String name) {
		return roleDaoImpl.selbyName(name);
	}
	
	@Transactional
	@Override
	public void add(Role role) {
		roleDaoImpl.add(role);
	}

}
