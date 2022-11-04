/**
 * AssuranceVie.java
 */
package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Krol
 *
 */

@Embeddable
public class AssuranceVie {

	@Temporal(value = TemporalType.DATE)
	@Column(name = "dateFin")
	private Date dateFin;
	
	@Column(name = "taux_AssuranceVie")
	private Double taux;
	
	/**Constructeur
	 *
	 */
	public AssuranceVie() {
		super();
	}

	@Override
	public String toString() {
		return "AssuranceVie [dateFin=" + dateFin + ", taux=" + taux + "]";
	}


	/**Getter dateFin
	 * 
	 * @return Date dateFin
	 */
	public Date getDateFin() {
		return dateFin;
	}

	/** Setter dateFin
	 * 
	 * @param dateFin the dateFin to set (type Date)
	 */
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	/**Getter taux
	 * 
	 * @return Double taux
	 */
	public Double getTaux() {
		return taux;
	}

	/** Setter taux
	 * 
	 * @param taux the taux to set (type Double)
	 */
	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
	

}
