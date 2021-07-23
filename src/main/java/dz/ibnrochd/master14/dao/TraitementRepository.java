package dz.ibnrochd.master14.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dz.ibnrochd.master14.model.LigneConsultation;
import dz.ibnrochd.master14.model.Traitement;

@Repository
public interface TraitementRepository extends JpaRepository<Traitement,Integer>{
	
	//Traitement findByLigneConsultations(LigneConsultation ligneConsultations);
	
	List<Traitement> findByLigneConsultations(LigneConsultation ligneConsultations);
	
	Traitement findById(int id);
	
	List<Traitement> findAll();

	

}
