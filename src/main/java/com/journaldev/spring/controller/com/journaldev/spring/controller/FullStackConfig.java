package com.journaldev.spring.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;



@Configuration
@EnableWebMvc
@ComponentScan({"com.journaldev.spring.controller"})
public class FullStackConfig extends WebMvcConfigurerAdapter{
	
	@Bean
	public InternalResourceViewResolver viewResolver(){
		InternalResourceViewResolver rv = new InternalResourceViewResolver();
		rv.setPrefix("/WEB-INF/views/");
		rv.setSuffix(".jsp");
		return rv;		
	}
}