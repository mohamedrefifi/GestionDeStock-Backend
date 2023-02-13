package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Commande;



public interface CommandeService {
	  Commande save(Commande commande);
		
		Optional<Commande> FindById (Integer id);
		
		List <Commande> FindAll();
		
		void Delete (Integer id);
}
