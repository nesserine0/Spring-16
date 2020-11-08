package dz.ibnrochd.master14.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dz.ibnrochd.master14.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	// TODO ajouter la signature d'une méthode pour rechercher des patients par leurs noms (convention Spring Data)
}
