package modificadorFinal.abstracao;

//uma classe final não poderá ser extendida, apenas instanciada ou referenciada.
public final class Funcionario extends Pessoa {
    private final String TIPO = "funcionario";

    public Funcionario(String nome) {
        super(nome);
        this.cargo = TIPO;
    }

    public Funcionario() {

    }

    public void imprima() {
        super.imprima();
        System.out.println("Cargo: " + this.cargo);
        System.out.println("===========================");
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
        this.cargo = TIPO;
    }
}
