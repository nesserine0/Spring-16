package dz.ibnrochd.master14;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.system.OutputCaptureExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import dz.ibnrochd.master14.business.IPatientService;
import dz.ibnrochd.master14.model.Patient;


@SpringBootTest
@AutoConfigureMockMvc
class TestApp {

	
	@Autowired
	private MockMvc mockMvc;
	
	@Autowired
	private ObjectMapper objectMapper;
	
	
	@MockBean
	private IPatientService iPatientService;
	
	
	@Test
	public void test() throws JsonProcessingException, Exception {
		
		 objectMapper = new ObjectMapper();
		
		 Date date = new GregorianCalendar(2010, Calendar.FEBRUARY, 11).getTime();

		   
		Patient patient=new Patient ("TestNess", "TestPrenom","f", date, "058947000","alger");
		
		System.out.println( "age de ce patient est "+patient.getAge());
		
		mockMvc.perform(post("/ajouterPatient").contentType("application/json")
				                               .content(objectMapper.writeValueAsString(patient)))
		                                       .andExpect(status().isOk())
		                                      ;
				
				
	}

}
