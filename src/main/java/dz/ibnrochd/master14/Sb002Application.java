package dz.ibnrochd.master14;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.dao.PatientRepository;

@SpringBootApplication
public class Sb002Application implements CommandLineRunner {
	
	@Autowired
	PatientRepository patientRepository;
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO : récupérer la liste de tous les patients puis afficher leurs noms
		
		
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		
		
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le

				
		// TODO : rechercher la consultation ayant id=3 
		

		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
		
	}

}
