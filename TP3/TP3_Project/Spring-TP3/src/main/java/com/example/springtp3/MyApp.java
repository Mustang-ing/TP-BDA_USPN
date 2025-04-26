package com.example.springtp3;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//On définit une API Rest via cette annotation
@RestController
public class MyApp {

	public static ArrayList<Etudiant> liste = new ArrayList();

	static
	{
		liste.add(new  Etudiant(0,"A",19));
		liste.add(new  Etudiant(1,"A",19));
		liste.add(new  Etudiant(2,"A",19));
		liste.add(new  Etudiant(3,"A",19));
	}
	
	@GetMapping(value = "/liste")
	public Collection<Etudiant> getAllEtudiant()
	{
		return liste;
	}
	
	@GetMapping(value = "/getEtudiant")
	public Etudiant getEtudiant(int identifiant)
	{
		return liste.get(identifiant);
	}
	
	@PostMapping(value = "/addEtudiant")
	public Etudiant addEtudiant(Etudiant etudiant)
	{
		liste.add(etudiant);
		return etudiant;
	}
	
	@PutMapping(value = "/modifierEtudiant")
	public void modifierEtudiant(int id, String nom)
	{
		liste.get(id).setNom(nom);
		
	}
	
	@DeleteMapping(value = "deleteEtudiant")
	public String deleteEtudiant(int id)
	{
		liste.remove(id);
		return "L'étudiant d'id " + id + "a été supprimer";
	}
	
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

	//Attention, la méthode attend deux paramètre. Il faut donc les fournir via l'URL. ( /somme?a=1&b=1 )
	//On peut utiliser PostMan aussi
	@GetMapping(value = "/somme")
	public double somme(double a, double b)
	{
		return a+b;
	}
}
