package com.example.antipattern.program.bad;

public class DeviceManager {
	
	// Costanti
	public static final int DEFAULT_PAGES_TO_PRINT = 1;
	public static final String DEFAULT_SCANNER_FORMAT = "jpg";
	public static final int DEFAULT_CAMERA_FPS = 12;	
	
	// Printer
	private Integer printerId;
	private String printerModel;
	private Integer pagesToPrint;
	
	// Scanner
	private Integer scannerId;
	private String scannerModel;
	private String scannerFormat;
	
	// Camera
	private Integer cameraId;
	private String cameraModel;
	private Integer cameraFps;
	
	public DeviceManager() {
		
		// Scanner
		this.setScannerId(null);
		this.setScannerModel(null);
		this.setScannerFormat(null);
		
		// Printer
		this.setPrinterId(null);
		this.setPrinterModel(null);
		this.setPagesToPrint(null);
		
		// Camera
		this.setCameraId(null);
		this.setCameraModel(null);	
		this.setCameraFps(null);
	}
	
	// Printer
	public void print() {
		
		if (null == this.getPrinterId()) {
			throw new UnsupportedOperationException("Stampante non specificata!");
		}
		
		System.out.println("Printing on device: " + this.getPrinterId() + ":" + this.getPrinterModel() + 
				" (pages: " + (null != this.getPagesToPrint() ? this.getPagesToPrint() : DEFAULT_PAGES_TO_PRINT) + ")");
	}
	
	// Scanner
	public void scan() {
		
		if (null == this.getScannerId()) {
			throw new UnsupportedOperationException("Scanner non specificato!");
		}
	
		System.out.println("Scanning on device: " + this.getScannerId() + ":" + this.getScannerModel() + 
				" (format: " + (null != this.getScannerFormat() ? this.getScannerFormat() : DEFAULT_SCANNER_FORMAT) + ")");
	}
	
	// Camera
	public void acquire() {
		
		if (null == this.getCameraId()) {
			throw new UnsupportedOperationException("Camera non specificata!");
		}

		System.out.println("Acquiring on device: " + this.getCameraId() + ":" + this.getCameraModel() + 
				" (fps: " + (null != this.getCameraFps() ? this.getCameraFps() : DEFAULT_CAMERA_FPS) + ")");
		
	}
	
	// Getter/setter
	
	public Integer getScannerId() {
		return scannerId;
	}

	public void setScannerId(Integer scannerId) {
		this.scannerId = scannerId;
	}

	public String getScannerModel() {
		return scannerModel;
	}

	public void setScannerModel(String scannerModel) {
		this.scannerModel = scannerModel;
	}

	public Integer getPrinterId() {
		return printerId;
	}

	public void setPrinterId(Integer printerId) {
		this.printerId = printerId;
	}

	public Integer getPagesToPrint() {
		return pagesToPrint;
	}

	public void setPagesToPrint(Integer pagesToPrint) {
		this.pagesToPrint = pagesToPrint;
	}

	public Integer getCameraId() {
		return cameraId;
	}

	public void setCameraId(Integer cameraId) {
		this.cameraId = cameraId;
	}

	public String getCameraModel() {
		return cameraModel;
	}

	public void setCameraModel(String cameraModel) {
		this.cameraModel = cameraModel;
	}

	public String getPrinterModel() {
		return printerModel;
	}

	public void setPrinterModel(String printerModel) {
		this.printerModel = printerModel;
	}

	public String getScannerFormat() {
		return scannerFormat;
	}

	public void setScannerFormat(String scannerFormat) {
		this.scannerFormat = scannerFormat;
	}

	public Integer getCameraFps() {
		return cameraFps;
	}

	public void setCameraFps(Integer cameraFps) {
		this.cameraFps = cameraFps;
	}
	
}
