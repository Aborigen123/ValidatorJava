package ua.forself.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.forself.entity.Profile;
import ua.forself.repository.ProfileRepository;
import ua.forself.service.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {

	@Autowired private ProfileRepository profileRepository;
	
	
	
	@Override
	public void saveProfile(Profile profile) {
		profileRepository.save(profile);
		
	}

	@Override
	public Profile findProfileById(int id) {
		
		return profileRepository.findOne(id);
	}

	@Override
	public List<Profile> findAllProfile() {
		
		return profileRepository.findAll();
	}

}
