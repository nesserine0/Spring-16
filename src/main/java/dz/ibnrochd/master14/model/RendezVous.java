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
@Table(schema = "cabinet", name = "rendez_vous")
public class RendezVous implements Serializable {

	private static final long serialVersionUID = -7275578697948165342L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_rdv", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRdv;

    @ManyToOne()
    @JoinColumn(name = "id_patient", nullable = false)
    private Patient patient;

    //////////////////////////////////////////////
    
    public RendezVous() {
		
	}

	public RendezVous(Long id, Date dateRdv, Patient patient) {
		super();
		this.id = id;
		this.dateRdv = dateRdv;
		this.patient = patient;
	}

	///////////////////////////////////////////////
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateRdv() {
		return dateRdv;
	}

	public void setDateRdv(Date dateRdv) {
		this.dateRdv = dateRdv;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
    
    
}
