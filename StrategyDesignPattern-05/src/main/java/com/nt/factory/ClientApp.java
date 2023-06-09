package com.nt.factory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.target.Flipkart;

public class ClientApp {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=
						new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/pattern/applicationContext.xml");
		Flipkart f1=factory.getBean("f1",Flipkart.class);
		String result=f1.shopping(new String[] {"shirt"}, new double[] {589});
		System.out.println(result);
		//	XmlBeanDefinitionReader reader1=new XmlBeanDefinitionReader(factory);

	}

}
