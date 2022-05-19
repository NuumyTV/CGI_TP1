package com.openclassroomm.helloworld3;

import java.util.*;

public class Manager extends Personne {
	public Manager(String nom, String prenom, Sexe sexe,Date dateDeNaissance, int taille) {
		super(nom, prenom, sexe, dateDeNaissance, taille);
	}
	private List<Personne> listMembers;
	public void addMember (Personne ListMembers) {
}
	private ArrayList<Manager> listmember = new ArrayList<Manager>(10);
	public void ListMember() {
		this.listmember.forEach(member -> System.out.println(member));
	}
	public void addListMember(Manager member) {
		this.listmember.add(member);
	}
	public List<Personne> getListMembers() {
		return listMembers;
	}
	public void setListMembers(List<Personne> listMembers) {
		this.listMembers = listMembers;
	}
	public ArrayList<Manager> getListmember() {
		return listmember;
	}
	public void setListmember(ArrayList<Manager> listmember) {
		this.listmember = listmember;
	}
	
	} 