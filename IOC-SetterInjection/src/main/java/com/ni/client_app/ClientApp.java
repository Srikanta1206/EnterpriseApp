package com.ni.client_app;


import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ni.spring.setter.WishMessageGenerator;
public class ClientApp {

	public static void main(String[] args) {
		//locate and hold file .Internak uses java.io.File
		/*FileSystemResource frs=new FileSystemResource("src/main/java/com/ni/cfg/file/ApplicationContext.xml");
		//Create spring Container(IOC Container)
		XmlBeanFactory factory=new XmlBeanFactory(frs);
		Object obj=factory.getBean("wmg");
		WishMessageGenerator wmg1=(WishMessageGenerator)obj;
		String result=wmg1.wishMessage("Srikanta Kumar Sabata");
		System.out.println(result);*/
		
		try {
			FileSystemXmlApplicationContext container=
											new FileSystemXmlApplicationContext("src/main/java/com/ni/cfg/file/ApplicationContext.xml");
			WishMessageGenerator message=(WishMessageGenerator)container.getBean("wmg");
			String res=message.wishMessage("Srikanta Sabata");
			System.out.println(res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
