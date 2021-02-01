package heranca.abstracao;

public class Mae extends Familia {
    private String filiacao = "mãe";

    public Mae(String nome, String pai, String mae, int idade) {
        super(nome, pai, mae, idade);
    }

    public Mae() {

    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("filiacao: " + this.filiacao);
    }
}
