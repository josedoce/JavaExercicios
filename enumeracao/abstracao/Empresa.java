package enumeracao.abstracao;

public class Empresa {
    public enum Salario {
        CEO(1, 40000),
        DIRETOR(2, 14000),
        GERENTE(3, 8000),
        OPERACIONAL(4, 3000);

        int id;
        double salario;

        Salario(int id, double salario) {
            this.id = id;
            this.salario = salario;
        }

        public int getId() {
            return this.id;
        }

        public double getSalario() {
            return this.salario;
        }
    }

    private String nome;
    private int idade;
    private Hierarquia hierarquia;
    private Salario salario;

    public Empresa(String nome, int idade, Hierarquia hierarquia, Salario salario) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSalario(salario);
        this.setHierarquia(hierarquia);
    }

    public Empresa() {

    }

    public Salario getSalario() {
        return salario;
    }

    public void setSalario(Salario salario) {
        this.salario = salario;
    }

    
    public void imprimir(){
        System.out.println("============J.A.S LTDA===========");
        System.out.println("nome: "+this.nome);
        System.out.println("idade: "+this.idade);
        System.out.println("cargo: "+this.hierarquia.getCargo());
        System.out.println("salario: "+this.salario.getSalario());
        System.out.println("responsabilidade: "+this.hierarquia.getResponsabilidade());
        System.out.println("=================================");
    }
    public Hierarquia getHierarquia() {
        return hierarquia;
    }

    public void setHierarquia(Hierarquia hierarquia) {
        this.hierarquia = hierarquia;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
