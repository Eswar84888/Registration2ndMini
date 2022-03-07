package org.project.service;

import java.util.Map;

import org.project.blindings.User;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationService {
     public boolean uniqueEmail(String email);
     public Map<Integer,String> getCountries();
     public Map<Integer,String> getStates(Integer countryId);
     public Map<Integer,String> getCities(Integer stateID);
     public boolean registerUser(User user);
}
