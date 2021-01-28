package com.example.demo;

import java.io.File;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;

import com.ait.beans.WishMsgGenerator;

@SpringBootApplication
public class Sp01WishMsgApplication {
	//0-param constructor
	public Sp01WishMsgApplication() {

		System.out.println("Sp01WishMsgApplication.Sp01WishMsgApplication()");
	}

	public static void main(String[] args) {
		System.out.println("Main executed");
		SpringApplication.run(Sp01WishMsgApplication.class, args);
		
		FileSystemResource res = new FileSystemResource("src/main/java/com/ait/cfg/applicationContext.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		WishMsgGenerator bean = factory.getBean("wms", WishMsgGenerator.class);
		String result = bean.toString();
		System.out.println(result);

	}

}
