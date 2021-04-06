package com.algaworks.osworks.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.br.CPF;

import com.algaworks.osworks.api.model.Comentario;

@Entity(name = "usuario")
public class Usuario {
	@NotBlank
	String nome;
	
	@NotBlank
	@Email
	String email;
	
	@CPF(message = "CPF inválido.")
	String cpf;
	LocalDate dtNascimento;
	
	@OneToMany(mappedBy = "usuario")
	private List<Vacina> vacinas = new ArrayList<>();
	// getters e setters
	// equals e hashCode
}
