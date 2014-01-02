package com.example.antipattern.program;

import com.example.antipattern.program.good.DeviceManager;

public class GoodExample {

	public static void main(String[] args) {
		DeviceManager deviceManager = new DeviceManager();
		
		// Configurazione dispositivi
		deviceManager.getPrinter().setId(1);
		deviceManager.getPrinter().setModel("Lexmark XYZ");
		deviceManager.getPrinter().setNumberOfPages(3);
		
		deviceManager.getScanner().setId(2);
		deviceManager.getScanner().setModel("Hp 123456");
		deviceManager.getScanner().setFormat("pdf");
		
		deviceManager.getCamera().setId(3);
		deviceManager.getCamera().setModel("Trust ASDFASDF");
		deviceManager.getCamera().setFps(24);
		
		// Lancia azioni
		deviceManager.print();
		deviceManager.scan();
		deviceManager.acquire();
	}

}
