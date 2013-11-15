package com.example.antipattern.program.good.device;

public interface Printer extends Device {
	public Integer getNumberOfPages();
	public void setNumberOfPages(Integer numberOfPages);
	public void print();
}
