package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Email;
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
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@NotEmpty
		@Column(name = "nom")
		private String nom;
		
		@Email
		@Column(name = "Email")
		private String Email;
		
		@NotEmpty
		@Column(name = "Telephone")
		private String Telephone;
		
		@NotEmpty
		@Column(name = "MotDePasse")
		private String MotDePasse;
		
		@NotEmpty
		@Column(name = "Adresse")
		private String Adresse;
		
		
		

	}

