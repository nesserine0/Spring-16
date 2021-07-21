package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.PatientRepository;
import dz.ibnrochd.master14.model.Patient;

@Service
public class PatientService implements IPatientService{
	
	@Autowired
	PatientRepository patientRepository;

	@Override
	public List<Patient> listeDesPatients() {
		// TODO Auto-generated method stub
		return patientRepository.findAll();
	}

	@Override
	public void creerPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientRepository.save(patient);
	}

	@Override
	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub
		patientRepository.delete(patient);
		
	}

	
	@Override
	public void updatePatient(int id, Patient patient) {
		// TODO Auto-generated method stub
		Patient p=patientRepository.findByID(id);
		p.setAdresse(patient.getAdresse());
		p.setConsultations(patient.getConsultations());
		p.setDateNaissance(patient.getDateNaissance());
		p.setNom(patient.getNom());
		p.setNumeroTelephone(patient.getNumeroTelephone());
		p.setPrenom(patient.getPrenom());
		p.setRendezVous(patient.getRendezVous());
		p.setSexe(patient.getSexe());
		patientRepository.save(p);
	}

}
