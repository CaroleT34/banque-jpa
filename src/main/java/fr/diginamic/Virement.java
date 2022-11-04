/**
 * Virement.java
 */
package fr.diginamic;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author Krol
 *
 */

@Embeddable
public class Virement {

	@Column(name = "beneficiaire", length = 50, nullable = false, unique = true)
	private String beneficiaire;

	/**
	 * Constructeur
	 *
	 */
	public Virement() {
		super();
	}

	@Override
	public String toString() {
		return "Virement [beneficiaire=" + beneficiaire + "]";
	}

	/**
	 * Getter beneficiaire
	 * 
	 * @return String beneficiaire
	 */
	public String getBeneficiaire() {
		return beneficiaire;
	}

	/**
	 * Setter beneficiaire
	 * 
	 * @param beneficiaire the beneficiaire to set (type String)
	 */
	public void setBeneficiaire(String beneficiaire) {
		this.beneficiaire = beneficiaire;
	}

}
