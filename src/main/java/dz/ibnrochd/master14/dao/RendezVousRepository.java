package dz.ibnrochd.master14.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.RendezVous;


@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,Integer>{
	
	List<RendezVous> findByPatient(Patient patient);

}
