package ua.forself.service;

import java.util.List;

import ua.forself.entity.Profile;

public interface ProfileService {

	
	void saveProfile(Profile profile);
	
	Profile findProfileById(int id);
	
	List<Profile> findAllProfile();
}
