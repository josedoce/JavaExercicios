package modificadorFinal.abstracao;

public final class Cliente extends Pessoa {
    private final String TIPO = "cliente";

    public Cliente(String nome) {
        super(nome);
        this.cargo = TIPO;
    }

    public Cliente() {

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
