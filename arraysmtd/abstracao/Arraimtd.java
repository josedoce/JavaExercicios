package arraysmtd.abstracao;

public class Arraimtd {
    private String[] nomes = new String[] { "joseildo", "maria", "vitória" };
    private String[][] civil = { { "joseildo", "22", "123.123.123-12" }, { "fernanda", "15", "321.321.321-32" },
            { "carla", "17", "987.654.321-00" } };

    public String[] getNomes() {
        return this.nomes;
    }

    public void setNomes(String[] nomes) {
        this.nomes = nomes;
    }

    public String[][] getCivil() {
        return this.civil;
    }

    public void setCivil(String[][] civil) {
        this.civil = civil;
    }
}
