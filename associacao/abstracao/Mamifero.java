package associacao.abstracao;

public class Mamifero implements IAnimalia {
    Animal[] animais;

    public Mamifero(Animal[] animais) {
        this.animais = animais;
    }

    public Mamifero() {

    }

    public void imprimir() {
        for (Animal ani : this.animais) {

            System.out.println("nome: " + ani.getAnimal()[0]);
            System.out.println("especie: " + ani.getAnimal()[1]);
            System.out.println("faixa de vida: " + ani.getAnimal()[2] + " anos de idade.");
        }
    }

    public Animal[] getAnimais() {
        return this.animais;
    }

    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }
}
