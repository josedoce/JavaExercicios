package associacao;

import associacao.abstracao.Animal;
import associacao.abstracao.Mamifero;

public class Assoc2 {
    public static void main(String[] args) {
        Animal an = new Animal(new String[] { "gato", "felino", "12" });
        Mamifero m1 = new Mamifero();

        Animal[] animais = new Animal[1];
        animais[0] = an;
        m1.setAnimais(animais);
        m1.imprimir();
    }
}
