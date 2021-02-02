package interfaces;

import interfaces.abstracao.Feminino;
import interfaces.abstracao.Masculino;

public class Presidio {
    public static void main(String[] args) {
        Feminino f = new Feminino("Joana");
        f.imprimir();
        Masculino m = new Masculino("João");
        m.imprimir();
    }
}
