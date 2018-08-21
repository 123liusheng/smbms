package cn.smbms.dao;

import cn.smbms.entity.Provider;

/**
 * 供應商Dao
 * @author liusheng
 *
 */
public interface ProviderDao {
		/**
		 * 供應商的添加
		 * @param provider
		 */
		public void add(Provider provider);
		/**
		 * 根据id删除供应商信息
		 * @param id
		 */
		public void del(int id);

}
