package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.CategoryRepository;
import com.example.demo.Service.CategoryService;
import com.example.demo.model.Category;

@Service
public class CategoryServiceImpl implements CategoryService{
	
	private CategoryRepository categoryRepository;
	
	public CategoryServiceImpl (CategoryRepository categoryRepository)

	{
		this.categoryRepository=categoryRepository;
	}
	@Override
	public Category save(Category category) {
	if(category==null)
	{
		return null;
	}
	return categoryRepository.save(category);
	}

	@Override
	public Optional<Category> FindById(Integer id) {
		if(id==null)
		{
			return  null;
		}
		
		Optional<Category>cOptional=categoryRepository.findById(id);
		return Optional.of(cOptional.get());
	}

	@Override
	public List<Category> FindAll() {
	return categoryRepository.findAll().stream()
			.collect(Collectors.toList());
	}
	

	@Override
	public void Delete(Integer id) {
if(id==null)
{
return ;	
}
categoryRepository.deleteById(id);
	}

}
