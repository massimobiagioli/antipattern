package com.example.antipattern;

import com.example.antipattern.bad.HpPrinter;

public class BadExample {
	
	public static void main(String[] args) {
		HpPrinter printer = new HpPrinter();
		printer.print();
	}
	
}
