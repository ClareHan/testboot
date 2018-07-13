package com.hcl.boot.proj;

import java.io.Serializable;

public class User implements Serializable{

		private static final long serialVersionUID = 1L;

		//@FCMapping(column = "id")
		private int id;

		//@FCMapping(column = "username", comment = "用户名")
		private String username = "";

		//@FCMapping(column = "password", comment = "用户密码")
		private String password = "";

		//@FCMapping(column = "realname", comment = "真实姓名")
		private String realname = "";

		//@FCMapping(column = "phone", comment = "手机号码")
		private String phone = "";

		//@FCMapping(column = "email", comment = "邮箱")
		private String email = "";

		//@FCMapping(column = "openid", comment = "公众号openid，注意不是开放平台的openid")
		private String openid = "";

		//@FCMapping(column = "weixinname", comment = "微信昵称")
		private String weixinname = "";

		//@FCMapping(column = "unionid", comment = "联合id")
		private String unionid = "";

		//@FCMapping(column = "birthday", comment = "生日")
		private String birthday = "";

		//@FCMapping(column = "headicon", comment = "头像")
		private String headicon = "";

		//@FCMapping(column = "createtime", comment = "创建时间")
		private String createtime = "";

		//@FCMapping(column = "updatetime", comment = "修改时间")
		private String updatetime = "";

		//@FCMapping(column = "authphone", comment = "认证手机号")
		private int authphone;

		//@FCMapping(column = "authemail", comment = "认证邮箱")
		private int authemail;

		//@FCMapping(column = "authopenid", comment = "认证微信号")
		private int authopenid;

		//@FCMapping(column = "enabled", comment = "是否可用")
		private int enabled = 1;

		private int unreadNum;//未读消息数目

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRealname() {
			return realname;
		}

		public void setRealname(String realname) {
			this.realname = realname;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getOpenid() {
			return openid;
		}

		public void setOpenid(String openid) {
			this.openid = openid;
		}

		public String getWeixinname() {
			return weixinname;
		}

		public void setWeixinname(String weixinname) {
			this.weixinname = weixinname;
		}

		public String getUnionid() {
			return unionid;
		}

		public void setUnionid(String unionid) {
			this.unionid = unionid;
		}

		public String getBirthday() {
			return birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public String getHeadicon() {
			return headicon;
		}

		public void setHeadicon(String headicon) {
			this.headicon = headicon;
		}

		public String getCreatetime() {
			return createtime;
		}

		public void setCreatetime(String createtime) {
			this.createtime = createtime;
		}

		public String getUpdatetime() {
			return updatetime;
		}

		public void setUpdatetime(String updatetime) {
			this.updatetime = updatetime;
		}

		public int getAuthphone() {
			return authphone;
		}

		public void setAuthphone(int authphone) {
			this.authphone = authphone;
		}

		public int getAuthemail() {
			return authemail;
		}

		public void setAuthemail(int authemail) {
			this.authemail = authemail;
		}

		public int getAuthopenid() {
			return authopenid;
		}

		public void setAuthopenid(int authopenid) {
			this.authopenid = authopenid;
		}

		public int getEnabled() {
			return enabled;
		}

		public void setEnabled(int enabled) {
			this.enabled = enabled;
		}

		public int getUnreadNum() {
			return unreadNum;
		}

		public void setUnreadNum(int unreadNum) {
			this.unreadNum = unreadNum;
		}
		
}
