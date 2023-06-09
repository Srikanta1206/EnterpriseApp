package com.ni.client_app;


import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ni.spring.setter.WishMessageGenerator;
public class ClientApp {

	public static void main(String[] args) {
		//locate and hold file .Internal uses java.io.File
		//FileSystemResource frs=new FileSystemResource("src/main/java/com/ni/cfg/file/ApplicationContext.xml");
		//Create spring Container(IOC Container)
		/*XmlBeanFactory factory=new XmlBeanFactory(frs);
		Object obj=factory.getBean("wmg");
		WishMessageGenerator wmg1=(WishMessageGenerator)obj;   //down-casting
		String result=wmg1.wishMessage("Srikanta Kumar Sabata");
		System.out.println(result);
		
		try {
			FileSystemXmlApplicationContext container=
											new FileSystemXmlApplicationContext("src/main/java/com/ni/cfg/file/ApplicationContext.xml");
			WishMessageGenerator message=(WishMessageGenerator)container.getBean("wmg");
			String res=message.wishMessage("Srikanta Sabata");
			System.out.println(res);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ni/cfg1/ApplicationContext.xml");
		WishMessageGenerator wmg1=factory.getBean("wmg", WishMessageGenerator.class);
		System.out.println(wmg1.wishMessage("Srikanta Kumar Sabata"));
	}
}
