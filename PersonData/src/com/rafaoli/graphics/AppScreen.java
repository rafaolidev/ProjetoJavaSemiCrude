package com.rafaoli.graphics;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JToolBar;
import javax.swing.ListModel;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.actionListeners.AddBtnListener;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;
import com.rafaoli.service.PessoaService;

public class AppScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JToolBar menuOpcoes = new JToolBar();
	private JList<Pessoa> listaContatos;
	
	public AppScreen() {
		super("Person Data Visualizer");
	}
	
	public void construirGUI() {
		construirMenuOpcoes();
		//listarContatosGUI();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);    
        this.setSize( 500, 500 );
        this.setVisible(true);
        this.setLocationRelativeTo(null);
	}
	
	public void construirMenuOpcoes() {
		JButton addContato = new JButton("Adicionar Contato") ;
		JButton altContato = new JButton("Alterar Contato");
		JButton delContato = new JButton("Remover Contato");
		
		menuOpcoes.add( addContato );
		addContato.addActionListener( new AddBtnListener() );
		
		
		menuOpcoes.add( altContato );
		menuOpcoes.add( delContato );
		add(menuOpcoes, BorderLayout.NORTH);
	}
	
	public void listarContatosGUI() {
		/*
		 * Em obras . . . 
		 * 
		 * */
		List<Pessoa> listaPessoas =  new PessoaService( new PessoaRepositoryImpl() ).listarContatos();
		
		JList<Pessoa> listaContato = new JList<Pessoa>(listaPessoas.toArray( new Pessoa[ listaPessoas.size() ] ) );
		this.add(listaContato);

	}

}
