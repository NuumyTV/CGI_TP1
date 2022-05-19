package com.openclassroomm.helloworld3;

import java.util.ArrayList;
import java.util.Date;

public class Developeur extends Personne {
	private Manager manager;
	private ArrayList<SkillsEnum> skills = new ArrayList<SkillsEnum>();
	public Developeur (String nom, String prenom, Sexe sexe,Date dateDeNaissance, int taille) {
		super(nom, prenom, sexe, dateDeNaissance, taille);
	}
	public void ListSkills() {
		this.skills.forEach(skill -> System.out.println(skill));
	}
	public void addSkill(SkillsEnum skill) {
		this.skills.add(skill);
	}
	public void ListManager() {
		
	}
	public Manager getManager() {
		return this.manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	public ArrayList<SkillsEnum> getSkills() {
		return this.skills;
	}
	public void setSkills(ArrayList<SkillsEnum> skills) {
		this.skills = skills;
	}


}
