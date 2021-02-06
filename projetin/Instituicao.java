package projetin;

import projetin.abstracao.AptidaoFisica;
import projetin.abstracao.Cargos;
import projetin.abstracao.Hospicio;
import projetin.abstracao.Medico;
import projetin.abstracao.Paciente;

public class Instituicao {
    public static void main(String[] args){
        Paciente p1 = new Paciente("joseildo",22);
        Paciente p2 = new Paciente("maria",16);
        Paciente[] pacientes = new Paciente[2];
        pacientes[0] = p1;
        pacientes[1] = p2;

        Medico m1 = new Medico("carlos", 44, Cargos.MEDICO_GERAL);
        m1.setSituacao("apto");
        Medico m2 = new Medico("fernanda", 24, Cargos.ENFERMEIRA);
        m2.setSituacao("inapto");
        Medico[] medicos = new Medico[2];
        medicos[0] = m1;
        medicos[1] = m2;

        Hospicio paciente = new Hospicio(pacientes);
        paciente.getPaciente();
        AptidaoFisica apt = new AptidaoFisica();
        

        Hospicio medico = new Hospicio(medicos);
        medico.getMedico();
        apt.relatorio(medicos);

    }
}
//objetivos de aprendizado neste projeto
/**
 * 1-Associação de classes e organização uml (ok)
 * 2-Herança(super, protected, constructor, blc inicializacao) (ok)
 * 3-Sobrescrita de métodos (ok)
 * 4-Modificador final (ok)
 * 5-Enumeração (ok)
 * 6-classes abstratas (ok)
 * 7-interfaces (ok)
 * 8-Polimorfismo (ok)
 * 9-Exceptions(tryCatchFinally, 
 * multiplas exceções, multicatch,
 * tryWithResources, Exceptions customizadas,
 * Exceptions e regras para sobrescrita)(fica pra depois)
 * 10-Assertivas (ok)
 * 11-classes wrapper e classes utilitarios do java (ok)
 * 12-classe String e utilitarios do java (ok)
 */