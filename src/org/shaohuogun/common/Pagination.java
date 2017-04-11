package org.shaohuogun.common;

import java.util.List;

public class Pagination {

	public static final int DEFAULT_PAGE_SIZE = 10;

	private int total;

	private int pageSize = DEFAULT_PAGE_SIZE;

	private int pageCount;

	private int pageIndex;

	private List<Model> objects;

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPageSize() {
		return pageSize;
	}
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getPageCount() {
		pageCount = (total + pageSize - 1) / pageSize;
		return pageCount;
	}

	public int getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}

	public List<Model> getObjects() {
		return objects;
	}

	public void setObjects(List<Model> objects) {
		this.objects = objects;
	}

}
