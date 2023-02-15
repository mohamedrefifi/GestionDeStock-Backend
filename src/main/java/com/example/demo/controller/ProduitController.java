package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.FactureService;
import com.example.demo.Service.ProduitService;
import com.example.demo.controller.api.ProduitApi;
import com.example.demo.model.Commande;
import com.example.demo.model.Facture;
import com.example.demo.model.Produits;

@RestController
public class ProduitController implements ProduitApi {

	private ProduitService produitService;
	
	@Autowired
	public ProduitController(ProduitService produitService)
	{
		this.produitService=produitService;
	}

	@Override
	public Produits save(Produits produits) {
		if(produits==null)
		{
		return null;
	}
		return produitService.save(produits);
	}

	@Override
	public Optional<Produits> FindById(Integer id) {
		 if(id==null)
		 {
			 return null;
		 }
		 return produitService.FindById(id);
	}

	@Override
	public List<Produits> FindAll() {
		return produitService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		produitService.Delete(id);
	}

	@Override
	public List<Produits> findproduitbyidcategory(Integer id) {
		if(id==null)
		{
			return null;
		}
		return produitService.findproduitbyidcategory(id);
	}

	@Override
	public List<Commande> historiquecommandebyproduits(Integer id) {
		if(id==null)
		{
			return null;
		}
		return produitService.historiquecommandebyproduits(id);
	}

	@Override
	public List<Facture> historiqueDeVente(Integer id) {
		if(id==null)
		{
			return  null;
		}
		return produitService.historiqueDeVente(id);
	}

}
