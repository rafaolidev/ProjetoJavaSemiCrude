package com.rafaoli.graphics.actionListeners;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.rafaoli.utils.Constantes;

public class AddBtnListener implements ActionListener {
	
	JFrame AddBtnFrame = new JFrame();
	
	List<JComponent> JComponentList = new ArrayList<>();
	
	JTextField nameField = new JTextField("Digite o nome aqui !",15);
	JLabel nameLabel = new JLabel("Nome: ");
	JTextField rgField = new JTextField("Digite o RG aqui !",30);
	
	
	JComboBox emailCombo = new JComboBox( Constantes.OPCOES_EMAIL );
	JTextField emailField = new JTextField("Digite o email aqui !",45);
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.print("Entrou");
		gerarAddContatoGUI();
	}
	
	public void gerarAddContatoGUI() {
		
		addComponents();
		AddBtnFrame.setSize(300,300);
		AddBtnFrame.setLayout( new SpringLayout() );
		AddBtnFrame.setLocation(450, 450);
		

		AddBtnFrame.pack();
		AddBtnFrame.setVisible(true);
	}
	
	public void addComponents() {
		JComponentList.add(emailCombo);
		JComponentList.add(nameLabel);
		JComponentList.add(nameField);
		JComponentList.add(rgField);
		JComponentList.add(emailField);
		
		populateFrame();
	}
	
	public void populateFrame() {
		JComponentList.forEach(componente ->{
			AddBtnFrame.add(componente);
		});
	}

}
