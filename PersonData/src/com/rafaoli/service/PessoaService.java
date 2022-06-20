package com.rafaoli.service;

import java.util.List;
import java.util.stream.Collectors;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;

public class PessoaService {
	
	private PessoaRepositoryImpl pessoaRepositoryImpl;

	public PessoaService( PessoaRepositoryImpl pessoaRepositoryImpl ) {
		this.pessoaRepositoryImpl = pessoaRepositoryImpl;
	}
	
	public List<Pessoa> listarContatos() {
		List<Pessoa> listaContatos = pessoaRepositoryImpl.listarContatos();		
		
		return  listaContatos.stream().sorted().collect( Collectors.toList() );
	}
	
	public void inserirContato( Pessoa p_pessoa ) {
		pessoaRepositoryImpl.inserirContato( p_pessoa );
	}
	
	public void deletarContato( int p_id ) {
		pessoaRepositoryImpl.deletarContato( p_id );
	}
	
	public void alterarContato( Pessoa p_pessoa, int p_index ) {
		
		pessoaRepositoryImpl.alterarContato( p_pessoa, p_index );
		
	}
}
