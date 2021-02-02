package modificadorabstract;

import modificadorabstract.abstracao.Galinha;

public class Granja {
    public static void main(String[] args){
        Galinha g = new Galinha("Caipira", "Lara",1,2.40,"10/01/2020");
        g.certidao();
        g.cacarejar();
    }
}