package com.ni.spring.setter;
import java.util.Date;
public class WishMessageGenerator {
	Date date;
	WishMessageGenerator(){
		System.out.println("0-param Constructor");
	}
	
	public void setDate(Date dateobj) {
		System.out.println("setter injection");
		this.date=dateobj;
	}
	
	public String wishMessage(String name) {
		System.out.println("Bussiness logic method");
		int hour=date.getHours();
		if(hour<=12)
			return "GM :"+name;
		else if(hour<=16)
			return "GA "+name;
		else if(hour<=20)
			return "GE :"+name;
		else
			return "GN :"+name;
	}
}
