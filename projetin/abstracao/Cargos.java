package projetin.abstracao;

public enum Cargos {
    GERENTE_ADMINISTRATIVO("Gerente administrativo"),
    MEDICO_GERAL("Medico geral"),
    PSIQUIATRA("Psiquiatra"),
    PSCOLOGO("Pscologo"),
    ENFERMEIRA("Enfermeira");
    String cargo;
    Cargos(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return this.cargo;
    }
}
