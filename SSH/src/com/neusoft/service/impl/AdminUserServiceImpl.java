package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.dao.AdminUserDao;
import com.neusoft.service.AdminUserService;

public class AdminUserServiceImpl implements AdminUserService{
	//业务逻辑层调用数据持久层的接口
	private AdminUserDao adminUserDao;
	//提供一个set方法进行注入
	public void setAdminUserDao(AdminUserDao adminUserDao) {
		this.adminUserDao = adminUserDao;
	}

	@Override
	public void saveAdminUser(AdminUser adminUser) {
	
	}

	@Override
	public void updateAdminUser(AdminUser adminUser) {
		
	}

	@Override
	public void deleteAdminUser(int id) {
	
	}

	@Override
	public List<AdminUser> findAdminUserList() {
		//调用数据持久层的findAdminUserList方法
		List<AdminUser> ls = adminUserDao.findAdminUserList();
		return ls;
	}
	

}
