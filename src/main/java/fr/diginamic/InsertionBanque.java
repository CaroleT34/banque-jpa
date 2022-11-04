/**
 * InsertionBanque.java
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * @author Krol
 *
 */
public class InsertionBanque {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManagerFactory entity = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entity.createEntityManager();
		EntityTransaction transac = em.getTransaction();
		
		transac.begin();
		
		Date date = Calendar.getInstance().getTime();
		
//		Client c = new Client();        //Création nouveau client
//		c.setNom("Kung");
//		c.setPrenom("Fu");
//		c.setDateNaissance(date);
		
//		Adresse a = new Adresse();      //Création nouvelle adresse
//		a.setNumero(6);
//		a.setRue("Rue des tulipes");
//		a.setCodePostal(34070);
//		a.setVille("Montpellier");
//		c.setAdresse(a);
		
		
//		Banque b = new Banque();     //Création nouvelle banque
//		b.setNom("Banque Postale");
//		c.setBanque(b);
//		em.persist(b);
		
		ArrayList<Compte> comptes = new ArrayList<Compte>();    //Création liste de comptes
		
		Compte comptec1 = new Compte();
		comptec1.setNumero("FR1546889");
		comptec1.setSolde(1500.23);
		
		AssuranceVie ass = new AssuranceVie();  //Création Assurance Vie
		ass.setTaux(12.00);
		ass.setDateFin(new Date());
		comptec1.setAssuranceVie(ass);
		
		LivretA livA = new LivretA();
		livA.setTaux(5.00);
		comptec1.setLivretA(livA);
		
		comptes.add(comptec1);               //Ajout compteC1 à la liste de comptes
		em.persist(comptec1);
		
		Compte comptec2 = new Compte();
		comptec2.setNumero("FR0000011");
		comptec2.setSolde(660.23);
		
		AssuranceVie ass2 = new AssuranceVie();  //Création Assurance Vie
		ass2.setTaux(17.00);
		ass2.setDateFin(new Date());
		comptec1.setAssuranceVie(ass2);
		
		LivretA livA1 = new LivretA();
		livA1.setTaux(2.00);
		comptec1.setLivretA(livA1);
		
		comptes.add(comptec2);                //Ajout compteC1 à la liste de comptes
		em.persist(comptec2);
		
		transac.commit();
	}

}
