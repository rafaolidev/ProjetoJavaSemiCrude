import java.util.Scanner;

import com.rafaoli.domain.Pessoa;
import com.rafaoli.repository.repositoryImpl.PessoaRepositoryImpl;
import com.rafaoli.service.PessoaService;

public class Recorder {	
	
	public static void main(String[]args) {
		Scanner scan = new Scanner( System.in );
		PessoaRepositoryImpl pessoaRepositoryImpl = new PessoaRepositoryImpl();
		
		PessoaService pessoaService = new PessoaService(pessoaRepositoryImpl);
		
		Pessoa p = new Pessoa();
		
		p.setNome("Teste");
		p.setRg("55555555");
		
		pessoaService.inserirContato(p);
		
		pessoaService.listarContatos();
	}

}
