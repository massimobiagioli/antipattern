package com.example.antipattern.program.good;

import com.example.antipattern.program.model.Dipendente;

public class DipendenteController {
	
	public int avviaPraticaRichiestaFerie(Dipendente dipendente) {
		int numeroPratica = (int) (Math.random() * 1000 + 1);
		System.out.println(dipendente + " ha avviato una pratica di richiesta ferie - Numero pratica: " + numeroPratica);
		
		return numeroPratica;
	}
	
	public void delegaAttivita(Dipendente dipendente, Dipendente sostituto) {
		System.out.println(dipendente + " comunica che le attività saranno svolte da " + sostituto + " durante il periodo di ferie");
	}
	
}
