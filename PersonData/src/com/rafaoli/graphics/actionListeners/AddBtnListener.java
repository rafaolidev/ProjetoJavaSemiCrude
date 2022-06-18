package com.rafaoli.graphics.actionListeners;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.service.PessoaService;
import com.rafaoli.utils.Constantes;

public class AddBtnListener implements ActionListener {
	
	JFrame addFrame = new JFrame();
	JPanel AddBtnFrame = new JPanel();
	List<JComponent> JComponentList = new ArrayList<>();	
    GridBagLayout gridBagLayout = new GridBagLayout();
    GridBagConstraints gbc = new GridBagConstraints();

    
	JLabel nameLabel = new JLabel("Nome: " );
	JTextField nameField = new JTextField(15);
	
	JLabel rgLabel = new JLabel("RG: ");
	JTextField rgField = new JTextField("Digite o RG aqui !",30);	
	
	JLabel emailLabel = new JLabel("E-mail: ");
	JComboBox emailCombo = new JComboBox( Constantes.OPCOES_EMAIL );
	JTextField emailField = new JTextField("Digite o email aqui !",45);
	
	private PessoaService pessoaService;
	private AppScreen appScreen;
	
	public AddBtnListener( PessoaService p_pessoaService, AppScreen p_appScreen ) {
		pessoaService = p_pessoaService;
		appScreen = p_appScreen;
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		gerarAddContatoGUI();
		Pessoa p = new Pessoa();
		p.setNome("Testo");
		pessoaService.inserirContato( p );
		appScreen.refreshJList();
	}
	
	public void gerarAddContatoGUI() {
		
		addComponents();
		setupComponents();
		gbc.fill = GridBagConstraints.HORIZONTAL;
		
		addFrame.add(AddBtnFrame);
		addFrame.setVisible(true);
		addFrame.setSize(300,300);
		AddBtnFrame.setSize(300,300);
		AddBtnFrame.setLayout( gridBagLayout );
		AddBtnFrame.setLocation(450, 450);
		
		//AddBtnFrame.setResizable(false);
		AddBtnFrame.setVisible(true);
		//AddBtnFrame.setAlwaysOnTop(true);
		addFrame.setLocationRelativeTo(null);
		AddBtnFrame.setBounds(new java.awt.Rectangle(100, 100, 300, 400));
		//AddBtnFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addComponents() {
		
		JComponentList.add(nameLabel);
		JComponentList.add(nameField);
		JComponentList.add(rgLabel);
		//JComponentList.add(rgField);
		//JComponentList.add(emailCombo);
		//JComponentList.add(emailField);
		
		populateFrame();
	}
	
	public void setupComponents() {
		nameField.setToolTipText("Digite o nome aqui !");
		nameField.setSize(20,20);	
	}
	
	public void populateFrame() {

		JComponentList.forEach(componente ->{
			
			if(componente instanceof JLabel) {
				gbc.gridy = 0;
			}
			
			if(componente instanceof JTextField) {
				gbc.gridx = GridBagConstraints.RELATIVE;

				gbc.gridy = 1;
			}	
			
			AddBtnFrame.add(componente,gbc);			
			
		});
	}

}
