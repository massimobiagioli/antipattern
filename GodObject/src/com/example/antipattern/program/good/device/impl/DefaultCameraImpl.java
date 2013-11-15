package com.example.antipattern.program.good.device.impl;

import com.example.antipattern.program.good.Devices;
import com.example.antipattern.program.good.device.Camera;

public class DefaultCameraImpl extends DefaultDeviceImpl implements Camera {
	
	private Integer fps;

	public DefaultCameraImpl() {
		this.setId(null);
		this.setModel(null);
		this.setFps(Devices.DEFAULT_CAMERA_FPS);
	}
	
	@Override
	public void acquire() {
		// TODO Auto-generated method stub
		
	}
	
	// Getter/Setter
	
	public Integer getFps() {
		return fps;
	}

	public void setFps(Integer fps) {
		this.fps = fps;
	}

}
