package dz.ibnrochd.master14.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dz.ibnrochd.master14.business.IConsultationService;
import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.business.ITraitementService;

@Controller
public class MyController {

	@Autowired
	private IPatientService iPatientService;
	
	@Autowired
	private ITraitementService iTraitementService;
	
	@Autowired
	private IConsultationService iConsultationService;
	
	@RequestMapping(value = { "/","/patients/liste" },method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("liste", iPatientService.listeDesPatients());	
		return "ListeView"; 
	}
}
