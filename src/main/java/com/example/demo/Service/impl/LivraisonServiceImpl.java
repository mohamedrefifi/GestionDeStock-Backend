package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.LivraisonRepository;
import com.example.demo.Service.LivraisonService;

import com.example.demo.model.Livraison;

@Service
public class LivraisonServiceImpl implements LivraisonService{

	private LivraisonRepository livraisonRepository;
	
	public LivraisonServiceImpl (LivraisonRepository livraisonRepository)

	{
		this.livraisonRepository=livraisonRepository;
	}
	@Override
	public Livraison save(Livraison livraison) {
	if(livraison==null)
	{
		return null;
	}
	return livraisonRepository.save(livraison);
	}

	@Override
	public Optional<Livraison> FindById(Integer id) {
		if(id==null)
		{
			return  null;
		}
		
		Optional<Livraison>cOptional=livraisonRepository.findById(id);
		return Optional.of(cOptional.get());
	}

	@Override
	public List<Livraison> FindAll() {
	return livraisonRepository.findAll().stream()
			.collect(Collectors.toList());
	}
	

	@Override
	public void Delete(Integer id) {
if(id==null)
{
return ;	
}
livraisonRepository.deleteById(id);
	}

}


