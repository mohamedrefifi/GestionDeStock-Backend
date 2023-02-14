package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.UtilisateurService;
import com.example.demo.controller.api.UtilisateurApi;
import com.example.demo.model.Utilisateur;

@RestController
public class UtilisateurController implements UtilisateurApi{

	private UtilisateurService utilisateurService;
	
	
	public UtilisateurController(UtilisateurService utilisateurService)
	{
		this.utilisateurService=utilisateurService;
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		if(utilisateur==null)
		{
		return null;
	}
		return utilisateurService.save(utilisateur);
	}

	@Override
	public Optional<Utilisateur> FindById(Integer id) {
		 if(id==null)
		 {
			 return null;
		 }
		 return utilisateurService.FindById(id);
	}

	@Override
	public List<Utilisateur> FindAll() {
		return utilisateurService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		utilisateurService.Delete(id);
	}

}
