package com.example.antipattern.program.model;

public class Boss {
	
	private String nome;
	
	public Boss() {
		this.setNome(null);
	}
	
	public Boss(String nome) {
		this.setNome(nome);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Boss [nome=" + nome + "]";
	}
	
}
