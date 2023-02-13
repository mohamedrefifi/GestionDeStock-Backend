package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Facture;

public interface FactureRepository extends JpaRepository<Facture, Integer>{

}
