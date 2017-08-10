package com.neusoft.service;

import java.util.List;

import com.neusoft.bean.AdminUser;

public interface AdminUserService {
	public void saveAdminUser(AdminUser adminUser);
	public void updateAdminUser(AdminUser adminUser);
	public void deleteAdminUser(int id);
	public List<AdminUser> findAdminUserList();
}
