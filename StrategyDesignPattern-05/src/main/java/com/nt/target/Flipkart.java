package com.nt.target;

import java.util.Arrays;
import java.util.Random;

import com.nt.dependent.Courier;

public class Flipkart {
	
	//rule 1:favor composition(HAS-A RELATION) over inheritance
	private Courier courier;
	private Courier courier1;
	
	public void setCourier(Courier courier) {
		this.courier=courier;
	}
	
	public void setCourier1(Courier courier) {
		this.courier1=courier;
	}
	public String shopping(String[] item,double[] price) {
		//generate the order id number
		int oId=new Random().nextInt(1000000, 99999999);
		String message=courier.deliver(oId);
		double billAmt=0.0;
		//calculate all the item price
		for(int i=0;i<item.length;i++)
			billAmt+=price[i];
		return message+":"+Arrays.toString(item)+" are items"+Arrays.toString(price)+" price of item and total billAmount is :"+billAmt;		
	}
}
