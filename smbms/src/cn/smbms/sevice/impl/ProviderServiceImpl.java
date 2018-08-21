package cn.smbms.sevice.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.smbms.dao.ProviderDao;
import cn.smbms.entity.Provider;
import cn.smbms.sevice.ProviderService;
@Service
public class ProviderServiceImpl  implements ProviderService {
	
	@Autowired
	private   ProviderDao   providerDao;
	@Transactional
	@Override
	public void add(Provider provider) { 
		providerDao.add(provider);
		providerDao.del(provider.getId());
	}

}
