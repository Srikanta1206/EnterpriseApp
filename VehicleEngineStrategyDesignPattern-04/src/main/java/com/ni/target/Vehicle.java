package com.ni.target;

import com.ni.dependent.Engine;

public class Vehicle {
	//composition(HAS-A RELATION)
	Engine engine;
	
	public void setEngine(Engine engine) {
		this.engine=engine;
	}
	
	public void journey(String begin,String end) {
		String start=engine.start();
		System.out.println(start);
		System.out.println("Journry begins from  :"+begin);
		System.out.println("---------------------");
		System.out.println("Journey ends at   :"+end);
		System.out.println(engine.stop());
	}
}
