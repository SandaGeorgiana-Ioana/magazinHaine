package com.magazinHaine.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Produselemele")
public class ListaProduseleMele {
	@Id
private int id;
private String nume;
private String colectie;
private String pret;
public ListaProduseleMele(int id, String nume, String colectie, String pret) {
	super();
	this.id = id;
	this.nume = nume;
	this.colectie = colectie;
	this.pret = pret;
}
public ListaProduseleMele() {
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
