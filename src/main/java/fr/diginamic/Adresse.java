/**
 * Adresse.java
 */
package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Krol
 *
 */

@Embeddable
public class Adresse {

	@Column(name = "numero", length = 50, nullable = false, unique = true)
	private int numero;

	@Column(name = "rue", length = 250, nullable = false, unique = true)
	private String rue;

	@Column(name = "codePostal", length = 5, nullable = false, unique = true)
	private int codePostal;

	@Column(name = "ville", length = 250, nullable = false, unique = true)
	private String ville;

	/**
	 * Constructeur
	 *
	 */
	public Adresse() {
		super();
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", codePostal=" + codePostal + ", ville=" + ville + "]";
	}

	/**
	 * Getter numero
	 * 
	 * @return String numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * Setter numero
	 * 
	 * @param numero the numero to set (type String)
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Getter rue
	 * 
	 * @return String rue
	 */
	public String getRue() {
		return rue;
	}

	/**
	 * Setter rue
	 * 
	 * @param rue the rue to set (type String)
	 */
	public void setRue(String rue) {
		this.rue = rue;
	}

	/**
	 * Getter codePostal
	 * 
	 * @return int codePostal
	 */
	public int getCodePostal() {
		return codePostal;
	}

	/**
	 * Setter codePostal
	 * 
	 * @param codePostal the codePostal to set (type int)
	 */
	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	/**
	 * Getter ville
	 * 
	 * @return String ville
	 */
	public String getVille() {
		return ville;
	}

	/**
	 * Setter ville
	 * 
	 * @param ville the ville to set (type String)
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}

}
