package ua.forself.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.forself.entity.Registration;
import ua.forself.repository.RegRepository;
import ua.forself.service.RegService;

@Service
public class RegServiceImpl implements RegService{

	@Autowired
	private RegRepository regRepository;
	
	@Override
	public void saveRegistation(Registration registration) {
		regRepository.save(registration);
		
	}

	@Override
	public List<Registration> findAllRegistration() {
		
		return regRepository.findAll();
	}

	@Override
	public Registration findRegistraionByLogin1(String model) {
		
		return regRepository.findRegistraionByLogin1(model);
	}

	@Override
	public Registration findConfirmationPassword(String model) {
		return regRepository.findConfirmationPassword(model, model);
	}




}
