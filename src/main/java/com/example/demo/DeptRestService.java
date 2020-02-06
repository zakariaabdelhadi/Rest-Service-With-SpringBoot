package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class DeptRestService {

	
	@Autowired
	DeptRepo deptRepository;
	@Autowired
	EmployeRepo employeRepository;
	
	
//	@GetMapping(value = "/getlistDept/{nom}")
//	public List<Employe> getEmp(@PathVariable(name = "nom") String nom) {
//		deptRepository.
//		List < Departement > dep = deptRepository.findByNomContains(nom);
//	//	System.out.println("trying to find " + nom + " found : " + dep.size());
//		if (dep.size() == 0) return null;
//		List < Employe > emps = new ArrayList < Employe >();
//		for (Employe emp : dep.get(0).getListEmp()) {
//			emps.add(emp);
//		}
//		return emps;
//
//	}
//	
	
	
	
	@PostMapping(value = "/create/{nbr1}/{nbr2}")
	public void creation(@PathVariable(name = "nbr1")int nbr1,@PathVariable(name = "nbr2")int nbr2) {
		
		Departement depts[] = new Departement[nbr2];
		
		for(int i=0;i<nbr2;i++) {
			depts[i] = new Departement(null, "dept"+i,null);
			deptRepository.save(depts[i]);
		}
		for(int i=0;i<nbr1;i++) {
		employeRepository.save(new Employe(null,"prenom"+i,"nom"+i,"mail"+i,depts[i % nbr2]));
		}
		
		
		
	
	
		
		
		
	}

}
