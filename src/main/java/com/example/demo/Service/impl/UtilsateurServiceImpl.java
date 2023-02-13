package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.example.demo.Repository.UtilisateurRepository;
import com.example.demo.Service.UtilisateurService;
import com.example.demo.model.Utilisateur;

@Service
public class UtilsateurServiceImpl implements UtilisateurService {
	
    private UtilisateurRepository utilisateurRepository;
	
	public UtilsateurServiceImpl (UtilisateurRepository utilisateurRepository)

	{
		this.utilisateurRepository=utilisateurRepository;
	}
	@Override
	public Utilisateur save(Utilisateur utilisateur) {
	if(utilisateur==null)
	{
		return null;
	}
	return utilisateurRepository.save(utilisateur);
	}

	@Override
	public Optional<Utilisateur> FindById(Integer id) {
		if(id==null)
		{
			return  null;
		}
		
		Optional<Utilisateur>cOptional=utilisateurRepository.findById(id);
		return Optional.of(cOptional.get());
	}

	@Override
	public List<Utilisateur> FindAll() {
	return utilisateurRepository.findAll().stream()
			.collect(Collectors.toList());
	}
	

	@Override
	public void Delete(Integer id) {
if(id==null)
{
return ;	
}
utilisateurRepository.deleteById(id);
	}

}


