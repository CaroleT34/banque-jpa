/**
 * Operation.java
 */
package fr.diginamic;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Krol
 *
 */

@Entity
@Table(name = "operation")
public class Operation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(name ="date", nullable = false , unique = true)
	private Date date;

	@Column(name = "montant", nullable = false, unique = true)
	private Double montant;
	
	@Column(name = "motif", length = 100, nullable = false, unique = true)
	private String motif;
	
	@Embedded
	private Virement virement;
	
	
	/**Constructeur
	 *
	 */
	public Operation() {
		super();
	}


	@Override
	public String toString() {
		return "Operation [id=" + id + ", date=" + date + ", montant=" + montant + ", motif=" + motif + "]";
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


	/**Getter date
	 * 
	 * @return Date date
	 */
	public Date getDate() {
		return date;
	}


	/** Setter date
	 * 
	 * @param date the date to set (type Date)
	 */
	public void setDate(Date date) {
		this.date = date;
	}


	/**Getter montant
	 * 
	 * @return Double montant
	 */
	public Double getMontant() {
		return montant;
	}


	/** Setter montant
	 * 
	 * @param montant the montant to set (type Double)
	 */
	public void setMontant(Double montant) {
		this.montant = montant;
	}


	/**Getter motif
	 * 
	 * @return String motif
	 */
	public String getMotif() {
		return motif;
	}


	/** Setter motif
	 * 
	 * @param motif the motif to set (type String)
	 */
	public void setMotif(String motif) {
		this.motif = motif;
	}


	/**Getter virement
	 * 
	 * @return Virement virement
	 */
	public Virement getVirement() {
		return virement;
	}


	/** Setter virement
	 * 
	 * @param virement the virement to set (type Virement)
	 */
	public void setVirement(Virement virement) {
		this.virement = virement;
	}

}
