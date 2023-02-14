package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CommandeService;
import com.example.demo.controller.api.CommandeApi;
import com.example.demo.model.Commande;

@RestController
public class CommandeController implements CommandeApi {

	private CommandeService commandeService;

	@Autowired
	public CommandeController(CommandeService commandeService)
	{
		this.commandeService=commandeService;
	}

	@Override
	public Commande save(Commande commande) {
		if(commande==null)
		{
		return null;
	}
		return commandeService.save(commande);
	}

	@Override
	public Optional<Commande> FindById(Integer id) {
		 if(id==null)
		 {
			 return null;
		 }
		 return commandeService.FindById(id);
	}

	@Override
	public List<Commande> FindAll() {
		return commandeService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		commandeService.Delete(id);
	}

}
