package com.example.demo;

import org.springframework.data.rest.core.config.Projection;

//cette interface pour par example retourner que qlq parametre (comme une projection du SQL)
//cela sera utiliser  par la suite dans l uri d'acee au service concerné 
//(localhost/....../etudiants?projection=projection1)

@Projection(name="proj1",types= {Employe.class})
public interface EmployeProjection {
	
	public String getNom();
	public  String getPrenom();

}
