package com.example.antipattern.program.bad;

import com.example.antipattern.program.model.Boss;
import com.example.antipattern.program.model.Dipendente;

public class EsameRichiestaFerie {
	
	public boolean esaminaRichiestaFerie(Dipendente dipendente, Boss boss, int numeroPratica) {
		int esito = (int) (Math.random() * 2);
		System.out.println(boss + " ha esaminato la pratica nr. " + numeroPratica + " di richiesta ferie da parte di " + dipendente + " - Esito: " + (esito == 1 ? "Approvata" : "Respinta"));		
		
		return esito == 1;
	}
	
}
