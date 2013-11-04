package com.example.antipattern.program.printer;

// Interfaccia generica di stampa
public interface GenericPrinterModule {
	
	public void printToPdf(byte[] buffer, String path);
	
	public void printToPrinter(byte[] buffer, String printerName);
	
}
