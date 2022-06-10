package com.rafaoli.domain;

import java.util.Date;
import java.util.HashMap;

public class Pessoa {
	
	private String nome;
	private String rg;
	private Date data_nascimento;
	private HashMap<String, String> email;
	private HashMap<String, String> telefone;
	private HashMap<String, String> endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public HashMap<String, String> getEmail() {
		return email;
	}
	public void setEmail(HashMap<String, String> email) {
		this.email = email;
	}
	public HashMap<String, String> getTelefone() {
		return telefone;
	}
	public void setTelefone(HashMap<String, String> telefone) {
		this.telefone = telefone;
	}
	public HashMap<String, String> getEndereco() {
		return endereco;
	}
	public void setEndereco(HashMap<String, String> endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", rg=" + rg + ", data_nascimento=" + data_nascimento + ", email=" + email
				+ ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}

	
	

}
