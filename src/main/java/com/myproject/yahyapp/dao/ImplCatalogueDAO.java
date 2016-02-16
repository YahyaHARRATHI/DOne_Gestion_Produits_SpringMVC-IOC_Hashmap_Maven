package com.myproject.yahyapp.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

public class ImplCatalogueDAO  implements ICatalogueDAO{

	Map<String, Produit> listmap=new HashMap<String, Produit>();
	Logger logger=Logger.getLogger(ImplCatalogueDAO.class);
	@Override
	public void ajouterProduit(Produit p) {
		listmap.put(p.getReference(), p);
		
		
	}

	@Override
	public List<Produit> consulterTous() {
		Collection<Produit> colect =listmap.values();
		return new ArrayList<Produit>(colect);
	}

	@Override
	public List<Produit> consulterParNom(String mc) {
		List<Produit> l=new ArrayList<Produit>();
			for(Produit p:listmap.values()){
				if(p.getDesignation().contains(mc)==true)
					l.add(p);
					
			}
		return l;
	}

	@Override
	public Produit consulterUnProduit(String ref) {
		return listmap.get(ref);
	}

	@Override
	public void supprimer(String ref) {
		listmap.remove(ref);
	}

	@Override
	public void mettreAJour(Produit p) {

		
		listmap.replace(p.getReference(), p);
	}
	

	public void init(){
		logger.info("myyyyyyyyyyyyy initialisation");
		ajouterProduit(new Produit("SAZ3", "123", 1200, 15));
		ajouterProduit(new Produit("hgy", "azr", 2000, 10));
	}
}
