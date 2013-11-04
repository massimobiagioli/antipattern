package com.example.antipattern.program.printer.impl;

import com.example.antipattern.program.printer.GenericPrinterModule;
import com.example.antipattern.vendor.PrinterModule;

// Implementazione dell'interfaccia di stampa generica,
// specifica per il vendor
public class VendorPrinterModuleImpl implements GenericPrinterModule {
	
	private PrinterModule module;
	
	public VendorPrinterModuleImpl() {
		module = new PrinterModule();
	}
	
	@Override
	public void printToPdf(byte[] buffer, String path) {
		module.printToPdf(buffer, path);
	}

	@Override
	public void printToPrinter(byte[] buffer, String printerName) {
		module.printToPrinter(buffer, printerName);
	}

}
