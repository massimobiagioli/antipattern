package com.example.antipattern.program.model;

public class Dipendente {
	
	private String matricola;
	private String nome;
	
	public Dipendente() {
		this.setMatricola(null);
		this.setNome(null);
	}
	
	public Dipendente(String matricola, String nome) {
		this.setMatricola(matricola);
		this.setNome(nome);
	}
	
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Dipendente [matricola=" + matricola + ", nome=" + nome + "]";
	}
	
}
