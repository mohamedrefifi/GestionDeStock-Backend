package com.example.demo.controller.api;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Category;

public interface CategoryApi {

	@PostMapping(value = "/stk/category/save")
    Category save(@RequestBody @Valid Category category);
	
	@GetMapping(value = "/stk/category/find/{id}")
	Optional<Category> FindById (@PathVariable("id") Integer id);
	
	@GetMapping(value = "/stk/category/find/all")
	List <Category> FindAll();
	
	@DeleteMapping(value = "/stk/category/delete/{id}")
	void Delete (@PathVariable("id")Integer id);
}
