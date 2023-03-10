package com.example.demo.controller.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.MvtStock;


public interface MvtStkApi {

	@PostMapping(value = "/stk/mvtstk/save")
	MvtStock mouvementDeStock (@RequestBody @Valid MvtStock mvtStock);
	
	@GetMapping(value = "/stk/mvtstk/find/{id}")
	Optional<MvtStock> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/stk/mvtstk/find/all")
	List <MvtStock> FindAll();
	
	@DeleteMapping(value = "/stk/mvtstk/delete/{id}")
	void Delete (@PathVariable("id")Integer id);
	
	@GetMapping(value = "/stk/mvtstk/stkreel/{id}")
	Float StockReelProduit (@PathVariable("id") Integer id);
	

}
