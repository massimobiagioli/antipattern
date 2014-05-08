package com.example.antipattern.program.bad;

import com.example.antipattern.program.model.Dipendente;

public class GodiFerie {
	public void delegaAttivita(Dipendente dipendente, Dipendente sostituto) {
		System.out.println(dipendente + " comunica che le attività saranno svolte da " + sostituto + " durante il periodo di ferie");
	}
}
