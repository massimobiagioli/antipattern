package com.example.antipattern.program.bad;

import com.example.antipattern.program.model.Dipendente;

public class RichiestaFerie {
	
	public int avviaPraticaRichiestaFerie(Dipendente dipendente) {
		int numeroPratica = (int) (Math.random() * 1000 + 1);
		System.out.println(dipendente + " ha avviato una pratica di richiesta ferie - Numero pratica: " + numeroPratica);
		
		return numeroPratica;
	}
	
}
