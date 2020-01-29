package com.example.demo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface EmployeRepo extends JpaRepository<Employe, Long> {

	@RestResource(path = "all")
	public List<Employe> findAll();

	@RestResource(path = "byNom")
	public List<Employe> findByNomContains(@Param("nom") String nom);

	@RestResource(path = "byPrenom")
	public List<Employe> findByPrenomContains(@Param("prenom") String x);

	
//	public Page<Employe> findByNomContains(@Param("nom") String nom, Page <Employe> ablepageable);
//	//http://localhost:8080/employes/search/byNomPage?nom=nom1&page=1&size=1

}
