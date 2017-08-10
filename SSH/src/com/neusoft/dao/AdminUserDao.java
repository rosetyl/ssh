package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.AdminUser;

public interface AdminUserDao {
	public void saveAdminUser(AdminUser adminUser);
	public void updateAdminUser(AdminUser adminUser);
	public void deleteAdminUser(int id);
	public List<AdminUser> findAdminUserList();
	
}
