package com.example.antipattern.good;

public abstract class BasePrinter {
	
	public void print() {
		this.init();
		this.postPrint();
	}
	
	protected abstract void postPrint();

	protected void init() {
		System.out.println("init printer device ... done!");
	}
	
}
