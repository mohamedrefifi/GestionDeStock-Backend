package com.example.demo.Service.impl;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.FactureRepository;
import com.example.demo.Service.FactureService;
import com.example.demo.model.Facture;

@Service
public class FactureServiceImpl implements FactureService {


	private FactureRepository factureRepository;
	
	public FactureServiceImpl (FactureRepository factureRepository)

	{
		this.factureRepository=factureRepository;
	}
	@Override
	public Facture save(Facture facture) {
	if(facture==null)
	{
		return null;
	}
	return factureRepository.save(facture);
	}

	@Override
	public Optional<Facture> FindById(Integer id) {
		if(id==null)
		{
			return  null;
		}
		
		Optional<Facture>cOptional=factureRepository.findById(id);
		return Optional.of(cOptional.get());
	}

	@Override
	public List<Facture> FindAll() {
	return factureRepository.findAll().stream()
			.collect(Collectors.toList());
	}
	

	@Override
	public void Delete(Integer id) {
if(id==null)
{
return ;	
}
factureRepository.deleteById(id);
	}

}


