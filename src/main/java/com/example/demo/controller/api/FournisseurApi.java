package com.example.demo.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Fournisseur;


public interface FournisseurApi {

	@PostMapping(value = "/stk/fournisseur/save")
    Fournisseur save(@RequestBody Fournisseur fournisseur);
	
	@GetMapping(value = "/stk/fournisseur/find/{id}")
	Optional<Fournisseur> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/stk/fournisseur/find/all")
	List <Fournisseur> FindAll();
	
	@DeleteMapping(value = "/stk/fournisseur/delete/{id}")
	void Delete (@PathVariable("id")Integer id);
}
