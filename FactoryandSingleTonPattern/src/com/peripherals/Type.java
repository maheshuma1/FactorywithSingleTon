package com.peripherals;

public class Type implements HandBagInterface{

	@Override
	public void specifications(String Type) {

		if(Type.equals("Handmade")) {
			System.out.print("with Decorative");
		}else if (Type.equals("CrossBody")) {
			System.out.print("for Trendy people");
		}else if(Type.equals("Designer")) {
			System.out.println("with latest Design and Quality");
		}else {
			System.out.println("with low or moderate Cost");			
		}
	}
}