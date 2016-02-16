package com.myproject.yahyapp.dao;

import java.io.Serializable;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Produit implements Serializable{
	@NotEmpty
	@Size(max=12,min=4)
	private String designation;
	@NotEmpty
	private String reference;
	@DecimalMin(value="100")
	private double prix;
	private int quantite;
	
	public Produit(String designation, String reference, double prix, int quantite) {
		super();
		this.designation = designation;
		this.reference = reference;
		this.prix = prix;
		this.quantite = quantite;
	}

	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	

}
