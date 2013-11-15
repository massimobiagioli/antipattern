package com.example.antipattern.program.good.device.impl;

import com.example.antipattern.program.good.Devices;
import com.example.antipattern.program.good.device.Scanner;

public class DefaultScannerImpl extends DefaultDeviceImpl implements Scanner {
	
	private String format;
	
	public DefaultScannerImpl() {
		this.setId(null);
		this.setModel(null);
		this.setFormat(Devices.DEFAULT_SCANNER_FORMAT);
	}
	
	@Override
	public void scan() {
		// TODO Auto-generated method stub
		
	}
	
	// Getter/Setter
	
	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	
}
