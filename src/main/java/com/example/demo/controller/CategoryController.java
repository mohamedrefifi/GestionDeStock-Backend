package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.CategoryService;
import com.example.demo.controller.api.CategoryApi;
import com.example.demo.model.Category;

@RestController
public class CategoryController implements CategoryApi{
	
	private CategoryService categoryService;
	@Autowired
	
	public CategoryController(CategoryService categoryService)
	{
		this.categoryService=categoryService;
	}

	@Override
	public Category save(Category category) {
		if(category==null)
		{
		return null;
	}
		return categoryService.save(category);
	}

	@Override
	public Optional<Category> FindById(Integer id) {
		 if(id==null)
		 {
			 return null;
		 }
		 return categoryService.FindById(id);
	}

	@Override
	public List<Category> FindAll() {
		return categoryService.FindAll();
	}

	@Override
	public void Delete(Integer id) {
		if(id==null)
		{
			return;
		}
		categoryService.Delete(id);
	}

}
