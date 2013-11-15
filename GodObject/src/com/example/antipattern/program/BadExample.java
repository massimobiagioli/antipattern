package com.example.antipattern.program;

import com.example.antipattern.program.bad.DeviceManager;

public class BadExample {

	public static void main(String[] args) {
		DeviceManager deviceManager = new DeviceManager();
		
		// Configurazione dispositivi
		deviceManager.setPrinterId(1);
		deviceManager.setPrinterModel("Lexmark XYZ");
		deviceManager.setPagesToPrint(3);
		
		deviceManager.setScannerId(2);
		deviceManager.setScannerModel("Hp 123456");
		deviceManager.setScannerFormat("pdf");
		
		deviceManager.setCameraId(3);
		deviceManager.setCameraModel("Trust ASDFASDF");
		deviceManager.setCameraFps(24);
		
		// Lancia azioni
		deviceManager.print();
		deviceManager.scan();
		deviceManager.acquire();
	}

}
