package com.peripherals;

public class Handmade implements HandBagInterface{

	@Override
	public void specifications(String str) {
		if(str.equals("Printable")) {
			System.out.println("Customized Emibroidered");
		}else if(str.equals("Fabric")) {
			System.out.println("Parallel handles that emerge from the sides of its pouch.");
		}else {
			System.out.println("Plain-woven fabric typically made out of cotton and, to a lesser extent");
		}
	}
}