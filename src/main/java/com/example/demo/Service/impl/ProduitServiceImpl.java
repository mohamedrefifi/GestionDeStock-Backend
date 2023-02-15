package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.CommandeRepository;
import com.example.demo.Repository.FactureRepository;
import com.example.demo.Repository.ProduitsRepository;
import com.example.demo.Service.ProduitService;
import com.example.demo.model.Commande;
import com.example.demo.model.Facture;
import com.example.demo.model.Produits;

@Service
public class ProduitServiceImpl implements ProduitService {


	private ProduitsRepository produitsRepository;
	
	private CommandeRepository commandeRepository;
	
	private FactureRepository factureRepository ;
	
	public ProduitServiceImpl (ProduitsRepository produitsRepository , 
			CommandeRepository commandeRepository,
			FactureRepository factureRepository 
			)

	{
		this.produitsRepository=produitsRepository;
		this.commandeRepository=commandeRepository;
		this.factureRepository=factureRepository;
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
	@Override
	public List<Produits> findproduitbyidcategory(Integer id) {
		if(id==null)
		{
			return null;
		}
		return produitsRepository.findproduitbyidcategory(id).stream()
				.collect(Collectors.toList());
	}
	@Override
	public List<Commande> historiquecommandebyproduits(Integer id) {
     if(id==null)
     {
    	 return null;
     }
     return commandeRepository.findALLByProduitsId(id);
	}
	@Override
	public List<Produits> updateproduit(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Facture> historiqueDeVente(Integer id) {
		if(id==null)
		{
			return null;
		}
		return factureRepository.findAllByProduitsId(id);
	}

}

