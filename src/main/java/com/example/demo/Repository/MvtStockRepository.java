package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.MvtStock;
public interface MvtStockRepository extends JpaRepository<MvtStock, Integer> {

}
