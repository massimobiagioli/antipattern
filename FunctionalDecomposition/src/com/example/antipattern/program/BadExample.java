package com.example.antipattern.program;

import com.example.antipattern.program.bad.EsameRichiestaFerie;
import com.example.antipattern.program.bad.GodiFerie;
import com.example.antipattern.program.bad.RichiestaFerie;
import com.example.antipattern.program.model.Boss;
import com.example.antipattern.program.model.Dipendente;

public class BadExample {
	public static void main(String[] args) {
		Dipendente dipendente = new Dipendente("DIP-001", "Mario Rossi");
		RichiestaFerie rf = new RichiestaFerie();
		int numeroPratica = rf.avviaPraticaRichiestaFerie(dipendente);
		
		Boss boss = new Boss("Mr. Jobz");
		EsameRichiestaFerie erf = new EsameRichiestaFerie();
		boolean esitoRichiestaFerie = erf.esaminaRichiestaFerie(dipendente, boss, numeroPratica);
		
		if (esitoRichiestaFerie) {
			Dipendente sostituto = new Dipendente("DIP-002", "Anna Bianchi");
			GodiFerie gf = new GodiFerie();
			gf.delegaAttivita(dipendente, sostituto);
		} 		
	}
}
