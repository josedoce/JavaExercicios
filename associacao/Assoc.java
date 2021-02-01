package associacao;

import associacao.abstracao.Padaria;
import associacao.abstracao.Paes;

public class Assoc {
    public static void main(String[] args) {
        Padaria p = new Padaria();
        Paes frances1 = new Paes();
        Paes frances2 = new Paes();
        frances1.setPao("Pão francês");
        frances2.setPao("Pão recife");
        Paes[] paes = new Paes[2];
        paes[0] = frances1;
        paes[1] = frances2;
        p.setPaes(paes);
        p.print();
    }
}
