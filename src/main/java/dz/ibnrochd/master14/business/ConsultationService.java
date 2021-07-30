package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.ConsultationRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;

@Service
public class ConsultationService implements IConsultationService{

	@Autowired
	ConsultationRepository consultationRepository;
	@Override
	public List<Consultation> listDesConsultation() {
		// TODO Auto-generated method stub
		return consultationRepository.findAll();
	}

	@Override
	public List<Consultation> listDesConsultationPatient(Patient patient) {
		// TODO Auto-generated method stub
		return consultationRepository.findByPatient(patient);
	}

	@Override
	public void creerConsultation(Consultation consultation) {
		// TODO Auto-generated method stub
		consultationRepository.save(consultation);
	}

	@Override
	public void deleteConsultation(Consultation consultation) {
		// TODO Auto-generated method stub
		consultationRepository.delete(consultation);
	}

	@Override
	public void updateConsultation(Long id, Consultation consultation) {
		// TODO Auto-generated method stub
		Consultation c=consultationRepository.findById(id);
		c.setDate_Consultation(consultation.getDate_Consultation());
		c.setMotif(consultation.getMotif());
		c.setPatient(consultation.getPatient());
		consultationRepository.save(c);
	}

	

	

}
