package com.rafaoli.graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.actionListeners.AddListener;
import com.rafaoli.graphics.actionListeners.AltBtnListener;
import com.rafaoli.graphics.actionListeners.DelBtnListener;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;
import com.rafaoli.service.PessoaService;

public class AppScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JToolBar menuOpcoes = new JToolBar();
	private JList<Pessoa> listaContatos;
	JButton addContato = new JButton("Adicionar Contato") ;
	JButton altContato = new JButton("Alterar Contato");
	JButton delContato = new JButton("Remover Contato");
	JList<Pessoa> JlistaContato;
	private PessoaService pessoaService = new PessoaService( new PessoaRepositoryImpl() );
	private DelBtnListener delListener; 
	private AltBtnListener altListener; 
	private int indexSelecionado;
	
	public AppScreen() {
		super("Person Data Visualizer");
	}
	
	public void construirGUI() {
		listarContatosGUI();
		construirMenuOpcoes();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);    
        this.setSize( 400, 400);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
	}
	
	public void construirMenuOpcoes() {
		
		delListener = new DelBtnListener(pessoaService,this);
		AddListener addListener = new AddListener(pessoaService,this);
		
		altListener = new AltBtnListener( pessoaService, this );
		
		
		
		menuOpcoes.add( addContato );
		addContato.addActionListener( addListener );
		altContato.addActionListener( altListener );
		delContato.addActionListener( delListener );
		delContato.setEnabled(false);
		altContato.setEnabled(false);
		
		
		menuOpcoes.add( altContato );
		menuOpcoes.add( delContato );
		add(menuOpcoes, BorderLayout.NORTH);
		
	}
	
	public void listarContatosGUI() {
		/*
		 * Em obras . . . 
		 * 
		 * */
		List<Pessoa> listaPessoas = pessoaService.listarContatos();
		
		JlistaContato = new JList<Pessoa>(listaPessoas.toArray( new Pessoa[ listaPessoas.size() ] ) );
		JlistaContato.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JlistaContato.setLayoutOrientation(JList.HORIZONTAL_WRAP);
		
		JlistaContato.addMouseListener( new MouseAdapter() {
			public void mousePressed( MouseEvent mouseEvent ) {
				 if (mouseEvent.getClickCount() == 2) {
					 altContato.doClick(); 
	                }
			}
		});
		
		JlistaContato.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				int indexSelecionado = JlistaContato.getSelectedIndex();
				delListener.setIndex( indexSelecionado );
				setIndexSelecionado(indexSelecionado);
				  if (e.getValueIsAdjusting() == false) {

				        if (JlistaContato.getSelectedIndex() == -1) {
				            delContato.setEnabled(false);
				            altContato.setEnabled(false);
				        } else {
				        	delContato.setEnabled(true);
				        	altContato.setEnabled(true);
				        }
				    }				
			}
		});
		
		JScrollPane listScroller = new JScrollPane(JlistaContato);
		listScroller.setPreferredSize(new Dimension(250, 80));
		
		this.add(JlistaContato);

	}
	
	public void refreshJList() {
		DefaultListModel<Pessoa> listModelPessoa = new DefaultListModel<>();
		listModelPessoa.addAll( pessoaService.listarContatos() );
		JlistaContato.setModel( listModelPessoa );
	}

	public JList<Pessoa> getListaContatos() {
		return listaContatos;
	}

	public PessoaService getPessoaService() {
		return pessoaService;
	}

	public JList<Pessoa> getJlistaContato() {
		return JlistaContato;
	}

	public int getIndexSelecionado() {
		return indexSelecionado;
	}

	public void setIndexSelecionado(int indexSelecionado) {
		this.indexSelecionado = indexSelecionado;
	}
	
	

	
	
	
}
