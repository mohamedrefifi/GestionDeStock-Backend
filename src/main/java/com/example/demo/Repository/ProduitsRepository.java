package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Produits;

public interface ProduitsRepository extends JpaRepository<Produits, Integer> {

}
