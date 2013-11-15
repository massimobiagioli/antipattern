package com.example.antipattern.program.good.device.impl;

import com.example.antipattern.program.good.Devices;
import com.example.antipattern.program.good.device.Printer;

public class DefaultPrinterImpl extends DefaultDeviceImpl implements Printer {
	
	private Integer numberOfPages;
	
	public DefaultPrinterImpl() {
		this.setId(null);
		this.setModel(null);
		this.setNumberOfPages(Devices.DEFAULT_PAGES_TO_PRINT);
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
	// Getter/Setter

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

}
