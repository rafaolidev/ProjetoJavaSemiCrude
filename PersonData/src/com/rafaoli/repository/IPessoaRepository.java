package com.rafaoli.repository;

import java.util.List;

import com.rafaoli.domain.Pessoa;

public interface IPessoaRepository {
	
	void inserirContato( Pessoa p_pessoa );
	
	void deletarContato( Pessoa p_pessoa );
	
	void alterarContato( Pessoa p_pessoa, int p_index );
	
	List<Pessoa> listarContatos();
}
