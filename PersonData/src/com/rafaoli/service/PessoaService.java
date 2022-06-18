package com.rafaoli.service;

import java.util.List;

import com.rafaoli.dbsimulator.DBSimulator;
import com.rafaoli.domain.Pessoa;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;

public class PessoaService {
	
	private PessoaRepositoryImpl pessoaRepositoryImpl;

	public PessoaService( PessoaRepositoryImpl pessoaRepositoryImpl ) {
		this.pessoaRepositoryImpl = pessoaRepositoryImpl;
	}
	
	public List<Pessoa> listarContatos() {
		List<Pessoa> listaContatos = pessoaRepositoryImpl.listarContatos();
		listaContatos
		.stream()
		.sorted();
		
		return listaContatos;
	}
	
	public void inserirContato( Pessoa p_pessoa ) {
		pessoaRepositoryImpl.inserirContato( p_pessoa );
	}
	
	public void deletarContato( int p_id ) {
		pessoaRepositoryImpl.deletarContato( p_id );
	}
	
	public void alterarContato( Pessoa p_pessoa, int p_id  ) {
		
		pessoaRepositoryImpl.alterarContato(p_pessoa, p_id);
		
	}
}
