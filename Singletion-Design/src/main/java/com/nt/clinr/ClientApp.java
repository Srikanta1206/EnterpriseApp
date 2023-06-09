package com.nt.clinr;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import nit.singleton_Design.Printer;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfg/applicationContext.xml");
		
		Printer p1=factory.getBean("s1",Printer.class);
		Printer p2=factory.getBean("s2",Printer.class);
		
		
		
		System.out.println(p1.hashCode()+" "+p2.hashCode());

		System.out.println(p1.hashCode()==p2.hashCode());
	}
}
