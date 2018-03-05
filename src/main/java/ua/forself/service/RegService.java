package ua.forself.service;

import java.util.List;

import ua.forself.entity.Autorization;
import ua.forself.entity.Registration;


public interface RegService  {

	void saveRegistation(Registration registration);
	
	List<Registration> findAllRegistration();
	
	Registration findRegistrationById(int id);
	
	Registration findRegistraionByLogin1(String model);
	
	//Registration findConfirmationPassword(Registration registration);
	

}
