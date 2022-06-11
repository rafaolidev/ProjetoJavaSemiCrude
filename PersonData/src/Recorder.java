import java.util.Scanner;

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
		Pessoa p2 = new Pessoa();
		
		p2.setNome("Ana");
		p2.setRg("555566666");
		
		pessoaService.inserirContato(p);
		pessoaService.inserirContato(p2);

		pessoaService.listarContatos();
		
		appScreen.construirGUI();
	}

}
