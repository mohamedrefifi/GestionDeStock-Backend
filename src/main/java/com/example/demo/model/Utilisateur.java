package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


	@Data
	@Entity
	@AllArgsConstructor
	@NoArgsConstructor
	@Table(name = "Utilisateur")

	public class Utilisateur {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;
		
		@Column(name = "nom")
		private String nom;
		
		@Column(name = "Email")
		private String Email;
		
		@Column(name = "Telephone")
		private String Telephone;
		
		@Column(name = "MotDePasse")
		private String MotDePasse;
		
		@Column(name = "Adresse")
		private String Adresse;
		
		
		

	}
