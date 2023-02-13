package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.FournisseurRepository;
import com.example.demo.Service.FournisseurService;
import com.example.demo.model.Fournisseur;

@Service
public class FournisseurServiceImpl implements FournisseurService{

	private FournisseurRepository fournisseurRepository;
	
	public FournisseurServiceImpl (FournisseurRepository fournisseurRepository)

	{
		this.fournisseurRepository=fournisseurRepository;
	}
	@Override
	public Fournisseur save(Fournisseur fournisseur) {
	if(fournisseur==null)
	{
		return null;
	}
	return fournisseurRepository.save(fournisseur);
	}

	@Override
	public Optional<Fournisseur> FindById(Integer id) {
		if(id==null)
		{
			return  null;
		}
		
		Optional<Fournisseur>cOptional=fournisseurRepository.findById(id);
		return Optional.of(cOptional.get());
	}

	@Override
	public List<Fournisseur> FindAll() {
	return fournisseurRepository.findAll().stream()
			.collect(Collectors.toList());
	}
	

	@Override
	public void Delete(Integer id) {
if(id==null)
{
return ;	
}
fournisseurRepository.deleteById(id);
	}

}



