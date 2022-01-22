package com.peripherals;

public class CrossBody implements HandBagInterface{

	@Override
	public void specifications(String str) {
		if(str.equals("Rectangle")) {
			System.out.print("with Modernistic Design");
		}else if (str.equals("Oval")) {
			System.out.print("with Stylish model");
		}else {
			System.out.println("with Regular fit");
		}
	}
}