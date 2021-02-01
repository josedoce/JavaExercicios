package heranca;

import heranca.abstracao.*;

public class Hera {
    public static void main(String[] args) {
        Filho f = new Filho("laiz", "carlos", "angela", 18);
        f.imprime();
        Pai p = new Pai("carlos", "george", "olivia", 45);
        p.imprime();
        Mae m = new Mae("angela", "tadeu", "graça", 39);
        m.imprime();
    }

}
