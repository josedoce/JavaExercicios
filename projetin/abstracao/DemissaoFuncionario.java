package projetin.abstracao;

public class DemissaoFuncionario implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Funcionario demitido.");

    }
    
}
