package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class EmployeRestService {
	@Autowired
	EmployeRepo employeRepository;

	
	//*********************************** GET *****************************************************
	// http://localhost:8080/listEmployes
	//retourner tt les employers dans un tableau array (sans l encapsulation dans embedded)
	@GetMapping(value = "/listEmployes")
	public List<Employe> getAllEmp() {
		return employeRepository.findAll();
	}
	

	//retourner un employer By Id 
	// cette fonction retourne un seul objet JSON
	@GetMapping(value = "/listEmployes/{id}")
	public Employe getEmp(@PathVariable(name = "id") Long id) {
		return employeRepository.findById(id).get();

	}
	
	//retourner un employer By Nom
		// cette fonction retourne une liste d'objets JSON (sans embedded) 
		@GetMapping(value = "/getlistEmployes/{nom}")
		public List<Employe> getEmp(@PathVariable(name = "nom") String nom) {
			return  employeRepository.findByNomContains(nom);

		}
	//*********************************** PUT *****************************************************

	
	//modifier un Employer par Id
	@PutMapping(value = "/listEmployes/{id}")
	public Employe updateEmp(@PathVariable(name = "id") Long id, @RequestBody Employe emp) {
		emp.setId(id);
		return employeRepository.save(emp);
	}
	
	

	//*********************************** POST *****************************************************

	// Creer un employer 
	@PostMapping(value = "/listEmployes")
	public Employe save(@RequestBody Employe emp) {
		
		return employeRepository.save(emp);
		
		
	}
	
	
	//*********************************** Delete *****************************************************


	// delete By id
	@DeleteMapping(value = "/deleteById/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		employeRepository.deleteById(id);
	}

	//delete By name
	@DeleteMapping(value = "/deleteByNom/{nom}")
	public void delete(@PathVariable(name = "nom") String nom) {
		for (Employe employe : employeRepository.findByNomContains(nom)) {
			employeRepository.deleteById(employe.getId());
		}
	}

	

}
