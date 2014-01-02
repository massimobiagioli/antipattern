package com.example.antipattern.program.good.device;

public interface Scanner extends Device {
	public String getFormat();
	public void setFormat(String format);
	public void scan();
}
