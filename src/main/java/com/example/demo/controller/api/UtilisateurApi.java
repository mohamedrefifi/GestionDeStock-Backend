package com.example.demo.controller.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Utilisateur;



public interface UtilisateurApi {
	@PostMapping(value = "/stk/utilisateur/save")
    Utilisateur save(@RequestBody Utilisateur utilisateur);
	
	@GetMapping(value = "/stk/utilisateur/find/{id}")
	Optional<Utilisateur> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/stk/utilisateur/find/all")
	List <Utilisateur> FindAll();
	
	@DeleteMapping(value = "/stk/utilisateur/delete/{id}")
	void Delete (@PathVariable("id")Integer id);
}
