package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource

public interface DeptRepo extends JpaRepository<Departement, Long> {

	
	@RestResource(path = "byDeptNom")
	public List<Departement> findByNomContains(@Param("nom") String nom);
	
	
}
