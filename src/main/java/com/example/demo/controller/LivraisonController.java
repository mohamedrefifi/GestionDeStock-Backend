package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.LivraisonService;
import com.example.demo.controller.api.LivraisonApi;
import com.example.demo.model.Livraison;

@RestController
public class LivraisonController implements LivraisonApi {
	

	private LivraisonService livraisonService;
	@Autowired
	
	public LivraisonController(LivraisonService livraisonService)
	{
		this.livraisonService=livraisonService;
	}

	@Override
	public Livraison save(Livraison livraison) {
		if(livraison==null)
		{
		return null;
	}
		return livraisonService.save(livraison);
	}

	@Override
	public Optional<Livraison> FindById(Integer id) {
		 if(id==null)
		 {
			 return null;
		 }
		 return livraisonService.FindById(id);
	}

	@Override
	public List<Livraison> FindAll() {
		return livraisonService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		livraisonService.Delete(id);
	}

}