package com.yueqian.boot_demo.common;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
@WebListener
public class MyListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext被初始化了.....");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContext被销毁了.....");
	}
}
