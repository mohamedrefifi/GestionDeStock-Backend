package com.example.demo.controller.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Livraison;



public interface LivraisonApi {
	@PostMapping(value = "/stk/livraison/save")
    Livraison save(@RequestBody @Valid Livraison livraison);
	
	@GetMapping(value = "/stk/livraison/find/{id}")
	Optional<Livraison> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/stk/livraison/find/all")
	List <Livraison> FindAll();
	
	@DeleteMapping(value = "/stk/livraison/delete/{id}")
	void Delete (@PathVariable("id")Integer id);

}
