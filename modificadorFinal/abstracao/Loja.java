package modificadorFinal.abstracao;

public class Loja {
    // Com o modificador "final", essa variavel se tornou inauteravel, ou seja, não
    // poderá ter um setter, apenas um getter.
    public static final String NOME_LOJA = "magazine raimunda";

    private final Funcionario FUNCIONARIO = new Funcionario();
    private final Cliente CLIENTE = new Cliente();

    public static final String getNomeLoja() {
        return NOME_LOJA;
    }

    public Cliente getCLIENTE() {
        return CLIENTE;
    }

    public Funcionario getFUNCIONARIO() {
        return FUNCIONARIO;
    }

    // uma referencia final, não poderá ter metodo set e não poderá receber outra
    // referencia.
    // public void setFUNCIONARIO(Funcionario funcionario) {
    // this.FUNCIONARIO = funcionario;
    // }
}
