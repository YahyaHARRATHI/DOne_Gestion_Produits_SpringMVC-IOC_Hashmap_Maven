package com.myproject.yahyapp.dao;

import java.util.List;

public interface ICatalogueDAO {
	
	public void ajouterProduit(Produit p);
	public List<Produit> consulterTous();
	public List<Produit> consulterParNom(String mc);
    public Produit consulterUnProduit(String ref);
    public void supprimer(String ref);
    public void mettreAJour(Produit p);
    

}
