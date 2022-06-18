package com.rafaoli.graphics.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.screens.AddFrame;
import com.rafaoli.service.PessoaService;

public class AddListener implements ActionListener {

	private PessoaService pessoaService;
	private AppScreen appScreen;
	AddFrame addFrame;

	public AddListener( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		pessoaService = p_pessoaService;
		appScreen = p_appScreen;
		addFrame = new AddFrame( p_pessoaService, p_appScreen );
	}	
	
	public void gerarGUI() {		
		addFrame.setVisible(true);
		addFrame.setTitle("Adicionar Contato");		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gerarGUI();		
	}

}
