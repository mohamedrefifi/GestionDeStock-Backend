package com.example.demo.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor

@NoArgsConstructor
@Table(name = "Produits")

public class Produits {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "designiation")
	private String designiation;
	
	@Column(name = "CodeArticle")
	private String CodeArticle;
	
	@Column(name = "Quantite")
	private Float Quantite;
	
	@Column(name = "QuantiteMin")
	private Float QuantiteMin;
	
	@Column(name = "PrixUnitHt")
	private BigDecimal PrixUnitHt;
	
	@Column(name = "TauxTva")
	private BigDecimal TauxTva;
	
	@Column(name = "PrixUnitTtc")
	private BigDecimal PrixUnitTtc;
	
	@OneToMany(mappedBy = "produits")
	 private List<Commande>commandes;
	
	@OneToMany(mappedBy = "produits")
	private List<MvtStock>mvtStocks;
	

	@OneToMany(mappedBy = "produits")
	private List<Fournisseur>fournisseurs;
	
	@ManyToOne 
	@JoinColumn(name = "idcategory")
	@JsonIgnore
	private Category Category;
}
