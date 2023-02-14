package com.example.demo.model;

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
@Table(name = "MvtStock")
public class MvtStock {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "DateMouvment")
	private Date DateMouvment;
	
	@Column(name = "Quantite")
	private Float Quantite;
	
	@Column(name = "TypeMvt")
	private String TypeMvt;
	
	@ManyToOne
	@JoinColumn(name = "idproduits")
	@JsonIgnore
	private Produits produits;
	

}
