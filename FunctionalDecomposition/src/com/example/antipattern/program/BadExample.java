package com.example.antipattern.program;

import com.example.antipattern.program.bad.MainProcess;

public class BadExample {
	
	public static void main(String[] args) {
		MainProcess proc = new MainProcess();		
		proc.execute();
		proc.execute();
	}
	
}
