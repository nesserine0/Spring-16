package dz.ibnrochd.master14.view;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import dz.ibnrochd.master14.business.IConsultationService;
import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.business.ITraitementService;
import dz.ibnrochd.master14.model.Patient;

@Controller
public class MyController implements ErrorController {

	private static final String Error_PATH="/error";
	@Autowired
	private IPatientService iPatientService;
	
	@Autowired
	private ITraitementService iTraitementService;
	
	@Autowired
	private IConsultationService iConsultationService;
	
	@RequestMapping(value = { "/" },method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("liste", iPatientService.listeDesPatients());	
		return "ListView"; 
	}
	
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	private String delete(@RequestParam (required = false ) Long id){
	    System.out.println("Patient_Id : "+id);
	  
	  try {
		   iPatientService.deletePatientByid(id);
		
	} catch (Exception e) {
		// TODO: handle exception
		 System.out.println(e);
		 return  "/error";
	} 
	    return "redirect:/";
	
	}
	
	
	

	    @RequestMapping("/error")
	    public String handleError() {
	       

	        return "error";
	    }
	
	
	
	

	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return Error_PATH;
	}
	
	
	
}
