package com.rafaoli.service;

import com.rafaoli.dbsimulator.DBSimulator;
import com.rafaoli.domain.Pessoa;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;

public class PessoaService {
	
	private PessoaRepositoryImpl pessoaRepositoryImpl;

	public PessoaService( PessoaRepositoryImpl pessoaRepositoryImpl ) {
		this.pessoaRepositoryImpl = pessoaRepositoryImpl;
	}
	
	public void listarContatos() {
		pessoaRepositoryImpl.listarContatos();
	}
	
	public void inserirContato( Pessoa p_pessoa ) {
		pessoaRepositoryImpl.inserirContato( p_pessoa );
	}
	
	public void removerContato( Pessoa p_pessoa ) {
		pessoaRepositoryImpl.deletarContato( p_pessoa );
	}
	
	public void alterarContato( Pessoa p_pessoa  ) {
		int indexPessoa = 0; 
		DBSimulator.LISTA_DE_PESSOA.forEach( pessoa ->{
			if( pessoa.getRg().equals( p_pessoa.getRg() ) ) {
				// TO DO 
 			}			
		});
		
		pessoaRepositoryImpl.alterarContato(p_pessoa, indexPessoa);
		
	}
}
