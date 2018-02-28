package ua.forself.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.forself.entity.Autorization;



@Repository
public interface AutoRepository  extends JpaRepository<Autorization, Integer>{ 

	
	@Query("Select r from Autorization r where r.login1 = :login1 and r.password1 = :password1")
	Autorization findCorrectAutorization(@Param ("login1")String model,@Param ("password1")String model1);
}
