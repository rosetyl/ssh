package com.neusoft.action;

import java.util.List;

import com.neusoft.bean.AdminUser;
import com.neusoft.service.AdminUserService;
import com.opensymphony.xwork2.ActionSupport;

public class AdminUserAction extends ActionSupport{
	//��Ҫ����ҵ���߼���Ľӿ�
	private AdminUserService adminUserService;
	//�������ղ��ҵ�������
	private List<AdminUser> data;
	public List<AdminUser> getData() {
		return data;
	}
	public void setData(List<AdminUser> data) {
		this.data = data;
	}
	public AdminUserService getAdminUserService() {
		return adminUserService;
	}
	//�ṩһ��set��������ע��
	public void setAdminUserService(AdminUserService adminUserService) {
		this.adminUserService = adminUserService;
	}

	@Override
	public String execute() throws Exception {
		//����ҵ���߼���Ľӿڲ������й���Ա�ķ���
		data = adminUserService.findAdminUserList();
		System.out.println(data);
		return SUCCESS;
	}


}
