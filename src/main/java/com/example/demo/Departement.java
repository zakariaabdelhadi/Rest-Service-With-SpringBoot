package com.example.demo;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data

public class Departement {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	public Departement() {
		super();
	}
	@OneToMany(mappedBy = "dept")
	private Collection<Employe> listEmp;
	public Departement(Long id, String nom, Collection<Employe> listEmp) {
		super();
		this.id = id;
		this.nom = nom;
		this.listEmp = listEmp;
	}
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
	public Collection<Employe> getListEmp() {
		return listEmp;
	}
	public void setListEmp(Collection<Employe> listEmp) {
		this.listEmp = listEmp;
	}

}
