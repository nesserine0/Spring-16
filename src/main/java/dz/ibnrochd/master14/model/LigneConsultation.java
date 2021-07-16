package dz.ibnrochd.master14.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "cabinet", name = "ligne_consultation")
public class LigneConsultation implements Serializable {


	private static final long serialVersionUID = -1882485395538957648L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	
	@ManyToOne()
	@JoinColumn(name = "id_consultation", nullable = false)
	private Consultation consultation;
	
	@ManyToOne()
	@JoinColumn(name = "id_traitement", nullable = false)
	private Traitement traitement;
	
	 
	@Column(name = "posologie", length = 255)
	private String Posologie;
	
	@Column(name = "unite_temps", length = 255)
	private String Unite_Temps;
	
	@Column(name = "quantite", length = 255)
	private String Quantite;

	
	
	
	//////////////////////////////////////////////
	
	
	public LigneConsultation(int id, Consultation consultation, Traitement traitement, String posologie,
			String unite_Temps, String quantite) {
		super();
		Id = id;
		this.consultation = consultation;
		this.traitement = traitement;
		Posologie = posologie;
		Unite_Temps = unite_Temps;
		Quantite = quantite;
	}




	public LigneConsultation() {
		super();
	}



	///////////////////////////////////////////////////

	public int getId() {
		return Id;
	}




	public void setId(int id) {
		Id = id;
	}




	public Consultation getConsultation() {
		return consultation;
	}




	public void setConsultation(Consultation consultation) {
		this.consultation = consultation;
	}




	public Traitement getTraitement() {
		return traitement;
	}




	public void setTraitemet(Traitement traitement) {
		this.traitement = traitement;
	}




	public String getPosologie() {
		return Posologie;
	}




	public void setPosologie(String posologie) {
		Posologie = posologie;
	}




	public String getUnite_Temps() {
		return Unite_Temps;
	}




	public void setUnite_Temps(String unite_Temps) {
		Unite_Temps = unite_Temps;
	}




	public String getQuantite() {
		return Quantite;
	}




	public void setQuantite(String quantite) {
		Quantite = quantite;
	}



	
	
	///////////////////////////////////////////////////

	
	
	
	@Override
	public String toString() {
		return "LigneConsultation [Id=" + Id + ", consultation=" + consultation + ", traitemet=" + traitement
				+ ", Posologie=" + Posologie + ", Unite_Temps=" + Unite_Temps + ", Quantite=" + Quantite + "]";
	}
	
	
	
	
	
	

    
}
