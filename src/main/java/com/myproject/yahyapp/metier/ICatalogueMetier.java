package com.myproject.yahyapp.metier;



import java.util.List;

import com.myproject.yahyapp.dao.Produit;

public interface ICatalogueMetier {
	
	public void ajouterProduit(Produit p);
	public List<Produit> consulterTous();
	public List<Produit> consulterParNom(String ref);
	public Produit ConsulterUnProduit(String ref);
	public void MettreAJour(Produit p);
	public void supprimer(String ref);
	

}
