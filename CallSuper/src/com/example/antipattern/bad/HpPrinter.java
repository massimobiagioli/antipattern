package com.example.antipattern.bad;

public class HpPrinter extends BasePrinter {

	@Override
	public void print() {		
		super.print();
		System.out.println("printing ... done!");
	}
	
}
