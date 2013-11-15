package com.example.antipattern.program.good.device.impl;

import com.example.antipattern.program.good.device.Device;

public class DefaultDeviceImpl implements Device {
	
	private Integer id;
	private String model;
	
	public DefaultDeviceImpl() {
	}
	
	// Getter/Setter
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
}
