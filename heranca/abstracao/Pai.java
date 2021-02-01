package heranca.abstracao;

public class Pai extends Familia {
    private String filiacao = "pai";

    public Pai(String nome, String pai, String mae, int idade) {
        super(nome, pai, mae, idade);
    }

    public Pai() {

    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("filiacao: " + this.filiacao);
    }
}
