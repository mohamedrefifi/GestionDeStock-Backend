package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Livraison;



public interface LivraisonService {
	  Livraison save(Livraison livraison);
		
		Optional<Livraison> FindById (Integer id);
		
		List <Livraison> FindAll();
		
		void Delete (Integer id);
}
