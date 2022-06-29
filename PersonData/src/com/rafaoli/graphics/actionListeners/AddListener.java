package com.rafaoli.graphics.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.screens.AddFrame;
import com.rafaoli.service.PessoaService;
import com.rafaoli.utils.Constantes;

public class AddListener implements ActionListener {

	AddFrame addFrame;

	public AddListener( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		addFrame = new AddFrame( p_pessoaService, p_appScreen );
	}	
	
	public void gerarGUI() {		
		addFrame.setVisible( true );
		addFrame.setTitle( Constantes.ADICIONAR_CONTATO );		
	}
	
	@Override
	public void actionPerformed( ActionEvent e ) {
		gerarGUI();		
	}
}