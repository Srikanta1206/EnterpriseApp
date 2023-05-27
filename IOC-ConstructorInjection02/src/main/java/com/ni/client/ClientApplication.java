package com.ni.client;
import com.ni.src.WishMessageGenerator;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ClientApplication {

	public static void main(String[] args) {
		ClassPathResource resource=new ClassPathResource("com/text/java/ApplicationContext.xml");
		XmlBeanFactory factory=new XmlBeanFactory(resource);//depricated container is created
		WishMessageGenerator message=(WishMessageGenerator)factory.getBean("wmg");
		String display=message.wishMessage("Srikanta");
		System.out.println(display);
	}
}
