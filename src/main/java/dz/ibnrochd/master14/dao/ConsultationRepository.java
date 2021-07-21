package dz.ibnrochd.master14.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;


@Repository
public interface ConsultationRepository extends JpaRepository<Consultation,Integer>{
	
	Consultation findById(int id);

	 List <Consultation> findAll() ;
	 
	 List <Consultation> findByPatient(Patient patient) ;
}
