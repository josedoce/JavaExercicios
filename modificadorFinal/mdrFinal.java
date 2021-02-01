package modificadorFinal;

import modificadorFinal.abstracao.Cliente;
import modificadorFinal.abstracao.Funcionario;
import modificadorFinal.abstracao.Loja;

public class mdrFinal {
    public static void main(String[] args) {
        Loja l = new Loja();
        // funcionario é final e foi instanciada.
        Funcionario carol = new Funcionario("carol");
        carol.imprima();

        Cliente henrique = new Cliente("henrique");
        henrique.imprima();

        System.out.println(Loja.NOME_LOJA);
        System.out.println(Loja.getNomeLoja());

        Cliente joao = l.getCLIENTE();
        joao.setNome("joão");
        joao.imprima();

        Funcionario tereza = l.getFUNCIONARIO();
        tereza.setNome("tereza");
        tereza.imprima();

        Funcionario carla = l.getFUNCIONARIO();
        carla.setNome("carla");
        carla.imprima();

    }
}
