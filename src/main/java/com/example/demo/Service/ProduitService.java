package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Produits;


public interface ProduitService {
	  Produits save(Produits produits);
		
		Optional<Produits> FindById (Integer id);
		
		List <Produits> FindAll();
		
		void Delete (Integer id);

}
