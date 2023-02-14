package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.FactureService;
import com.example.demo.controller.api.FactureApi;
import com.example.demo.model.Facture;

@RestController
public class factureController implements FactureApi {

	private FactureService factureService;
	@Autowired

	public factureController (FactureService factureService)
	{
		this.factureService=factureService;
	}
	@Override
	public Facture save(Facture facture) {
		if(facture==null)
		{
			return null;
		}
		return factureService.save(facture);
	}

	@Override
	public Optional<Facture> FindById(Integer id) {
		if(id==null)
		{
			return null;
		}
		return factureService.FindById(id);
	}

	@Override
	public List<Facture> FindAll() {
		return factureService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
     if (id==null)
     {
    	 return;
     }
     factureService.Delete(id);
	}

	
}
