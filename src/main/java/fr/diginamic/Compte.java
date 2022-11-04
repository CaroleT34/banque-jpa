/**
 * Compte.java
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * @author Krol
 *
 */

@Entity
@Table(name = "compte")
public class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "numero", length = 12, nullable = false, unique = true)
	private String numero;

	@Column(name = "solde", nullable = false, unique = true)
	private Double solde;

	@ManyToMany
	@JoinTable(name= "Lien_Compte_Client",
			joinColumns = @JoinColumn(name = "ID_COMPTE", referencedColumnName = "ID"),
			inverseJoinColumns = @JoinColumn(name = "ID_CLIENT", referencedColumnName = "ID"))
	private List<Client> clients = new ArrayList<Client>();
	
	@Embedded
	private LivretA livretA;
	
	@Embedded
	private AssuranceVie assuranceVie;

	/**
	 * Constructeur
	 *
	 */
	public Compte() {
		super();
	}
	
	

	@Override
	public String toString() {
		return "Compte [id=" + id + ", numero=" + numero + ", solde=" + solde + "]";
	}


	/**Getter id
	 * 
	 * @return Integer id
	 */
	public Integer getId() {
		return id;
	}

	/** Setter id
	 * 
	 * @param id the id to set (type Integer)
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**Getter numero
	 * 
	 * @return String numero
	 */
	public String getNumero() {
		return numero;
	}

	/** Setter numero
	 * 
	 * @param numero the numero to set (type String)
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**Getter solde
	 * 
	 * @return Double solde
	 */
	public Double getSolde() {
		return solde;
	}

	/** Setter solde
	 * 
	 * @param solde the solde to set (type Double)
	 */
	public void setSolde(Double solde) {
		this.solde = solde;
	}

	/**Getter clients
	 * 
	 * @return List<Client> clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/** Setter clients
	 * 
	 * @param clients the clients to set (type List<Client>)
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	/**Getter livretA
	 * 
	 * @return LivretA livretA
	 */
	public LivretA getLivretA() {
		return livretA;
	}

	/** Setter livretA
	 * 
	 * @param livretA the livretA to set (type LivretA)
	 */
	public void setLivretA(LivretA livretA) {
		this.livretA = livretA;
	}

	/**Getter assuranceVie
	 * 
	 * @return AssuranceVie assuranceVie
	 */
	public AssuranceVie getAssuranceVie() {
		return assuranceVie;
	}

	/** Setter assuranceVie
	 * 
	 * @param assuranceVie the assuranceVie to set (type AssuranceVie)
	 */
	public void setAssuranceVie(AssuranceVie assuranceVie) {
		this.assuranceVie = assuranceVie;
	}

}
