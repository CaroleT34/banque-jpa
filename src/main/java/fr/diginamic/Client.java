/**
 * Client.java
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Krol
 *
 */

@Entity
@Table(name = "client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nom", length = 50, nullable = false, unique = true)
	private String nom;

	@Column(name = "prenom", length = 50, nullable = false, unique = true)
	private String prenom;

	@Temporal(value = TemporalType.DATE) // DATE date sans heure associée
	@Column(name = "dateNaissance", nullable = true, unique = true)
	private Date dateNaissance;

	@ManyToOne
	@JoinColumn(name = "ID_BANQUE")
	private Banque banque;

	@Embedded
	private Adresse adresse;

	@ManyToMany(mappedBy = "clients")
	private List<Compte> comptes = new ArrayList<Compte>();

	/**
	 * Constructeur
	 *
	 */
	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}

	/**
	 * Getter id
	 * 
	 * @return Integer id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Setter id
	 * 
	 * @param id the id to set (type Integer)
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Getter nom
	 * 
	 * @return String nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter nom
	 * 
	 * @param nom the nom to set (type String)
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter prenom
	 * 
	 * @return String prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter prenom
	 * 
	 * @param prenom the prenom to set (type String)
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Getter dateNaissance
	 * 
	 * @return Date dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * Setter dateNaissance
	 * 
	 * @param dateNaissance the dateNaissance to set (type Date)
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	/**
	 * Getter banque
	 * 
	 * @return Banque banque
	 */
	public Banque getBanque() {
		return banque;
	}

	/**
	 * Setter banque
	 * 
	 * @param banque the banque to set (type Banque)
	 */
	public void setBanque(Banque banque) {
		this.banque = banque;
	}

	/**
	 * Getter adresse
	 * 
	 * @return Adresse adresse
	 */
	public Adresse getAdresse() {
		return adresse;
	}

	/**
	 * Setter adresse
	 * 
	 * @param adresse the adresse to set (type Adresse)
	 */
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	/**
	 * Getter comptes
	 * 
	 * @return List<Compte> comptes
	 */
	public List<Compte> getComptes() {
		return comptes;
	}

	/**
	 * Setter comptes
	 * 
	 * @param comptes the comptes to set (type List<Compte>)
	 */
	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

}
