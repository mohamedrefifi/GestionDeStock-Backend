package com.example.demo.Service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import com.example.demo.Repository.MvtStockRepository;
import com.example.demo.Service.MvtStkService;
import com.example.demo.model.MvtStock;

@Service
public class MvtStkServiceImpl implements MvtStkService {
	

	private MvtStockRepository mvtStockRepository;
	
	public MvtStkServiceImpl (MvtStockRepository mvtStockRepository)

	{
		this.mvtStockRepository=mvtStockRepository;
	}
	

	@Override
	public Optional<MvtStock> FindById(Integer id) {
		if(id==null)
		{
			return  null;
		}
		
		Optional<MvtStock>cOptional=mvtStockRepository.findById(id);
		return Optional.of(cOptional.get());
	}

	@Override
	public List<MvtStock> FindAll() {
	return mvtStockRepository.findAll().stream()
			.collect(Collectors.toList());
	}
	

	@Override
	public void Delete(Integer id) {
if(id==null)
{
return ;	
}
mvtStockRepository.deleteById(id);
	}
	@Override
	public Float StockReelProduit(Integer id) {
		if(id==null)
		{
			return null;
		}
		return mvtStockRepository.StockReelProduit(id);
	}
	@Override
	public MvtStock mouvementDeStock(MvtStock mvtStock) {
		if(mvtStock==null)
		{
			return null;
		}
		 if  (mvtStock.getTypeMvt().toString().contentEquals("entree"))
		{
			return mvtStockRepository.save(mvtStock);
			
		}
		 else 
		 {
			 mvtStock.setQuantite(mvtStock.getQuantite()* -1);
			return mvtStockRepository.save(mvtStock);
		 }
		 
			

	}}



