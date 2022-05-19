package com.openclassroomm.helloworld3;

import java.util.Date;

public class Personne {
	protected Sexe sexe;
	protected String nom;
	protected String prenom;
	protected Date dateDeNaissance;
	protected int taille;
	//public Personne() {}
	public Personne(String nom, String prenom, Sexe sexe,Date dateDeNaissance, int taille) {
		this.nom = nom;	
		this.prenom = prenom;
		this.sexe = sexe;
		this.dateDeNaissance = 	dateDeNaissance;	
		this.taille = taille;
	}
	public Sexe getSexe() {
		System.out.println(sexe);
		return sexe;
	}
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	
}