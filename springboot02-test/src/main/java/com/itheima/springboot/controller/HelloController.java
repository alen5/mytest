package com.itheima.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller//表名返回值是json的controller,是responseBody和controller的组合
public class HelloController {
	@Autowired
	private Environment environment;
	/*@Value("${name}")
	private String name;
	@Value("${url}")
	private String url;*/
	@GetMapping("/hello")
	public String sayHello(){
		System.out.println("公司名称:"+environment.getProperty("name"));
		System.out.println("公司网址:"+environment.getProperty("url"));
		//System.out.println("公司名称:"+name);
		//System.out.println("公司网址:"+url);
		return "Hello World!";
	}
	
	@GetMapping("/user")
	public String user(){
		return "/html/user.html";
	}
}
