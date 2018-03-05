package ua.forself.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.forself.entity.Autorization;



@Repository
public interface AutoRepository  extends JpaRepository<Autorization, Integer>{

//	Autorization findCorrectAutorization(Autorization autorization); 

	
	@Query("Select a from Autorization a where a.login1 = :login1")
	Autorization findCorrectAutorization(@Param ("login1")String model);
	
	@Query("Select a from Autorization a where  a.password1 = :password1")
	Autorization findCorrectAutorization1(@Param ("password1")String model);
}
