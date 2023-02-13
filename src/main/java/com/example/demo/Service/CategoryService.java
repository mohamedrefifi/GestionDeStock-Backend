package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Category;



public interface CategoryService {

    Category save(Category category);
	
	Optional<Category> FindById (Integer id);
	
	List <Category> FindAll();
	
	void Delete (Integer id);

}
