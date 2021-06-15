package com.humanae.e_commerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 45)
	private String nome;
	
	@NotNull
	private java.util.Date data_nascimento;
	
	@NotNull
	@Size(max = 14)
	private String cpf;
	
	@NotNull
	@Size(min = 5, max = 45) //
	private String telefone;
	
	@NotNull
	@Size(min = 5, max = 45)
	private String email;
	
	@NotNull
	@Size(min = 5, max = 45)
	private String senha;
	
	@NotNull
	@Size(min = 5, max = 45)
	private String cartoes;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public java.util.Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(java.util.Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCartoes() {
		return cartoes;
	}

	public void setCartoes(String cartoes) {
		this.cartoes = cartoes;
	}
		
}