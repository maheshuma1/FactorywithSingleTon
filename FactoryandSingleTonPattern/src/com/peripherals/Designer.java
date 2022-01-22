package com.peripherals;

public class Designer implements HandBagInterface{

	@Override
	public void specifications(String str) {
		if(str.equals("Chain")) {
			System.out.println("with customized handle");
		}else if(str.equals("Pocket")) {
			System.out.println("for Gents and college women");
		}else {
			System.out.println("with quality and treanding");
		}
	}
}