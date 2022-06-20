import java.util.HashMap;

import com.rafaoli.domain.Endereco;
import com.rafaoli.domain.Pessoa;
import com.rafaoli.graphics.AppScreen;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;
import com.rafaoli.service.PessoaService;

public class Recorder {	
	
	public static void main(String[]args) {
		AppScreen appScreen = new AppScreen();
		PessoaRepositoryImpl pessoaRepositoryImpl = new PessoaRepositoryImpl();
		
		PessoaService pessoaService = new PessoaService(pessoaRepositoryImpl);
		
		Pessoa p = new Pessoa();
		
		p.setNome("Bruno");
		p.setRg("55555555");
		String email = "bruno@teste.com";
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
		
		endereco.setLogradouro("Rua das Flores");
		endereco.setBairro("Guarujá");
		endereco.setCep("029990-922");
		endereco.setCidade("São Paulo");
		endereco.setComplemento("Não há");
		endereco.setNumero("888");
		
		enderecoMap.put(endereco, opcaoEndereco);
		
		p.setEndereco(enderecoMap);
		p.setTelefone( telefoneMap );
		p.setEmail(emailMap);
		
		
		
		
		Pessoa p2 = new Pessoa();
		
		p2.setNome("Ana");
		p2.setRg("555566666");
		
		pessoaService.inserirContato(p);
		pessoaService.inserirContato(p2);

		
		appScreen.construirGUI();
	}

}
