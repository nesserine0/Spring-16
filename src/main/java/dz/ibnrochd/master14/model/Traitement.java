package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema = "cabinet", name = "traitement")
public class Traitement implements Serializable {


	private static final long serialVersionUID = 8248365590951840055L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nom", length = 255)
	private String nom;

	@OneToMany(mappedBy = "traitement")
    private List<LigneConsultation> ligneConsultations = new ArrayList<>();
	
//////////////////////////////////////////
	
	public Traitement() {
		super();
	}


	public Traitement(int id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Traitement(int id, String nom, List<LigneConsultation> ligneConsultations) {
		super();
		this.id = id;
		this.nom = nom;
		this.ligneConsultations = ligneConsultations;
	}
	
//////////////////////////////////////////

	


	public String getNom() {
		return nom;
	}


	public int getId() {
		return id;
	}


	public void setId(int id_traitement) {
		this.id = id_traitement;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}

	
	


	public List<LigneConsultation> getLigneConsultations() {
		return ligneConsultations;
	}


	public void setLigneConsultations(List<LigneConsultation> ligneConsultations) {
		this.ligneConsultations = ligneConsultations;
	}


	

//////////////////////////////////////////

	@Override
	public String toString() {
		return "Traitement [Id=" + id + ", nom=" + nom + ", ligneConsultations=" + ligneConsultations + "]";
	}
	
	
	
	
    
}
