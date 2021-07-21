package dz.ibnrochd.master14.business;

import java.util.List;

import dz.ibnrochd.master14.model.Patient;

public interface IPatientService {

	
	List<Patient> listeDesPatients();
	
	void creerPatient(Patient patient);
	
	void deletePatient(Patient patient);
	
	void updatePatient(int id , Patient patient);
	
}
