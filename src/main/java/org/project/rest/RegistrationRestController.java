package org.project.rest;

import java.util.Map;

import org.project.blindings.User;
import org.project.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
public class RegistrationRestController {
	@Autowired
	private RegistrationService regService;
	
	
	@GetMapping("/emailcheck/{email}")
	public String checkEmail(@PathVariable String email) {
		boolean emailstastus=regService.uniqueEmail(email);
		if(emailstastus) {
			return "Unique";
		}
	
		return "Duplicate";
	}
	
	@GetMapping("/countries")
	public Map<Integer,String> getCountries(){
		Map<Integer,String> countries=regService.getCountries();
		return countries;
		
		}
	@GetMapping("/cities/{countryId}")
	public Map<Integer,String> getStates(@PathVariable Integer countryId){
		return regService.getStates(countryId);
		}
	@GetMapping("/cities/{stateId}")
	public Map<Integer,String> getCities(@PathVariable Integer satateId){
		Map<Integer,String> cities=regService.getCities(satateId);
		return cities;
	}
	@PostMapping("/saveUser")
	public String saveUser(@RequestBody User user) {
		boolean registerUser=regService.registerUser(user);
		if(registerUser) {
			return "SUCESS";
		}else {
			return "failure";
		}

		
	}
	
}
