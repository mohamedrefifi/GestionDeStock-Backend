package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Fournisseur;



public interface FournisseurService {

	   Fournisseur save(Fournisseur fournisseur);
		
		Optional<Fournisseur> FindById (Integer id);
		
		List <Fournisseur> FindAll();
		
		void Delete (Integer id);
}
