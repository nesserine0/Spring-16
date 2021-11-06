package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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
		if (patient.getAge()>18) {
			System.out.println("am about to save the patient");
			patientRepository.save(patient);
			
		}else {
			System.out.println("am about to throw an exception");

			throw new IllegalArgumentException("Age is < 18 ");
		}
		
	}

	@Override
	public void deletePatient(Patient patient) {
		// TODO Auto-generated method stub
		patientRepository.delete(patient);
		
	}

	
	@Override
	public void updatePatient(Long id, Patient patient) {
		// TODO Auto-generated method stub
		
		if (patient.getAge()>18) {
		 Patient p;
		 
			Optional <Patient> optionalEntity = patientRepository.findById(id);
			if (optionalEntity.isPresent()) {
				
			    p = optionalEntity.get();
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
			
			else System.out.print("patient est null");	
			
		}else throw new IllegalArgumentException("Age is < 18 ");
		
	}

	@Override
	public void deletePatientByid(Long id) {
		// TODO Auto-generated method stub
		
	if (id!=null) {
		 Patient patient;
		System.out.print("the passed id is "+id+"\n");
		
		Optional <Patient> optionalEntity = patientRepository.findById(id);
		if (optionalEntity.isPresent()) {
			System.out.print("patient is present" );
		    patient = optionalEntity.get();
		    
			System.out.print("patient id is "+patient.getNom() );
			
		    patientRepository.delete(patient);	
		}
		
		else System.out.print("No patient is found with this id ");	
	}
	else System.out.print("the passed id is null ");	
		
	
		
	}

	@Override
	public Patient getPatient(Long id) {
		// TODO Auto-generated method stub
		
		 Patient patient=null;
		 
			Optional <Patient> optionalEntity = patientRepository.findById(id);
			if (optionalEntity.isPresent()) {
				 patient = optionalEntity.get();
			}
		return patient;
	}



}
