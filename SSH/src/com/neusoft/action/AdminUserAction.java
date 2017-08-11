package com.neusoft.action;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.page.Page;
import com.neusoft.service.AdminUserService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserAction extends ActionSupport{
	//需要调用业务逻辑层的接口
	private AdminUserService adminUserService;
	private int id;
	private String username;
	private String password;
	//当前的页
	private int currentPage=1;
	//每页显示的数量
	private int pageSize=5;
	//用来接收查找到的数据
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
	//提供一个set方法进行注入
	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}

	@Override
	public String execute() throws Exception {
		//调用业务逻辑层的接口查找所有管理员的方法
		page = adminUserService.findAdminUserList(currentPage,pageSize);
		return SUCCESS;
	}

	//注册的方法
	public String register(){
		AdminUser adminUser = new AdminUser();
		adminUser.setUsername(username);
		adminUser.setPassword(password);
		adminUserService.saveAdminUser(adminUser);
		return SUCCESS;
	}
	
	//通过id查找管理的信息
	public String findAdminById(){
		return password;
		
	}
}
