package projetin.abstracao;
    
public class Paciente extends Pessoa {
    {
        this.isPaciente = true;
        this.isFuncionario = false;
    }
    public Paciente(String nome, Integer idade) {
        super(nome, idade);
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public Integer getIdade() {
        return this.idade;
    }

    @Override
    public Boolean isPaciente() {
        return this.isPaciente;
    }

    @Override
    public Boolean isFuncionario() {
        return this.isFuncionario;
    }

    @Override
    public Cargos getCargo() {
        return this.cargo;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public void setPaciente(Boolean paciente) {
       this.isPaciente = paciente;
    }

    @Override
    public void setFuncionario(Boolean funcionario) {
        this.isFuncionario = funcionario;
    }

    @Override
    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
}
