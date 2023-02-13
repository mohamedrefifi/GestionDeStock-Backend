package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Utilisateur;

public interface UtilisateurService {

	  Utilisateur save(Utilisateur utilisateur);
		
		Optional<Utilisateur> FindById (Integer id);
		
		List <Utilisateur> FindAll();
		
		void Delete (Integer id);
}
