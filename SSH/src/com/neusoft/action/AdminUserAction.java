package com.neusoft.action;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.page.Page;
import com.neusoft.service.AdminUserService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserAction extends ActionSupport{
	//��Ҫ����ҵ���߼���Ľӿ�
	private AdminUserService adminUserService;
	private int id;
	private String username;
	private String password;
	//��ǰ��ҳ
	private int currentPage=1;
	//ÿҳ��ʾ������
	private int pageSize=5;
	//�������ղ��ҵ�������
	private Page page;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public AdminUserService getAdminUserService() {
		return adminUserService;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
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
	//�ṩһ��set��������ע��
	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}

	@Override
	public String execute() throws Exception {
		//����ҵ���߼���Ľӿڲ������й���Ա�ķ���
		page = adminUserService.findAdminUserList(currentPage,pageSize);
		return SUCCESS;
	}

	//ע��ķ���
	public String register(){
		AdminUser adminUser = new AdminUser();
		adminUser.setUsername(username);
		adminUser.setPassword(password);
		adminUserService.saveAdminUser(adminUser);
		return SUCCESS;
	}
	
	//ͨ��id���ҹ������Ϣ
	public String findAdminById(){
		return password;
		
	}
}
