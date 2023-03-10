package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Commande;
import com.example.demo.model.Facture;
import com.example.demo.model.Produits;


public interface ProduitService {
	  Produits save(Produits produits);
		
		Optional<Produits> FindById (Integer id);
		
		List <Produits> FindAll();
		
		void Delete (Integer id);
		
		 List <Produits> findproduitbyidcategory (Integer id);
		 
		 List <Commande> historiquecommandebyproduits (Integer id);
		 
		 
		 List <Produits> updateproduit (Integer id);
		 
		 List <Facture> historiqueDeVente (Integer id);

}
