package com.rafaoli.graphics.actionListeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.HashMap;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.screens.AddFrame;
import com.rafaoli.service.PessoaService;

public class AddBtnAddInternalListener implements ActionListener {

	private PessoaService pessoaService;
	private AddFrame addFrame;
	
	public AddBtnAddInternalListener( PessoaService p_pessoaService, AddFrame p_addFrame ) {
		pessoaService = p_pessoaService;
		addFrame = p_addFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Pessoa novaPessoa = new Pessoa();		
		
		novaPessoa.setNome( addFrame.getFieldName().getText() );
		novaPessoa.setRg( addFrame.getFieldRG().getText() );
		novaPessoa.setData_nascimento( new Date() );
		
		HashMap<String, String> emailMap = new HashMap<String,String>();		
		String email = addFrame.getFieldEmail().getText();
		String opcaoEmail = (String)addFrame.getComboEmail().getSelectedItem().toString();
		
		emailMap.put(email, opcaoEmail);
		
		novaPessoa.setEmail( emailMap );
		
		HashMap<String, String> telefoneMap = new HashMap<String,String>();		
		String telefone = addFrame.getFieldTelefone().getText();
		String opcaoTelefone = (String)addFrame.getComboTelefone().getSelectedItem().toString();
		
		telefoneMap.put(telefone, opcaoTelefone);
		
		novaPessoa.setTelefone( telefoneMap );		
		
		pessoaService.inserirContato( novaPessoa );
		addFrame.getAppScreen().refreshJList();
	}
	

}