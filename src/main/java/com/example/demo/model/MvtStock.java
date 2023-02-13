package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "MvtStock")
public class MvtStock {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "DateMouvment")
	private Date DateMouvment;
	
	@Column(name = "Quantite")
	private Float Quantite;
	
	@Column(name = "TypeMvt")
	private String TypeMvt;
	
	@ManyToOne
	@JoinColumn(name = "idproduits")
	private Produits produits;
	

}
