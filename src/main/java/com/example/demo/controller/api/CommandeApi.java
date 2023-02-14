package com.example.demo.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Commande;



public interface CommandeApi {

	@PostMapping(value = "/stk/commande/save")
    Commande save(@RequestBody Commande commande);
	
	@GetMapping(value = "/stk/commande/find/{id}")
	Optional<Commande> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/stk/commande/find/all")
	List <Commande> FindAll();
	
	@DeleteMapping(value = "/stk/commande/delete/{id}")
	void Delete (@PathVariable("id")Integer id);
}
