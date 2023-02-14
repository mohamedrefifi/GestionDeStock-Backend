package com.example.demo.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Produits;

public interface ProduitsRepository extends JpaRepository<Produits, Integer> {
	
	
	@Query (value ="select * from Produits p ,Category c where c.id= :id and p.idcategory =c.id " ,nativeQuery = true)
   List <Produits> findproduitbyidcategory (@Param ("id") Integer id);
}

