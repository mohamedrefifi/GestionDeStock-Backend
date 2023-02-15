package com.example.demo.Repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Facture;
import com.example.demo.model.Produits;

public interface FactureRepository extends JpaRepository<Facture, Integer>{
	
	List<Facture> findAllByProduitsId (Integer id);
	
	@Query(value ="select sum(f.prix_total) from facture f ",nativeQuery = true)
	BigDecimal chiffreaffaire ();

}
