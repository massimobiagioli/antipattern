package com.example.antipattern.program;

import com.example.antipattern.vendor.PrinterModule;

public class BadExample {

	public static void main(String[] args) {
		
		// Istanzia direttamente il modulo del vendor
		PrinterModule module = new PrinterModule();
		
		String path = "/tmp/output.pdf";
		String printerName = "Lexmark XYZ";
		byte[] buffer = getBufferToPrint();
		
		// Utilizza il modulo del vendor da dentro il programma
		// Se il vendor cambia le firme dei metodi, occorre revisionare tutti i punti del programma
		// dove il modulo è stato utilizzato
		module.printToPdf(buffer, path);
		module.printToPrinter(buffer, printerName);
	}
	
	// Restituisce array di byte da stampare ....
	public static byte[] getBufferToPrint() {
		String buffer = "abcdef";
		return buffer.getBytes();
	}

}
