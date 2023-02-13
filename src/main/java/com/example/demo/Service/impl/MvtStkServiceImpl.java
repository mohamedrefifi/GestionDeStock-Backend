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
	public MvtStock save(MvtStock mvtStock) {
	if(mvtStock==null)
	{
		return null;
	}
	return mvtStockRepository.save(mvtStock);
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

}



