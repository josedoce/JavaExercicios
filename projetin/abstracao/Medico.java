package projetin.abstracao;

public class Medico extends Pessoa {
    private String situacao;

    {
        this.isPaciente = false;
        this.isFuncionario = true;
    }
    public Medico(String nome, Integer idade, Cargos cargo) {
        super(nome, idade, cargo);
    }

    public String getSituacao(){
        return this.situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
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
