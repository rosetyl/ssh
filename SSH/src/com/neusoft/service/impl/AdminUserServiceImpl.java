package com.neusoft.service.impl;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.dao.AdminUserDao;
import com.neusoft.service.AdminUserService;

public class AdminUserServiceImpl implements AdminUserService{
	//ҵ���߼���������ݳ־ò�Ľӿ�
	private AdminUserDao adminUserDao;
	//�ṩһ��set��������ע��
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
		//�������ݳ־ò��findAdminUserList����
		List<AdminUser> ls = adminUserDao.findAdminUserList();
		return ls;
	}
	

}
