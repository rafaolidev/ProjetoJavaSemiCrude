package com.rafaoli.service;

import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;

public class PessoaService {
	
	private PessoaRepositoryImpl pessoaRepositoryImpl;

	public PessoaService(PessoaRepositoryImpl pessoaRepositoryImpl) {
		this.pessoaRepositoryImpl = pessoaRepositoryImpl;
	}
	
	public void listarContatos() {
		pessoaRepositoryImpl.listarContatos();
	}


}