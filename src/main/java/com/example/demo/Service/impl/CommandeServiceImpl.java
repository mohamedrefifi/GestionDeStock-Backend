package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.CommandeRepository;
import com.example.demo.Service.CommandeService;
import com.example.demo.model.Commande;

@Service
public class CommandeServiceImpl implements CommandeService {

	private CommandeRepository commandeRepository;
	
	public CommandeServiceImpl (CommandeRepository commandeRepository)

	{
		this.commandeRepository=commandeRepository;
	}
	@Override
	public Commande save(Commande commande) {
	if(commande==null)
	{
		return null;
	}
	return commandeRepository.save(commande);
	}

	@Override
	public Optional<Commande> FindById(Integer id) {
		if(id==null)
		{
			return  null;
		}
		
		Optional<Commande>cOptional=commandeRepository.findById(id);
		return Optional.of(cOptional.get());
	}

	@Override
	public List<Commande> FindAll() {
	return commandeRepository.findAll().stream()
			.collect(Collectors.toList());
	}
	

	@Override
	public void Delete(Integer id) {
if(id==null)
{
return ;	
}
commandeRepository.deleteById(id);
	}

}


