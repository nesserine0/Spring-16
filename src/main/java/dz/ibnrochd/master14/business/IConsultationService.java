package dz.ibnrochd.master14.business;

import java.util.List;

import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;

public interface IConsultationService {


	 List <Consultation> listDesConsultation() ;
	 
	 
	 List <Consultation> listDesConsultationPatient(Patient patient) ;
	
	void creerConsultation(Consultation consultation);
	
	void deleteConsultation(Consultation consultation);
	
	void updateConsultation(int id , Consultation consultation);
}
