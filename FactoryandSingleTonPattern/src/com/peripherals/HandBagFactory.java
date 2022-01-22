package com.peripherals;

public class HandBagFactory {

	public HandBagInterface getInstance(String str) {
		if(str.equals("Type")) {
			return new Type() ;
		}else if(str.equals("Model")) {
			return new CrossBody();
		}else if (str.equals("Fabric")) {
			return new Handmade();
		}else {
			return new Designer();
		}
	}
}