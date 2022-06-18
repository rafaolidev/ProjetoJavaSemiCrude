package com.rafaoli.graphics.screens;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.actionListeners.AddInternalListener;
import com.rafaoli.service.PessoaService;
import com.rafaoli.utils.Constantes;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
/*
 * Essa classe foi construído com o auxílio do plug-in WindowTool
 * */
public class AddFrame extends JFrame {

	private JPanel contentPane;
	private JTextField fieldName;
	private JTextField fieldRG;
	private JTextField fieldEmail;
	private JTextField fieldTelefone;

	private JComboBox comboEmail;
	private JComboBox comboTelefone;
	
	private PessoaService pessoaService;
	private AppScreen appScreen;	

	public AddFrame( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		
		pessoaService = p_pessoaService;
		appScreen = p_appScreen;
		
		setBounds(100, 100, 476, 341);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(24, 40, 36, 26);
		contentPane.add(lblNewLabel);
		
		fieldName = new JTextField();
		fieldName.setToolTipText("Digite o nome aqui!");
		fieldName.setBounds(57, 43, 267, 20);
		contentPane.add(fieldName);
		fieldName.setColumns(10);
		
		JLabel lblRG = new JLabel("RG");
		lblRG.setBounds(24, 77, 46, 14);
		contentPane.add(lblRG);
		
		fieldRG = new JTextField();
		fieldRG.setToolTipText("Digite o RG aqui!");
		fieldRG.setColumns(10);
		fieldRG.setBounds(57, 74, 267, 20);
		contentPane.add(fieldRG);
		
		JLabel lblDtNascimento = new JLabel("Data de Nascimento");
		lblDtNascimento.setBounds(24, 102, 103, 20);
		contentPane.add(lblDtNascimento);
		
		JLabel lblEmail = new JLabel("E-Mail");
		lblEmail.setBounds(24, 134, 46, 26);
		contentPane.add(lblEmail);
		
		comboEmail = new JComboBox(Constantes.OPCOES_EMAIL);
		comboEmail.setBounds(290, 136, 84, 22);
		contentPane.add(comboEmail);
		
		fieldEmail = new JTextField();
		fieldEmail.setToolTipText("Digite o nome aqui!");
		fieldEmail.setColumns(10);
		fieldEmail.setBounds(57, 137, 213, 20);
		contentPane.add(fieldEmail);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(24, 167, 46, 26);
		contentPane.add(lblTelefone);
		
		JLabel lblEndereco = new JLabel("Endereco");
		lblEndereco.setBounds(24, 202, 46, 26);
		contentPane.add(lblEndereco);
		
		fieldTelefone = new JTextField();
		fieldTelefone.setToolTipText("Digite o telefone aqui!");
		fieldTelefone.setColumns(10);
		fieldTelefone.setBounds(67, 170, 213, 20);
		contentPane.add(fieldTelefone);
		
		comboTelefone = new JComboBox( Constantes.OPCOES_TELEFONE );
		comboTelefone.setBounds(290, 169, 84, 22);
		contentPane.add(comboTelefone);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setBounds(109, 253, 89, 23);
		contentPane.add(btnAdicionar);
		btnAdicionar.addActionListener( new AddInternalListener( p_pessoaService, this ) );
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(248, 253, 89, 23);
		contentPane.add(btnCancelar);
	}


	public JTextField getFieldName() {
		return fieldName;
	}


	public JTextField getFieldRG() {
		return fieldRG;
	}


	public JTextField getFieldEmail() {
		return fieldEmail;
	}


	public JTextField getFieldTelefone() {
		return fieldTelefone;
	}	

	public JComboBox getComboEmail() {
		return comboEmail;
	}
	
	public JComboBox getComboTelefone() {
		return comboTelefone;
	}

	public AppScreen getAppScreen() {
		return appScreen;
	}
	
	
}
