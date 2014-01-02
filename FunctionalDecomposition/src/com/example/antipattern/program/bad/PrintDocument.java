package com.example.antipattern.program.bad;

import com.example.antipattern.program.model.Document;

public class PrintDocument {
	
	public void print(Document document) {
		System.out.println("Document id   : " + document.getId());
		System.out.println("Document body : " + document.getBody());
		System.out.println("------------");
	}
	
}
