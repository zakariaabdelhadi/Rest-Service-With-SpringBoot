package com.example.demo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity




public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private Date datenaissance;
	@ManyToOne
	private Formation formation;
	
	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public String getPrenom() {
		return prenom;
	}



	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



	public Date getDatenaissance() {
		return datenaissance;
	}



	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}



	public Formation getFormation() {
		return formation;
	}



	public void setFormation(Formation formation) {
		this.formation = formation;
	}



	public Etudiant(Long id, String nom, String prenom, Date datenaissance, Formation formation) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = datenaissance;
		this.formation = formation;
	}



	public Etudiant() {
		super();
	}

	

}
