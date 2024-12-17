package com.magazinHaine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produs {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nume;
	private String colectie;
	private String pret;
	public Produs(int id, String nume, String colectie, String pret) {
		super();
		this.id = id;
		this.nume = nume;
		this.colectie = colectie;
		this.pret = pret;
	}
	public Produs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getColectie() {
		return colectie;
	}
	public void setColectie(String colectie) {
		this.colectie = colectie;
	}
	public String getPret() {
		return pret;
	}
	public void setPret(String pret) {
		this.pret = pret;
	}
	
	
	
}
