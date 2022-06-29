import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

import com.rafaoli.domain.Endereco;
import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;
import com.rafaoli.service.PessoaService;

public class Recorder {	
	
	public static void main(String[]args) {
		AppScreen appScreen = new AppScreen();
		gerarMock();
		appScreen.construirGUI();
	}
	
	static void gerarMock() {
		PessoaRepositoryImpl pessoaRepositoryImpl = new PessoaRepositoryImpl();
		
		PessoaService pessoaService = new PessoaService(pessoaRepositoryImpl);
		
		Pessoa p = new Pessoa();
		
		p.setNome( "Mock" );
		p.setRg( "55555555" );
		p.setData_nascimento( LocalDate.now() );
		String email = "Mock@mock.dev";
		String opcaoEmail = "Principal";
		HashMap<String, String> emailMap = new HashMap<String,String>();		

		emailMap.put(email, opcaoEmail);
		
		String telefone = "(11)3233-3333";
		String opcaoTelefone = "Residencial";
		HashMap<String, String> telefoneMap = new HashMap<String,String>();		

		telefoneMap.put(telefone, opcaoTelefone);
		
		Endereco endereco = new Endereco();
		String opcaoEndereco = "Residencial";
		HashMap<Endereco, String> enderecoMap = new HashMap<Endereco,String>();		
		
		endereco.setLogradouro( "Rua das Flores" );
		endereco.setBairro( "Guarujá" );
		endereco.setCep( "029990-922" );
		endereco.setCidade( "São Paulo" );
		endereco.setComplemento( "Não há" );
		endereco.setNumero( "888" );
		
		enderecoMap.put( endereco, opcaoEndereco );
		
		p.setEndereco( enderecoMap );
		p.setTelefone( telefoneMap );
		p.setEmail( emailMap );
				
		pessoaService.inserirContato( p );	
	}

}
