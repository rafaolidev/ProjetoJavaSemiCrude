package com.rafaoli.graphics.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.screens.AddFrame;
import com.rafaoli.service.PessoaService;

public class AltBtnListener implements ActionListener{

	private PessoaService pessoaService;
	private AppScreen appScreen;
	private int index;

	public AltBtnListener( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		pessoaService = p_pessoaService;
		appScreen = p_appScreen;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Pessoa pessoaAtualizada = new Pessoa();
		pessoaService.alterarContato( pessoaAtualizada, this.index );	
		appScreen.refreshJList();
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	

}
