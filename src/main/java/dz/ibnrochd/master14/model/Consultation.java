package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(schema = "cabinet", name = "consultation")

public class Consultation implements Serializable {

	private static final long serialVersionUID = -3669998604878710274L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "motif", length = 255)
	private String motif;
	
	@Column(name = "date_consultation", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date Date_Consultation;
	 
	@ManyToOne()
	@JoinColumn(name = "id_patient", nullable = false)
	private Patient patient;


	
	//////////////////////////////////////////
	
	
	public Consultation() {
		super();
	}



	public Consultation(Long id, String motif, Date date_Consultation, Patient patient) {
		super();
		this.id = id;
		this.motif = motif;
		Date_Consultation = date_Consultation;
		this.patient = patient;
	}


	//////////////////////////////////////////
	



	public String getMotif() {
		return motif;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id_consultation) {
		this.id = id_consultation;
	}



	public void setMotif(String motif) {
		this.motif = motif;
	}



	public Date getDate_Consultation() {
		return Date_Consultation;
	}



	public void setDate_Consultation(Date date_Consultation) {
		Date_Consultation = date_Consultation;
	}



	public Patient getPatient() {
		return patient;
	}



	public void setPatient(Patient patient) {
		this.patient = patient;
	}



	@Override
	public String toString() {
		return "Consultation [Id=" + id + ", motif=" + motif + ", Date_Consultation=" + Date_Consultation + ", patient="
				+ patient + "]";
	}
	
	
	public String toStringRewrited() {
		return "Consultation : \nId=" + id + ", motif=" + motif + ", Date_Consultation=" + Date_Consultation + ", patient="
				+ patient.getNom() + " . ";
	}
    
}
