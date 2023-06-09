package com.nt.dependent;

public final class DHL implements Courier {

	public DHL() {
		System.out.println("0-param-constructor ::DHL");
	}
	@Override
	public String deliver(int oId) {
		return oId+" Deliver Successful";
	}
}
