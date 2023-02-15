package com.example.demo.model;

import java.sql.Date;
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
@Table(name = "Livraison")

public class Livraison {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    @NotEmpty
	@Column(name = "NumBonLivraion")
	private String NumBonLivraion;
	
    
	@Column(name = "DateLivraison")
	private Date DateLivraison;
	
	@Column(name = "Quantite")
	private Float Quantite;
	
  @ManyToOne
  @JoinColumn(name = "idcommande")
  @JsonIgnore
  private Commande Commande;
  
  @OneToMany(mappedBy = "livraison")
  private List<Facture>factures;
	
	
	
}
