package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.dao.AdminUserDao;
import com.neusoft.page.Page;
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
		adminUserDao.saveAdminUser(adminUser);
	}

	@Override
	public void updateAdminUser(AdminUser adminUser) {
		
	}

	@Override
	public void deleteAdminUser(int id) {
	
	}

	@Override
	public Page findAdminUserList(int currentPage,int pageSize){
		//调用数据持久层的findAdminUserList方法
		Page page = adminUserDao.findAdminUserList(currentPage,pageSize);
		return page;
	}
	

}
