package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Facture;



public interface FactureService {
	  Facture save(Facture facture);
		
		Optional<Facture> FindById (Integer id);
		
		List <Facture> FindAll();
		
		void Delete (Integer id);
}
