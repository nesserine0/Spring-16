package dz.ibnrochd.master14.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	// TODO ajouter la signature d'une méthode pour rechercher des patients par leurs noms (convention Spring Data)
	
	     List <Patient> findByNom(String nom) ;
	    
	     
	     List <Patient> findAll() ;
	     
	     
	     Patient findByID(int id) ;
	
}
