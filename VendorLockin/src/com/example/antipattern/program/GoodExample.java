package com.example.antipattern.program;

import com.example.antipattern.program.printer.GenericPrinterModule;
import com.example.antipattern.program.printer.impl.VendorPrinterModuleImpl;

public class GoodExample {

	public static void main(String[] args) {
		
		// Istanzia il modulo di stampa specifico del vendor (isolation layer),
		// che implementa l'interfaccia generica
		GenericPrinterModule module = new VendorPrinterModuleImpl();
		
		String path = "/tmp/output.pdf";
		String printerName = "Lexmark XYZ";
		byte[] buffer = getBufferToPrint();
		
		// Utilizza il modulo passando per lo strato di isolation layer
		// Se il vendor cambia le firme dei metodi, basta intervenire sull'implemetazione specifica per il vendor stesso,
		// lasciando inalterato il resto del programma
		module.printToPdf(buffer, path);
		module.printToPrinter(buffer, printerName);
	}
	
	// Restituisce array di byte da stampare ....
	public static byte[] getBufferToPrint() {
		String buffer = "abcdef";
		return buffer.getBytes();
	}

}
