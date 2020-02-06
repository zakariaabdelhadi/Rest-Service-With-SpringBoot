package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class MyMicroServiceApplication implements CommandLineRunner {

	
	@Autowired
	private EmployeRepo employeRepo;

	@Autowired
	private RepositoryRestConfiguration restConfig;

	public static void main(String[] args) {
		SpringApplication.run(MyMicroServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// cette ligne est ajouté pour acceder a l id a partir de l uri
	restConfig.exposeIdsFor(Employe.class);	
	restConfig.exposeIdsFor(Departement.class);	


	

//		employeRepo.save(new Employe(null, "zakaria", "zermani","zaki@NASA.us"));
//		employeRepo.save(new Employe(null, "mahdi", "achli","zaki@Harvard.us"));
//		employeRepo.save(new Employe(null, "mohamed", "boudissa","zaki@elmarrikh.us"));
//		employeRepo.save(new Employe(null, "nasro", "ghalmi","zaki@oclahoma.us"));
//

	}

}
