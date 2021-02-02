package modificadorabstract.abstracao;

public class Galinha extends Aves {
    protected final String SEXO = "feminino";

    public Galinha(String especie, String nome, int idade, double peso, String nascimento){
        super(especie, nome, idade, peso, nascimento);
    }
    public Galinha(){

    }
    @Override
    public void certidao() {
        super.certidao();
        System.out.println("sexo: "+this.SEXO);
        System.out.println("========================");
    }
    @Override
    public void cacarejar() {
        super.cacarejar();
    }

    @Override
    public String getEspecie() {  
        return this.especie;
    }

    @Override
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return this.idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public double getPeso() {
        return this.peso;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String getNascimento() {
        return this.nascimento;
    }

    @Override
    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }
}
