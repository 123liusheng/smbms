package cn.smbms.dao;

import cn.smbms.entity.Provider;

/**
 * ������Dao
 * @author liusheng
 *
 */
public interface ProviderDao {
		/**
		 * �����̵����
		 * @param provider
		 */
		public void add(Provider provider);
		/**
		 * ����idɾ����Ӧ����Ϣ
		 * @param id
		 */
		public void del(int id);

}
