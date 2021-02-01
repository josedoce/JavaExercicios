package associacao.abstracao;

public class Padaria implements Ipadaria {
    private Paes[] pao;

    public Padaria(Paes[] pao) {
        this.pao = pao;
    }

    public Padaria() {

    }

    @Override
    public void print() {
        for (Paes pa : this.pao) {
            System.out.println(pa.getPao());
        }
    }

    @Override
    public Paes[] getPaes() {
        return this.pao;
    }

    @Override
    public void setPaes(Paes[] paes) {
        this.pao = paes;
    }

}
