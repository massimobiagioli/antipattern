package com.example.antipattern.program.bad;

import com.example.antipattern.program.model.Document;

public class MainProcess {
	
	private ScanDocument scanDocument = new ScanDocument();
	private RegisterDocument registerDocument = new RegisterDocument();
	private PrintDocument printDocument = new PrintDocument();
	
	public void execute() {
		Document document = scanDocument.scan();
		registerDocument.register(document);
		printDocument.print(document);
	}
	
}
