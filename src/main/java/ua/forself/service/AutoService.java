package ua.forself.service;

import java.util.List;

import ua.forself.entity.Autorization;



public interface AutoService {
	
void saveAutorization(Autorization autorization);
	
	List<Autorization> findAllAutorization();
	
	Autorization findCorrectAutorization(String model);
}
