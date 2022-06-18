package com.rafaoli.graphics.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JList;

import com.rafaoli.dbsimulator.DBSimulator;
import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;
import com.rafaoli.service.PessoaService;

public class DelBtnListener implements ActionListener {

	private int index;
	private PessoaService pessoaService;
	private AppScreen appScreen;
	
	public DelBtnListener( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		pessoaService = p_pessoaService;
		appScreen = p_appScreen;
	}	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		pessoaService.deletarContato( this.index );	
		appScreen.refreshJList();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	

}
