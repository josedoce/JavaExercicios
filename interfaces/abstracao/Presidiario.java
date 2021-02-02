package interfaces.abstracao;

public abstract class Presidiario implements Transferivel {
    protected String nome;
    public Presidiario(String nome){
        this.nome = nome;
    }

}
