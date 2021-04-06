package com.algaworks.osworks.domain.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity(name = "vacina")
public class Vacina {
	String nome;
	LocalDate dtVacinacao;
	@ManyToOne
	private Usuario usuario;
	//getters e setters
	
}
