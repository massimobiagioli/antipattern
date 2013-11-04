package com.example.antipattern.vendor;

// Modulo del Vendor
public class PrinterModule {
	
	public void printToPdf(byte[] buffer, String path) {
		System.out.println("Printing buffer to pdf: " + path);
	}
	
	public void printToPrinter(byte[] buffer, String printerName) {
		System.out.println("Printing buffer to printer: " + printerName);
	}
	
}
