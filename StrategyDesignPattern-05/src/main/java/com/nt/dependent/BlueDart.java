package com.nt.dependent;

public final class BlueDart implements Courier {

	public BlueDart() {
		System.out.println("0 param constructor ::blueDart");
	}
	@Override
	public String deliver(int oId) {
		
		return oId+" Deliver Successaful";
	}

}
