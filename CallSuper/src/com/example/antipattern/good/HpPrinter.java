package com.example.antipattern.good;

public class HpPrinter extends BasePrinter {
	
	protected void postPrint() {
		System.out.println("printing ... done!");	
	}

}
