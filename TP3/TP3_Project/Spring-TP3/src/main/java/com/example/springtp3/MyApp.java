package com.example.springtp3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//On définit une API Rest via cette annotation
@RestController
public class MyApp {
	
	//Implémentation des méthodes HTTP. La value précise le chemin de l'URL.
	@GetMapping(value = "/b")
	public String Bonjour()
	{
		return "Bonjour ! ";
	}
	
	@GetMapping(value = "/bn")
	public String Bonsoir()
	{
		return "Bonsoir !";
	}

	@GetMapping(value = "/edu1")
	public Etudiant getEtudiant()
	{
		return new Etudiant(1,"A",19);
	}

}
