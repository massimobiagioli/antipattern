package com.example.antipattern.program;

import com.example.antipattern.program.good.BossController;
import com.example.antipattern.program.good.DipendenteController;
import com.example.antipattern.program.model.Boss;
import com.example.antipattern.program.model.Dipendente;

public class GoodExample {
	public static void main(String[] args) {
		Dipendente dipendente = new Dipendente("DIP-001", "Mario Rossi");
		DipendenteController dipendenteController = new DipendenteController();		
		int numeroPratica = dipendenteController.avviaPraticaRichiestaFerie(dipendente);
		
		Boss boss = new Boss("Mr. Jobz");		
		BossController bossController = new BossController();
		boolean esitoRichiestaFerie = bossController.esaminaRichiestaFerie(dipendente, boss, numeroPratica);
		
		if (esitoRichiestaFerie) {
			Dipendente sostituto = new Dipendente("DIP-002", "Anna Bianchi");			
			dipendenteController.delegaAttivita(dipendente, sostituto);
		} 		
	}
}
