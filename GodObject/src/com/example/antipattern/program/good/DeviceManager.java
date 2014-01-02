package com.example.antipattern.program.good;

import com.example.antipattern.program.good.device.Camera;
import com.example.antipattern.program.good.device.Printer;
import com.example.antipattern.program.good.device.Scanner;

public class DeviceManager {
	
	private Printer printer;
	private Scanner scanner;
	private Camera camera;
	
	public DeviceManager() {		
		this.setPrinter(DeviceFactory.getInstance().createPrinter());
		this.setScanner(DeviceFactory.getInstance().createScanner());
		this.setCamera(DeviceFactory.getInstance().createCamera());
	}
	
	// Printer
	public void print() {
		
		if (null == this.getPrinter().getId()) {
			throw new UnsupportedOperationException("Stampante non specificata!");
		}
		
		System.out.println("Printing on device: " + this.getPrinter().getId() + ":" + this.getPrinter().getModel() + 
				" (pages: " + (null != this.getPrinter().getNumberOfPages() ? this.getPrinter().getNumberOfPages() : Devices.DEFAULT_PAGES_TO_PRINT) + ")");
	}
		
	// Scanner
	public void scan() {
		
		if (null == this.getScanner().getId()) {
			throw new UnsupportedOperationException("Scanner non specificato!");
		}
	
		System.out.println("Scanning on device: " + this.getScanner().getId() + ":" + this.getScanner().getModel() + 
				" (format: " + (null != this.getScanner().getFormat() ? this.getScanner().getFormat() : Devices.DEFAULT_SCANNER_FORMAT) + ")");
	}
		
	// Camera
	public void acquire() {
		
		if (null == this.getCamera().getId()) {
			throw new UnsupportedOperationException("Camera non specificata!");
		}

		System.out.println("Acquiring on device: " + this.getCamera().getId() + ":" + this.getCamera().getModel() + 
				" (fps: " + (null != this.getCamera().getFps() ? this.getCamera().getFps() : Devices.DEFAULT_CAMERA_FPS) + ")");
		
	}
	
	
	// Getter/Setter
	
	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}

	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Camera getCamera() {
		return camera;
	}

	public void setCamera(Camera camera) {
		this.camera = camera;
	}
	
}
