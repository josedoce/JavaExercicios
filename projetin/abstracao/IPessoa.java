package projetin.abstracao;

public interface IPessoa {
    public void imprimir();
    public abstract String getNome();
    public abstract Integer getIdade();
    public abstract Boolean isPaciente();
    public abstract Boolean isFuncionario();
    public abstract Cargos getCargo();
    public abstract void setNome(String nome);
    public abstract void setIdade(Integer idade);
    public abstract void setPaciente(Boolean paciente);
    public abstract void setFuncionario(Boolean funcionario);
    public abstract void setCargo(Cargos funcionario);
}
