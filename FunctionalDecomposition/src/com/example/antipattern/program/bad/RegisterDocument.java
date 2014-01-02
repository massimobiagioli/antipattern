package com.example.antipattern.program.bad;

import java.util.ArrayList;
import java.util.List;

import com.example.antipattern.program.model.Document;

public class RegisterDocument {
	
	private List<Document> documentRepository = new ArrayList<Document>(0);
	
	public void register(Document document) {
		this.documentRepository.add(document);
		System.out.println(document + " registered");
	}
	
}
