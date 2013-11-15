package com.example.antipattern.program.good;

import com.example.antipattern.program.good.device.Camera;
import com.example.antipattern.program.good.device.Printer;
import com.example.antipattern.program.good.device.Scanner;
import com.example.antipattern.program.good.device.impl.DefaultCameraImpl;
import com.example.antipattern.program.good.device.impl.DefaultPrinterImpl;
import com.example.antipattern.program.good.device.impl.DefaultScannerImpl;

public class DeviceFactory {
	
	private static DeviceFactory instance = new DeviceFactory();
	
	private DeviceFactory() {
	}
	
	public Printer createPrinter() {
		return new DefaultPrinterImpl();
	}
	
	public Scanner createScanner() {
		return new DefaultScannerImpl();
	}
	
	public Camera createCamera() {
		return new DefaultCameraImpl();
	}
	
	public static DeviceFactory getInstance() {
		return instance;
	}
	
}
