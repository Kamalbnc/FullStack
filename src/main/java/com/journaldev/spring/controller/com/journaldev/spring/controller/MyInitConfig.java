package com.journaldev.spring.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class MyInitConfig extends
		AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Called getServletConfigClasses() method");
	return new Class[]{FullStackConfig.class};	
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Called getServletMappings() method");
		return new String[]{"/"};
	}
}
