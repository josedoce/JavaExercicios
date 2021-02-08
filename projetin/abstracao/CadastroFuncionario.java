package projetin.abstracao;

public class CadastroFuncionario implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Funcionario cadastrado com sucesso!");
	}
    
}
