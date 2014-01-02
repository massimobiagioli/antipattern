package com.example.antipattern.program.bad;

import org.apache.commons.lang3.RandomStringUtils;

import com.example.antipattern.program.model.Document;

public class ScanDocument {
	
	public Document scan() {
		
		// Mock
		Document document = new Document(
				RandomStringUtils.randomNumeric(5),
				RandomStringUtils.randomAscii(255));
		
		return document;
	}
	
}
