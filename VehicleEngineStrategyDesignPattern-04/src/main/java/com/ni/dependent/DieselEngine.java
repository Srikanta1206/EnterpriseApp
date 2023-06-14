package com.ni.dependent;

public final class DieselEngine implements Engine{

	@Override
	public String start() {
		return "start engine";
	}
	
	public String stop() {
		return "stop engine";
	}
}
