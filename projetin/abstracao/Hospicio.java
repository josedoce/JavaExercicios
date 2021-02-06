package projetin.abstracao;

public class Hospicio {
    Paciente[] pacientes;
    Medico[] medicos;

    public Hospicio(Paciente[] pacientes, Medico[] medicos) {
        this.pacientes = pacientes;
        this.medicos = medicos;
    }
    
    public Hospicio(Paciente[] pacientes) {
        this.pacientes = pacientes;
    }
    
    public Hospicio(Medico[] medicos) {
        this.medicos = medicos;
    }

    public Hospicio() {
    }

    public void getPaciente(){
        for(Paciente paciente : this.pacientes){
            paciente.imprimir();
        }
    }

    public void getMedico(){
        for(Medico medico : this.medicos){
            medico.imprimir();
        }
    }

}
