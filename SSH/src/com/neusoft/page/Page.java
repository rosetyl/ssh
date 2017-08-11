package com.neusoft.page;

import java.util.List;

public class Page {
	//Ҫ��ʾ����������
	private List<?> data;
	//�ܹ���
	private int allRow;
	//ÿҳ�м�������
	private int pageSize;
	//�ܹ��м�ҳ
	private int totalPage;
	//��ǰҳ��
	private int currentPage;
	//�Ƿ�����һҳ
	private boolean hasNextPage;
	//�Ƿ�����һҳ
	private boolean hasPrePage;
	//�Ƿ��ǵ�һҳ
	private boolean isFirstPage;
	//�Ƿ������һҳ
	private boolean isLastPage;
	//ͨ�����췽����ô������������
	public Page(List<?> data){
		this.data=data;
	}
	
	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	

	public int getAllRow() {
		return allRow;
	}

	public void setAllRow(int allRow) {
		this.allRow = allRow;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage() {
		totalPage = (allRow%pageSize)==0?(allRow/pageSize):(allRow/pageSize+1);
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public boolean isHasNextPage() {
		if(currentPage==totalPage){
			return false;
		}else{
			return true;
		}
	}

	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}

	public boolean isHasPrePage() {
		if(currentPage==1){
			return false;
		}else{
			return true;
		}
	}

	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}

	public boolean isFirstPage() {
		if(currentPage==1){
			return true;
		}else{
			return false;
		}
	}

	public void setFirstPage(boolean isFirstPage) {
		this.isFirstPage = isFirstPage;
	}

	public boolean isLastPage() {
		if(currentPage==totalPage){
			return true;
		}else{
			return false;
		}
	}

	public void setLastPage(boolean isLastPage) {
		this.isLastPage = isLastPage;
	}

}
