package cn.smbms.entity;
/**
 * 收货信息详情
 * @author liusheng
 *
 */
public class Address  {
	
		private int  id;
			
		private String  contact;
		
		private String  addressDesc;
		
		private String  postCode;
		
		private String  tel;
		
		private String  createdBy;
		
		private String  creationDate;
		
		private String  modifyBy;
		
		private String  modifyDate;
		
		private String  userId;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getAddressDesc() {
			return addressDesc;
		}

		public void setAddressDesc(String addressDesc) {
			this.addressDesc = addressDesc;
		}

		public String getPostCode() {
			return postCode;
		}

		public void setPostCode(String postCode) {
			this.postCode = postCode;
		}

		public String getTel() {
			return tel;
		}

		public void setTel(String tel) {
			this.tel = tel;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getCreationDate() {
			return creationDate;
		}

		public void setCreationDate(String creationDate) {
			this.creationDate = creationDate;
		}

		public String getModifyBy() {
			return modifyBy;
		}

		public void setModifyBy(String modifyBy) {
			this.modifyBy = modifyBy;
		}

		public String getModifyDate() {
			return modifyDate;
		}

		public void setModifyDate(String modifyDate) {
			this.modifyDate = modifyDate;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		@Override
		public String toString() {
			return "Address [id=" + id + ", contact=" + contact + ", addressDesc=" + addressDesc + ", postCode="
					+ postCode + ", tel=" + tel + ", createdBy=" + createdBy + ", creationDate=" + creationDate
					+ ", modifyBy=" + modifyBy + ", modifyDate=" + modifyDate + ", userId=" + userId + "]";
		}
		
		
		
		
}
