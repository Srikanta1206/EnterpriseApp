package com.nt.dependent;

public final class DTDC implements Courier {

	public DTDC() {
		System.out.println("0-param-constructor ::DTDC");
	}
	@Override
	public String deliver(int oId) {
		return oId+" Deliver Successful";
	}

}
