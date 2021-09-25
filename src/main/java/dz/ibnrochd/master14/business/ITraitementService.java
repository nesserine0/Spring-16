package dz.ibnrochd.master14.business;

import java.util.List;

import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.LigneConsultation;

import dz.ibnrochd.master14.model.Traitement;

public interface ITraitementService {

	
     List <Traitement> listDesTraitement() ;
	 
	 
	 List <Traitement> listDesConsultationDuneLigne(LigneConsultation ligneConsultation) ;
	 
	 List <Traitement> listDesConsultationDuneConsultation(Consultation consultation) ;

	
	void creerTraitement(Traitement traitement);
	
	void deleteTraitement(Traitement traitement);
	
	void updateTraitement(Long id , Traitement traitement);
}
