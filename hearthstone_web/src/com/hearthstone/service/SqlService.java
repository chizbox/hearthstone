package com.hearthstone.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hearthstone.dao.MainListDAO;

public class SqlService {
	private ApplicationContext ctx;
	private MainListDAO mainList;

	public SqlService() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"/appcon.xml");
		mainList = (MainListDAO) ctx.getBean("MainListDAO");
	}

	public static void main(String[] args) {
		SqlService myService = new SqlService();
		myService.mainList.getCards();
	}

	public ApplicationContext getCtx() {
		return ctx;
	}

	public void setCtx(ApplicationContext ctx) {
		this.ctx = ctx;
	}

	public MainListDAO getMainList() {
		return mainList;
	}

	public void setMainList(MainListDAO mainList) {
		this.mainList = mainList;
	}
}
