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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "Commande")

public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "quantite")
	private Float quantite;
	
	@Column(name = "DateCommande")
	private Date DateCommande;
	
	@Column(name = "DateLivraison")
	private Date DateLivraison;
	
	@NotEmpty
	@Column(name = "Statut")
	private String Statut;
	
	@ManyToOne
	@JoinColumn(name =  "idProduit")
	@JsonIgnore
	private Produits produits;
	
	@OneToMany(mappedBy = "Commande")
	private List<Livraison>livraisons;
	
	
	
}
	