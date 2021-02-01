package heranca.abstracao;

public abstract class Familia {
    private static String cartorio = "cartorio madalena";
    private static int indice = 0;
    protected String nome;
    protected String pai;
    protected String mae;
    protected int idade;

    static {
        System.out.println("-----" + cartorio + "-----");
    }

    {
        indice += 1;
    }

    public Familia(String nome, String pai, String mae, int idade) {
        this.nome = nome;
        this.pai = pai;
        this.mae = mae;
        this.idade = idade;
    }

    public Familia() {

    }

    public void imprime() {
        System.out.println("-----" + "indice:" + indice + "-----");
        System.out.println("nome: " + this.nome);
        System.out.println("pai: " + this.pai);
        System.out.println("mãe: " + this.mae);
        System.out.println("idade: " + this.idade);
    }
}
