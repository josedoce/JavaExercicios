package projetin.abstracao;

public class MeuErroArray extends ArrayIndexOutOfBoundsException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public MeuErroArray(){
        super("Erro de array, por favor, verifique o array!");
    }
}
