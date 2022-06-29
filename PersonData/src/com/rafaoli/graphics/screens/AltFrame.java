package com.rafaoli.graphics.screens;

import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.graphics.actionListeners.AddBtnCancelListener;
import com.rafaoli.graphics.actionListeners.AltBtnInternalListener;
import com.rafaoli.service.PessoaService;
import com.rafaoli.utils.Constantes;
/*
 * Essa classe foi construído com o auxílio do plug-in WindowTool
 * */
public class AltFrame extends JFrame {

	private JPanel contentPane;
	private JTextField fieldName;
	private JTextField fieldRG;
	private JTextField fieldEmail;
	private JTextField fieldTelefone;

	private JComboBox comboEmail;
	private JComboBox comboTelefone;
	private JComboBox comboEndereco;

	private PessoaService pessoaService;
	private AppScreen appScreen;
	
	private JTextField fieldLogradouro;
	private JTextField fieldNumero;
	private JTextField fieldComplemento;
	private JTextField fieldBairro;
	private JTextField fieldCEP;
	private JTextField fieldCidade;
	private JTextField fieldDia;
	private JTextField fieldMes;
	private JTextField fieldAno;

	public AltFrame( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		super( Constantes.ALTERAR_CONTATO );
		pessoaService = p_pessoaService;
		appScreen = p_appScreen;
		
		setBounds( 100, 100, 583, 514 );
		contentPane = new JPanel();
		contentPane.setBorder( new EmptyBorder( 5, 5, 5, 5 ) );
		setContentPane( contentPane );
		contentPane.setLayout( null );
		
		JLabel lblNewLabel = new JLabel( Constantes.LABEL_NOME );
		lblNewLabel.setBounds( 24, 40, 36, 26 );
		contentPane.add( lblNewLabel );
		
		fieldName = new JTextField();
		fieldName.setToolTipText( Constantes.TOOLTIP_NOME );
		fieldName.setBounds( 57, 43, 267, 20 );
		contentPane.add( fieldName );
		fieldName.setColumns( 10 );
		
		JLabel lblRG = new JLabel( Constantes.LABEL_RG );
		lblRG.setBounds( 24, 77, 46, 14 );
		contentPane.add( lblRG );
		
		fieldRG = new JTextField();
		fieldRG.setToolTipText( Constantes.TOOLTIP_RG );
		fieldRG.setColumns( 10 );
		fieldRG.setBounds( 57, 74, 267, 20 );
		contentPane.add(fieldRG);
		
		JLabel lblDtNascimento = new JLabel( Constantes.LABEL_DATANASCIMENTO );
		lblDtNascimento.setBounds( 24, 102, 127, 20 );
		contentPane.add( lblDtNascimento );
		
		JLabel lblEmail = new JLabel( Constantes.LABEL_EMAIL );
		lblEmail.setBounds( 24, 134, 46, 26 );
		contentPane.add( lblEmail );
		
		comboEmail = new JComboBox( Constantes.OPCOES_EMAIL );
		comboEmail.setBounds( 290, 136, 111, 22 );
		contentPane.add( comboEmail );
		
		fieldEmail = new JTextField();
		fieldEmail.setToolTipText( Constantes.TOOLTIP_EMAIL);
		fieldEmail.setColumns( 10 );
		fieldEmail.setBounds( 93, 137, 187, 20 );
		contentPane.add( fieldEmail );
		
		JLabel lblTelefone = new JLabel( Constantes.LABEL_TELEFONE );
		lblTelefone.setBounds( 24, 167, 70, 26 );
		contentPane.add( lblTelefone );
		
		JLabel lblEndereco = new JLabel( Constantes.LABEL_ENDERECO );
		lblEndereco.setBounds( 24, 202, 70, 26 );
		contentPane.add( lblEndereco );
		
		fieldTelefone = new JTextField();
		fieldTelefone.setToolTipText( Constantes.TOOLTIP_TELEFONE );
		fieldTelefone.setColumns( 10 );
		fieldTelefone.setBounds( 93, 170, 187, 20 );
		contentPane.add( fieldTelefone );
		
		comboTelefone = new JComboBox( Constantes.OPCOES_TELEFONE );
		comboTelefone.setBounds( 290, 169, 111, 22 );
		contentPane.add( comboTelefone );
		
		JButton btnAtualizar = new JButton( Constantes.LABEL_BTN_ATUALIZAR );
		btnAtualizar.setBounds( 137, 441, 89, 23 );
		contentPane.add( btnAtualizar );
		btnAtualizar.addActionListener( new AltBtnInternalListener( p_pessoaService, this, appScreen ) );
		
		JButton btnCancelar = new JButton( Constantes.LABEL_BTN_CANCEL );
		btnCancelar.setBounds( 245, 441, 89, 23 );
		contentPane.add( btnCancelar );
		
		JLabel lblLogradouro = new JLabel( Constantes.LABEL_LOGRADOURO);
		lblLogradouro.setBounds( 24, 226, 80, 26 );
		contentPane.add( lblLogradouro );
		
		fieldLogradouro = new JTextField();
		fieldLogradouro.setToolTipText( Constantes.TOOLTIP_LOGRADOURO );
		fieldLogradouro.setColumns( 10 );
		fieldLogradouro.setBounds( 104, 229, 267, 20 );
		contentPane.add( fieldLogradouro );
		
		JLabel lblNumero = new JLabel( Constantes.LABEL_NUMERO );
		lblNumero.setBounds(24, 249, 60, 26);
		contentPane.add(lblNumero);
		
		JLabel lblComplemento = new JLabel( Constantes.LABEL_COMPLEMENTO );
		lblComplemento.setBounds( 24, 275, 80, 26 );
		contentPane.add( lblComplemento );
		
		JLabel lblBairro = new JLabel( Constantes.LABEL_BAIRRO );
		lblBairro.setBounds( 24, 300, 60, 26 );
		contentPane.add( lblBairro );
		
		JLabel lblCEP = new JLabel( Constantes.LABEL_CEP );
		lblCEP.setBounds( 24, 326, 60, 26 );
		contentPane.add( lblCEP );
		
		JLabel lblCidade = new JLabel( Constantes.LABEL_CIDADE );
		lblCidade.setBounds( 24, 352, 60, 26 );
		contentPane.add( lblCidade );
		
		fieldNumero = new JTextField();
		fieldNumero.setToolTipText( Constantes.TOOLTIP_NUMERO );
		fieldNumero.setColumns( 10 );
		fieldNumero.setBounds( 104, 252, 267, 20 );
		contentPane.add( fieldNumero );
		
		fieldComplemento = new JTextField();
		fieldComplemento.setToolTipText( Constantes.TOOLTIP_COMPLEMENTO );
		fieldComplemento.setColumns( 10 );
		fieldComplemento.setBounds( 104, 278, 267, 20 );
		contentPane.add( fieldComplemento );
		
		fieldBairro = new JTextField();
		fieldBairro.setToolTipText( Constantes.TOOLTIP_BAIRRO );
		fieldBairro.setColumns( 10 );
		fieldBairro.setBounds( 104, 303, 267, 20 );
		contentPane.add( fieldBairro );
		
		fieldCEP = new JTextField();
		fieldCEP.setToolTipText( Constantes.TOOLTIP_CEP );
		fieldCEP.setColumns( 10 );
		fieldCEP.setBounds( 104, 329, 267, 20 );
		contentPane.add( fieldCEP );
		
		fieldCidade = new JTextField();
		fieldCidade.setToolTipText( Constantes.TOOLTIP_CIDADE );
		fieldCidade.setColumns( 10 );
		fieldCidade.setBounds( 104, 355, 267, 20 );
		contentPane.add( fieldCidade );
		
		comboEndereco = new JComboBox( Constantes.OPCOES_ENDERECO );
		comboEndereco.setBounds( 104, 204, 148, 22 );
		contentPane.add( comboEndereco );
		btnCancelar.addActionListener( new AddBtnCancelListener( this ) );
		
		fieldDia = new JTextField();
		fieldDia.setBounds( 177, 102, 46, 20 );
		contentPane.add( fieldDia );
		fieldDia.setColumns(10);
		
		fieldMes = new JTextField();
		fieldMes.setColumns( 10 );
		fieldMes.setBounds( 257, 102, 30, 20 );
		contentPane.add( fieldMes );
		
		fieldAno = new JTextField();
		fieldAno.setColumns( 10 );
		fieldAno.setBounds( 341, 102, 60, 20 );
		contentPane.add( fieldAno );
		
		JLabel lblDia = new JLabel( Constantes.LABEL_DIA );
		lblDia.setBounds( 149, 105, 30, 14 );
		contentPane.add( lblDia );
		
		JLabel lblMes = new JLabel( Constantes.LABEL_MES );
		lblMes.setBounds( 233, 105, 30, 14 );
		contentPane.add( lblMes );
		
		JLabel lblAno = new JLabel( Constantes.LABEL_ANO );
		lblAno.setBounds( 304, 105, 30, 14 );
		contentPane.add( lblAno );
		btnCancelar.addActionListener( new AddBtnCancelListener( this ) );
	}
	
	public void carregarDados( Pessoa p_pessoa ) {
		fieldName.setText( p_pessoa.getNome() );
		fieldRG.setText( p_pessoa.getRg() );
		
		fieldDia.setText( ""+p_pessoa.getData_nascimento().getDayOfMonth() );
		fieldMes.setText( ""+p_pessoa.getData_nascimento().getMonthValue() );
		fieldAno.setText( ""+p_pessoa.getData_nascimento().getYear() );
		
		p_pessoa.getEmail().entrySet().forEach(entry->{
			fieldEmail.setText( entry.getKey() );
			comboEmail.setSelectedItem( entry.getValue() );
		});
		
		p_pessoa.getTelefone().entrySet().forEach(entry->{
			fieldTelefone.setText( entry.getKey() );
			comboTelefone.setSelectedItem( entry.getValue() );
		});
		
		p_pessoa.getEndereco().entrySet().forEach(entry->{
			fieldLogradouro.setText( entry.getKey().getLogradouro() );
			fieldCEP.setText( entry.getKey().getCep() );
			fieldCidade.setText( entry.getKey().getCidade() );
			fieldBairro.setText( entry.getKey().getBairro() );
			fieldComplemento.setText( entry.getKey().getComplemento() );
			fieldNumero.setText( entry.getKey().getNumero() );
			comboEndereco.setSelectedItem( entry.getValue() );
		});
		
	}
	
	public void encerrarJFrame() {
		int decision = JOptionPane.showConfirmDialog( 
				this,
				Constantes.OPERACAO_CONCLUIDA,
				"",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE );
		
		if( decision == JOptionPane.YES_OPTION )			
			this.dispatchEvent( new WindowEvent( this, WindowEvent.WINDOW_CLOSING ) );
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
	
	public JComboBox getComboEndereco() {
		return comboEndereco;
	}

	public JTextField getFieldLogradouro() {
		return fieldLogradouro;
	}

	public void setFieldLogradouro(JTextField fieldLogradouro) {
		this.fieldLogradouro = fieldLogradouro;
	}

	public JTextField getFieldComplemento() {
		return fieldComplemento;
	}

	public void setFieldComplemento(JTextField fieldComplemento) {
		this.fieldComplemento = fieldComplemento;
	}
	
	public JTextField getFieldBairro() {
		return fieldBairro;
	}
	
	public JTextField getFieldNumero() {
		return fieldNumero;
	}

	public void setFieldBairro(JTextField fieldBairro) {
		this.fieldBairro = fieldBairro;
	}

	public JTextField getFieldCEP() {
		return fieldCEP;
	}

	public void setFieldCEP(JTextField fieldCEP) {
		this.fieldCEP = fieldCEP;
	}

	public JTextField getFieldCidade() {
		return fieldCidade;
	}

	public void setFieldCidade(JTextField fieldCidade) {
		this.fieldCidade = fieldCidade;
	}
	
	public JTextField getFieldDia() {
		return fieldDia;
	}

	public JTextField getFieldMes() {
		return fieldMes;
	}

	public JTextField getFieldAno() {
		return fieldAno;
	}
	
	public AppScreen getAppScreen() {
		return appScreen;
	}
}