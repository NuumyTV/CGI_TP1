package com.openclassroomm.helloworld3;

import java.beans.JavaBean;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {
		Developeur pierreMarchand = new Developeur("MARCHAND","Pierre",Sexe.M, new Date("14/02/1989"), 180  );
		Developeur paulDurant = new Developeur("DURANT","Paul",Sexe.M, new Date("18/0/1991"), 178  );
		Developeur jacquesAdit = new Developeur("ADIT","Jacques",Sexe.M, new Date("24/12/1980"), 160  );
		Developeur juliePacot = new Developeur("PACOT","Julie",Sexe.F, new Date("09/08/1976"), 155  );
		
		Manager samDebif = new Manager("DEBIF","Sam",Sexe.F, new Date("07/09/1976"), 168);
		Manager raumaneDumont = new Manager("DUMONT","Raumane",Sexe.F, new Date("04/04/1983"), 154);
			
		pierreMarchand.setManager(samDebif);
		paulDurant.setManager(samDebif);
		
		jacquesAdit.setManager(raumaneDumont);
		juliePacot.setManager(raumaneDumont);
	
		pierreMarchand.addSkill(SkillsEnum.JAVA);
		pierreMarchand.addSkill(SkillsEnum.PHP);
	
		paulDurant.addSkill(SkillsEnum.JAVA);
		paulDurant.addSkill(SkillsEnum.DELIVERY);
	
		jacquesAdit.addSkill(SkillsEnum.SELENIUM);
		jacquesAdit.addSkill(SkillsEnum.ANGULAR);
	
		juliePacot.addSkill(SkillsEnum.GCP);
		juliePacot.addSkill(SkillsEnum.PHP);
		
		ArrayList<Personne> personnes = new ArrayList<Personne>();
		personnes.add(pierreMarchand);
		personnes.add(paulDurant);
		personnes.add(jacquesAdit);
		personnes.add(juliePacot);
		personnes.add(samDebif);
		personnes.add(raumaneDumont);
		
		ArrayList<Developeur> developpeurs = new ArrayList<Developeur>();
		developpeurs.add(pierreMarchand);
		developpeurs.add(paulDurant);
		developpeurs.add(jacquesAdit);
		developpeurs.add(juliePacot);
		
		System.out.println("Voici les développeurs qui ont la compétence java et qui ont un manager :");
		for(Developeur developpeur : developpeurs) {
			boolean skills = developpeur.getSkills().contains(SkillsEnum.JAVA);
			boolean hasManager = developpeur.getManager() instanceof Manager;
		    if (skills && hasManager) {
		    	String dateNaissance = new SimpleDateFormat("dd/MM/yyyy").format(developpeur.getDateDeNaissance());
		    	System.out.println(developpeur.getNom()+" "+developpeur.getPrenom()+" "+dateNaissance);
			}
		}
		
		System.out.println("\nVoici les personnes qui mesurent plus de 160cm :");
		for(Personne personne : personnes) {
		    int taille = personne.getTaille();
		    if (taille >= 160) {
		    	System.out.println(personne.getNom()+" "+personne.getPrenom());
		    }
		 }
	}
}