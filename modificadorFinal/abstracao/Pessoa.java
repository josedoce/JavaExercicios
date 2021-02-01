package modificadorFinal.abstracao;

public abstract class Pessoa implements IQuadro {
    protected String nome;
    protected String cargo;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa() {

    }

    public void imprima() {
        System.out.println("===========================");
        System.out.println("Nome: " + this.nome);
    }

    public String getNome() {
        return this.cargo + ": " + nome;
    }
}
