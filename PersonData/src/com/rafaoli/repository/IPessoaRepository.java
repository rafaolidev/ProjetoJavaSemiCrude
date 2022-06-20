package com.rafaoli.repository;

import java.util.List;

import com.rafaoli.domain.Pessoa;

public interface IPessoaRepository {
	
	void inserirContato( Pessoa p_pessoa );
	
	void deletarContato( int p_id );
	
	void alterarContato( Pessoa p_pessoa, int p_id );
	
	List<Pessoa> listarContatos();
}
