package com.example.antipattern.bad;

public class BasePrinter {
	
	public void print() {
		this.init();
	}
	
	protected void init() {
		System.out.println("init printer device ... done!");
	}
	
}
