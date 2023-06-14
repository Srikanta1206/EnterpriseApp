package com.client;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.ni.dependent.PetrolEngine;
import com.ni.target.Vehicle;

public class ClientApp {

	public static void main(String[] args) {
		
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/ni/bean/ApplicationContext.xml");
		Vehicle pe=factory.getBean("v",Vehicle.class);
		pe.journey("Dengadi","Berhampur");
		
	}
}
