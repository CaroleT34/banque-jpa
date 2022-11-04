/**
 * Banque.java
 */
package fr.diginamic;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Krol
 *
 */

@Entity
@Table(name = "banque")
public class Banque {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nom", length = 200, nullable = false, unique = true)
	private String nom;

	@OneToMany(mappedBy = "banque")
	private List<Client> clients = new ArrayList<Client>();

	/**
	 * Constructeur
	 *
	 */
	public Banque() {
		super();
	}

	@Override
	public String toString() {
		return "Banque [id=" + id + ", nom=" + nom + "]";
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
	 * Getter clients
	 * 
	 * @return List<Client> clients
	 */
	public List<Client> getClients() {
		return clients;
	}

	/**
	 * Setter clients
	 * 
	 * @param clients the clients to set (type List<Client>)
	 */
	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

}
