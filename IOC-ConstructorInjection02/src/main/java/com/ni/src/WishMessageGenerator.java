package com.ni.src;

import java.util.Date;

public class WishMessageGenerator {
	private Date date;
	
	public WishMessageGenerator() {}
	public WishMessageGenerator(Date date) {
		this.date=date;
	}
	
	public String wishMessage(String name) {
		int hour=date.getHours();
		if(hour<12)
			return "gm::"+name;
		else if(hour<16)
			return "ga::"+name;
		else if(hour<20)
			return "ge::"+name;
		else
			return "gn::"+name;
	}
}
