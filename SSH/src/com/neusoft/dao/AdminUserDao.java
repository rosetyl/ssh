package com.neusoft.dao;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.page.Page;

public interface AdminUserDao {
	public void saveAdminUser(AdminUser adminUser);
	public void updateAdminUser(AdminUser adminUser);
	public void deleteAdminUser(int id);
	public Page findAdminUserList(int currentPage,int pageSize);
	
}
