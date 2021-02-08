package projetin.abstracao;

public class MeuErroParametro extends IllegalArgumentException {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public MeuErroParametro(){
        super("Erro de parametro, por favor, verifique o parametro!");
    }
}
