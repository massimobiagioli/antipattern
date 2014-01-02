package com.example.antipattern.program.good.device;

public interface Camera extends Device {
	public Integer getFps();
	public void setFps(Integer fps);
	public void acquire();
}
