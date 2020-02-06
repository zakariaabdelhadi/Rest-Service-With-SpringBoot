package com.example.demo;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface EmployeRepo extends JpaRepository<Employe, Long> {

	// ***************************** GET ***************************************

	//pour retourner tt les employers 
	//http://localhost:8080/employes
	@RestResource(path = "all")
	public List<Employe> findAll();
	
// pour recuperer avec l ID il suffit just d ajouter l id a la fin de l URI
	//http://localhost:8080/employes/1   
	
// get by name & prenom
	@RestResource(path = "byNom")
	public List<Employe> findByNomContains(@Param("nom") String nom);

	@RestResource(path = "byPrenom")
	public List<Employe> findByPrenomContains(@Param("prenom") String x);
	
	// ***************************** PUT ***************************************
	
	//il sufit just d utiliser cette uri + specifiction de la méthode crud
	//http://localhost:8080/employes/1
	//et remplir le Body
	
	// ***************************** Patch ***************************************
	
	
		//il sufit just d utiliser cette uri + specifiction de la méthode crud
		//http://localhost:8080/employes/1
	//et remplir le Body
	// ***************************** Post ***************************************
	
		//il sufit just d utiliser cette uri + specifiction de la méthode crud
		//http://localhost:8080/employes
	//et remplir le Body
	// ***************************** Delete ***************************************
	//il sufit just d utiliser cette uri + specifiction de la méthode crud
			//http://localhost:8080/employes/1

	//@RestResource(path = "byNomPage")
	//public Page<Employe> findByNomContains(@Param("nom") String nom, Page <Employe> ablepageable);
//	//http://localhost:8080/employes/search/byNomPage?nom=nom1&page=1&size=1

}
