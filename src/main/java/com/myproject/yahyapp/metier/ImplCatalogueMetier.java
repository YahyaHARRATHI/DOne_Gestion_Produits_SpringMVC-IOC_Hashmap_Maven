package com.myproject.yahyapp.metier;

import java.util.List;

import com.myproject.yahyapp.dao.ICatalogueDAO;
import com.myproject.yahyapp.dao.Produit;

public class ImplCatalogueMetier implements ICatalogueMetier {

	private ICatalogueDAO dao;
	
	
	
	public void setDao(ICatalogueDAO dao) {
		this.dao = dao;
	}

	public ICatalogueDAO getDao() {
		return dao;
	}

	@Override
	public void ajouterProduit(Produit p) {
		dao.ajouterProduit(p);
	}

	@Override
	public List<Produit> consulterTous() {
		return dao.consulterTous();
	}

	@Override
	public List<Produit> consulterParNom(String ref) {
		
		return dao.consulterParNom(ref);
	}

	@Override
	public Produit ConsulterUnProduit(String ref) {
		
		return dao.consulterUnProduit(ref);
	}

	@Override
	public void MettreAJour(Produit p) {
		dao.mettreAJour(p);

	}

	@Override
	public void supprimer(String ref) {
		dao.supprimer(ref);
	}

}
