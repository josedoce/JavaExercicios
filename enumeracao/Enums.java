package enumeracao;

import enumeracao.abstracao.Empresa;
import enumeracao.abstracao.Hierarquia;

public class Enums {
    public static void main(String[] args) {
        Empresa e = new Empresa("joseildo", 22, Hierarquia.OPERACIONAL, Empresa.Salario.OPERACIONAL);
        e.imprimir();
    }
    
}
