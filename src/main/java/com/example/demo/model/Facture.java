package com.example.demo.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

@Table(name = "Facture")

public class Facture {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "NumFacture")
	private String NumFacture;
	
	@Column(name = "DateFacture")
	private Date DateFacture;
	
	@Column(name = "PrixTotal")
	private BigDecimal PrixTotal;
	
	@ManyToOne
	@JoinColumn(name = "idlivraison")
	@JsonIgnore
	private Livraison livraison;
	
	@ManyToOne
	@JoinColumn(name =  "idProduit")
	@JsonIgnore
	private Produits produits;
	
	
	
}
