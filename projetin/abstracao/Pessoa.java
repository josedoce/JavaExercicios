package projetin.abstracao;

public abstract class Pessoa implements IPessoa{
    public final String NOME_INSTITUICAO = "Lar do Curados";
    protected String nome; //nome
    protected Integer idade = 0; //idade
    protected Boolean isPaciente; //é paciente ? falso ou verdadeiro
    protected Boolean isFuncionario; //e funcionario ? falso ou verdadeiro
    protected Cargos cargo; //cargo
    {
        this.isPaciente = false;
        this.isFuncionario = false;
    }
    public Pessoa(String nome, Integer idade, Cargos cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;

    }
    public Pessoa(String nome, Integer idade) {
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(){

    }
    public void imprimir(){
        maioridade(this.idade);
        System.out.println("------Hospicio "+NOME_INSTITUICAO+"------");
        System.out.println("-----------------------------------------");
        System.out.println("Nome: "+this.nome.toUpperCase());
        System.out.println("Idade: "+this.idade);
        
        if(this.isPaciente && !this.isFuncionario){
            System.out.println("Menor: "+(this.idade >= 18?"maior de idade":"menor de idade"));
            System.out.println("Paciente: "+(this.isPaciente?"sim":"não"));
            System.out.println("-----------------------------------------");
            return;
        }
        System.out.println("Funcionario: "+(this.isFuncionario?"sim":"não"));
        System.out.println("Cargo: "+this.cargo.getCargo());
        System.out.println("-----------------------------------------");
    }
    private void maioridade(Integer idade){
        assert idade >= 0:"assert funcionando";
    }
}
