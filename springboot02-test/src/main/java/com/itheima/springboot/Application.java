package com.itheima.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 * @author Alen
 *
 */
@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		//运行springboot应用
		//方式一:此方法会输出spring的横幅
		//SpringApplication.run(Application.class, args);
		//方式二:将横幅关闭
		SpringApplication springApplication=new SpringApplication(Application.class);
		//设置关闭横幅
		springApplication.setBannerMode(Banner.Mode.OFF);
		//运行
		springApplication.run(args);
	}
}
