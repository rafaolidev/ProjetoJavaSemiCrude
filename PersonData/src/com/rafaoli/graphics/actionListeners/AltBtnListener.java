package com.rafaoli.graphics.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.screens.AltFrame;
import com.rafaoli.service.PessoaService;

public class AltBtnListener implements ActionListener{

	private AppScreen appScreen;
	private int index;
	private AltFrame altFrame;

	public AltBtnListener( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		appScreen = p_appScreen;
		altFrame = new AltFrame( p_pessoaService, p_appScreen );
	}
	
	public void gerarGUI() {		
		altFrame.setVisible(true);
		altFrame.setTitle("Atualizar Contato");		
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		gerarGUI();		
		Pessoa pessoaAtualizada = recuperarPessoa();
		altFrame.carregarDados( pessoaAtualizada );
	}
	
	public Pessoa recuperarPessoa() {
		return appScreen.getJlistaContato().getSelectedValue();		
	}
	
	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}