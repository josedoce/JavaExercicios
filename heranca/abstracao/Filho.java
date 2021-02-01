package heranca.abstracao;

public class Filho extends Familia {
    private String filiacao = "filho";

    public Filho(String nome, String pai, String mae, int idade) {
        super(nome, pai, mae, idade);
    }

    public Filho() {

    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("filiacao: " + this.filiacao);
    }

}
