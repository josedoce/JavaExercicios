package associacao.abstracao;

public class Animal {
    private String[] animal;

    public Animal(String[] animal) {
        this.animal = animal;
    }

    public Animal() {

    }

    public String[] getAnimal() {
        return this.animal;
    }

    public void setAnimal(String[] animal) {
        this.animal = animal;
    }

}
