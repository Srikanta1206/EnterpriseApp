package com.ni.client_app;


import org.springframework.context.support.ClassPathXmlApplicationContext;
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
//		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
//		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
//		System.out.println("hello");
//		reader.loadBeanDefinitions("com/ni/cfg1/ApplicationContext.xml");
//		WishMessageGenerator wmg1=factory.getBean("wmg", WishMessageGenerator.class);
//		System.out.println(wmg1.wishMessage("Srikanta Kumar Sabata"));
		ClassPathXmlApplicationContext Class=new ClassPathXmlApplicationContext("com/ni/cfg1/ApplicationContext.xml");//ApplicationContext Container
		
	}
}
