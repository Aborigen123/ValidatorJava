package ua.forself.service;

import java.util.List;

import ua.forself.entity.Autorization;
import ua.forself.entity.Profile;



public interface AutoService {
	
void saveAutorization(Autorization autorization);
	
	List<Autorization> findAllAutorization();
	
	Autorization findAutorizationById(int id);
	
	Autorization findCorrectAutorization(String model);
	
	Autorization findCorrectAutorization1(String model);
}
