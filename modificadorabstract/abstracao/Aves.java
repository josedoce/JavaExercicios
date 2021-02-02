package modificadorabstract.abstracao;

public abstract class Aves {
    protected String especie;
    protected String nome;
    protected int idade;
    protected double peso;
    protected String nascimento;

    public Aves(String especie, String nome, int idade, double peso, String nascimento){
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.nascimento = nascimento;
    }
    public Aves(){

    }
    public void certidao(){
        System.out.println("=======certidão da ave=======");
        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        System.out.println("peso: "+this.peso);
        System.out.println("nascimento: "+this.nascimento);
        System.out.println("especie: "+this.especie);
    }
    public void cacarejar(){
        System.out.println("Cocoricooooooooooooo");
    };

    public abstract String getEspecie();
    public abstract void setEspecie(String especie);

    public abstract String getNome();
    public abstract void setNome(String nome);

    public abstract int getIdade();
    public abstract void setIdade(int idade);

    public abstract double getPeso();
    public abstract void setPeso(double peso);

    public abstract String getNascimento();
    public abstract void setNascimento(String nascimento);
}
