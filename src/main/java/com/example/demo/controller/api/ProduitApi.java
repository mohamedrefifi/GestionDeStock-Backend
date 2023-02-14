package com.example.demo.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Produits;


public interface ProduitApi {

	@PostMapping(value = "/stk/produits/save")
    Produits save(@RequestBody Produits produits);
	
	@GetMapping(value = "/stk/produits/find/{id}")
	Optional<Produits> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/stk/produits/find/all")
	List <Produits> FindAll();
	
	@DeleteMapping(value = "/stk/produits/delete/{id}")
	void Delete (@PathVariable("id")Integer id);
	
	
	@GetMapping(value = "/stk/produits/find/category/{id}")
	 List <Produits> findproduitbyidcategory (@PathVariable("id") Integer id);
}
