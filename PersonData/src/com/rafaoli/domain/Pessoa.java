package com.rafaoli.domain;

import java.time.LocalDate;
import java.util.HashMap;

public class Pessoa implements Comparable<Pessoa> {
	
	private String nome;
	private String rg;
	private LocalDate data_nascimento;
	private HashMap<String, String> email;
	private HashMap<String, String> telefone;
	private HashMap<Endereco, String> endereco;
	
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
	public LocalDate getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(LocalDate data_nascimento) {
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
	public HashMap<Endereco, String> getEndereco() {
		return endereco;
	}
	public void setEndereco(HashMap<Endereco, String> endereco) {
		this.endereco = endereco;
	}
	@Override
	public String toString() {
		return nome;
	}
	@Override
	public int compareTo(Pessoa p_pessoa) {
		return this.nome.compareTo( p_pessoa.nome );
	}

	
	

}
