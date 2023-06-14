package com.nt.wish;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {
	@Autowired
	@Qualifier("dt3")
	private Date date;
//	@Autowired
//	public WishMessageGenerator(@Qualifier("dt1")Date date) {
//		this.date=date;
//	}
	public void display() {
		LocalDateTime hours=LocalDateTime.now();
		int hour=hours.getHour();
		//int hour=date.getHours();
		if(hour<=12)
			System.out.println("Good Morning");
		else if(hour<=16)
			System.out.println("Good Afternoon");
		else if(hour<=20)
			System.out.println("Good Evening");
		else
			System.out.println("Good Night");
	}
}
