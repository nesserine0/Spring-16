package dz.ibnrochd.master14.business;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.dao.LigneConsultationRepository;
import dz.ibnrochd.master14.dao.TraitementRepository;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;
import dz.ibnrochd.master14.model.Traitement;

@Service
public class TraitementService implements ITraitementService{

	@Autowired
	TraitementRepository traitementRepository;
	@Autowired
	LigneConsultationRepository ligneConsultationRepository;
	
	@Override
	public List<Traitement> listDesTraitement() {
		// TODO Auto-generated method stub
		return traitementRepository.findAll();
	}

	@Override
	public List<Traitement> listDesConsultationDuneLigne(LigneConsultation ligneConsultation) {
		// TODO Auto-generated method stub
		return traitementRepository.findByLigneConsultations(ligneConsultation);
	}

	@Override
	public void creerTraitement(Traitement traitement) {
		// TODO Auto-generated method stub
		traitementRepository.save(traitement);
	}

	@Override
	public void deleteTraitement(Traitement traitement) {
		// TODO Auto-generated method stub
		traitementRepository.delete(traitement);
	}

	@Override
	public void updateTraitement(Long id, Traitement traitement) {
		// TODO Auto-generated method stub
		Traitement t=traitementRepository.findById(id);
		t.setLigneConsultations(traitement.getLigneConsultations());
		t.setNom(traitement.getNom());
		traitementRepository.save(t);
	}

	@Override
	public List<Traitement> listDesConsultationDuneConsultation(Consultation consultation) {
		// TODO Auto-generated method stub
		
		List<Traitement> traitement=new ArrayList<>();
		 ligneConsultationRepository.findByConsultation(consultation)
		 .forEach(ligne->{
			 
			traitement.addAll(traitementRepository.findByLigneConsultations(ligne));
			
		 });
				
			 
			
		return traitement;
		
	}

}
