package com.example.demo.repository;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.login;

@Repository

public interface loginrepository extends CrudRepository<login, Integer>{

	@Query("SELECT l FROM login l WHERE l.email = ?1 AND l.password = ?2") 
	  String findByEmailandPassword(String email, String password);




}
