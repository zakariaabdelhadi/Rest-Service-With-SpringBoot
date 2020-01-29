package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


//pour exposer l interface comme un web service
@RepositoryRestResource
public interface EtudiantRepo extends JpaRepository<Etudiant, Long> {
	
	//public List<Etudiant> findAll();

/*	
	@Query("select * from Etudiant e where e.nom like :x")
	public List<Etudiant> findBynom(@Param("x") String nom);
	*/

}
