package interfaces.abstracao;

public class Masculino extends Presidiario {
    private final String SEXO = "masculino";

    public Masculino(String nome) {
        super(nome);
    }
    @Override
    public void imprimir() {
        System.out.println("===================");
        System.out.println("nome: "+this.nome);
        System.out.println("sexo: "+this.SEXO);
        System.out.println("===================");
    }
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
