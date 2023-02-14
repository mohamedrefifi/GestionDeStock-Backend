package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.FournisseurService;
import com.example.demo.controller.api.FournisseurApi;
import com.example.demo.model.Fournisseur;

@RestController
public class FournisseurController implements FournisseurApi{
	
	
	private FournisseurService fournisseurService;
	@Autowired
	
	public FournisseurController(FournisseurService fournisseurService)
	{
		this.fournisseurService=fournisseurService;
	}

	@Override
	public Fournisseur save(Fournisseur fournisseur) {
		if(fournisseur==null)
		{
		return null;
	}
		return fournisseurService.save(fournisseur);
	}

	@Override
	public Optional<Fournisseur> FindById(Integer id) {
		 if(id==null)
		 {
			 return null;
		 }
		 return fournisseurService.FindById(id);
	}

	@Override
	public List<Fournisseur> FindAll() {
		return fournisseurService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		fournisseurService.Delete(id);
	}

}