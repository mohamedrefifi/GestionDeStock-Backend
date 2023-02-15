package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.MvtStock;
public interface MvtStockRepository extends JpaRepository<MvtStock, Integer> {

	@Query(value ="select sum(m.Quantite) from mvt_stock m where m.idproduits=:id",nativeQuery = true)
	Float StockReelProduit (@Param ("id") Integer id);
	

}
