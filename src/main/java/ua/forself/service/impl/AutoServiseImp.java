package ua.forself.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.forself.entity.Autorization;
import ua.forself.entity.Registration;
import ua.forself.repository.AutoRepository;
import ua.forself.service.AutoService;


@Service
public class AutoServiseImp implements AutoService  {

	@Autowired 
	private AutoRepository autoRepository;
	
	@Override
	public void saveAutorization(Autorization autorization) {
		autoRepository.save(autorization);
		
	}

	@Override
	public List<Autorization> findAllAutorization() {
		
		return autoRepository.findAll();
	}

	@Override
	public Autorization findCorrectAutorization(String model) {
		
		return autoRepository.findCorrectAutorization(model);
	}

	@Override
	public Autorization findCorrectAutorization1(String model) {
		
		return autoRepository.findCorrectAutorization1(model);
	}

	@Override
	public Autorization findAutorizationById(int id) {
		
		 return autoRepository.findOne(id);
	}


//	@Override
//	public Autorization findCorrectAutorization(Autorization autorization) {
//		
//		return autoRepository.findCorrectAutorization(autorization);
//	}





}
