package com.Baseclass;

public class PojoB {

	public static void main(String[] args) {

		PojoA a = new PojoA();
		System.out.println(a.getI());

		a.setI(20);
		System.out.println(a.getI());

		System.out.println(a.getName());// here string default vale

		a.setName("Lakshmi");  // string set value
		System.out.println(a.getName());
	}

}
