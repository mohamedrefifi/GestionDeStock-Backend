package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.ProduitsRepository;
import com.example.demo.Service.ProduitService;
import com.example.demo.model.Produits;

@Service
public class ProduitServiceImpl implements ProduitService {


	private ProduitsRepository produitsRepository;
	
	public ProduitServiceImpl (ProduitsRepository produitsRepository)

	{
		this.produitsRepository=produitsRepository;
	}
	@Override
	public Produits save(Produits produits) {
	if(produits==null)
	{
		return null;
	}
	return produitsRepository.save(produits);
	}

	@Override
	public Optional<Produits> FindById(Integer id) {
		if(id==null)
		{
			return  null;
		}
		
		Optional<Produits>cOptional=produitsRepository.findById(id);
		return Optional.of(cOptional.get());
	}

	@Override
	public List<Produits> FindAll() {
	return produitsRepository.findAll().stream()
			.collect(Collectors.toList());
	}
	

	@Override
	public void Delete(Integer id) {
if(id==null)
{
return ;	
}
produitsRepository.deleteById(id);
	}

}

