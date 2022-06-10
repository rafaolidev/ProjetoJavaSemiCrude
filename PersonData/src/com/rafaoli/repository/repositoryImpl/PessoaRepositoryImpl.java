package com.rafaoli.repository.repositoryImpl;

import java.util.List;

import com.rafaoli.dbsimulator.DBSimulator;
import com.rafaoli.domain.Pessoa;
import com.rafaoli.repository.IPessoaRepository;

public class PessoaRepositoryImpl implements IPessoaRepository{

	@Override
	public void inserirContato(Pessoa p_pessoa) {
		DBSimulator.LISTA_DE_PESSOA.add(p_pessoa);
	}

	@Override
	public void deletarContato(Pessoa p_pessoa) {
		DBSimulator.LISTA_DE_PESSOA.remove(p_pessoa);		
	}

	@Override
	public void alterarContato(Pessoa p_pessoa) {
		// TO DO
	}

	@Override
	public void listarContatos() {				
		DBSimulator.LISTA_DE_PESSOA.stream().sorted().forEach(System.out::println);
	}

}
