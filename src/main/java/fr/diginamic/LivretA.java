/**
 * LivretA.java
 */
package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Krol
 *
 */

@Embeddable
public class LivretA {

	@Column(name = "taux_livretA", length = 50, nullable = true, unique = true)
	private Double taux;

	/**
	 * Constructeur
	 *
	 */
	public LivretA() {
		super();
	}

	@Override
	public String toString() {
		return "LivretA [taux=" + taux + "]";
	}

	/**
	 * Getter taux
	 * 
	 * @return Double taux
	 */
	public Double getTaux() {
		return taux;
	}

	/**
	 * Setter taux
	 * 
	 * @param taux the taux to set (type Double)
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}

}
