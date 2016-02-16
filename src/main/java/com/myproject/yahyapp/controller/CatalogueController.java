package com.myproject.yahyapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproject.yahyapp.dao.Produit;
import com.myproject.yahyapp.metier.ICatalogueMetier;


@Controller
public class CatalogueController {
	
	@Autowired
	private ICatalogueMetier metier;
	
	@RequestMapping(value="/index")
	public String index(Model model){
		model.addAttribute("produit",new Produit());
		model.addAttribute("produits",metier.consulterTous());
		
		return "home";
	}
	
	@RequestMapping(value="/saveProduit")
	public String saveProduit(@Valid Produit p,BindingResult bindingresult,Model model){
		if(bindingresult.hasErrors())
		{
			model.addAttribute("produits",metier.consulterTous());
			return "home";
		}
		//ajouter les données saisies dan hashmap
		metier.ajouterProduit(p);
		//pour stocker les données de formulaire dans ce bean
		model.addAttribute("produit",new Produit());
		// pour afficher tous les produit dans la boucle <c:foreach
		model.addAttribute("produits", metier.consulterTous());
		
		
		
		return "home";
	}
	
	@RequestMapping(value="/supprimer")
	public String supprimer(@RequestParam String ref,Model model){
		metier.supprimer(ref);
		model.addAttribute("produit", new Produit());
		model.addAttribute("produits", metier.consulterTous());
		return "home";
	}
	
	@RequestMapping(value="/modifier")
	public String modifier(@RequestParam String ref,Model model){
		model.addAttribute("produit", metier.ConsulterUnProduit(ref));
		metier.supprimer(ref);
		model.addAttribute("produits",metier.consulterTous());
		return "home";
	}

}
