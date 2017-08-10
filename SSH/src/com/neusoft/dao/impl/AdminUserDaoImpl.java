package com.neusoft.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.neusoft.bean.AdminUser;
import com.neusoft.dao.AdminUserDao;

public class AdminUserDaoImpl implements AdminUserDao{
	private SessionFactory sessionFactory;
	
	//提供一个set方法进行注入
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	//得到session的方法
	public Session getSession(){
		Session session =  sessionFactory.getCurrentSession();
		return session;
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
		Query query = getSession().createQuery("from AdminUser");
		return query.list();
	}
	
}
