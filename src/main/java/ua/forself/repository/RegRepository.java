package ua.forself.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ua.forself.entity.Registration;


@Repository
public interface RegRepository extends JpaRepository<Registration, Integer>{
	@Query("Select r from Registration r where r.login1 = :login1")
	Registration findRegistraionByLogin1(@Param ("login1")String model);

	
	
	//Registration findConfirmationPassword(Registration registration);
	
	
	

}
