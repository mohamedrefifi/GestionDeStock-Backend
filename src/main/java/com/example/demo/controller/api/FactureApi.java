package com.example.demo.controller.api;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Facture;



public interface FactureApi {

	@PostMapping(value = "/stk/facture/save")
    Facture save(@RequestBody @Valid Facture facture);
	
	@GetMapping(value = "/stk/facture/find/{id}")
	Optional<Facture> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/stk/facture/find/all")
	List <Facture> FindAll();
	
	@DeleteMapping(value = "/stk/facture/delete/{id}")
	void Delete (@PathVariable("id")Integer id);
	
	@GetMapping(value = "/stk/facture/chiffreaffaire")
	BigDecimal chiffreaffaire ();
}
