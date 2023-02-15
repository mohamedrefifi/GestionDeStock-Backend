package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.MvtStock;



public interface MvtStkService {
	
		
		Optional<MvtStock> FindById (Integer id);
		
		List <MvtStock> FindAll();
		
		void Delete (Integer id);

		Float StockReelProduit (Integer id);
		
		MvtStock mouvementDeStock (MvtStock mvtStock);
	 	

}
