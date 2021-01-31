package arraysmtd;

import arraysmtd.abstracao.Arraimtd;

public class ExercicioArray {
    public static void main(String[] args) {
        Arraimtd nomes = new Arraimtd();
        // for (String nome : nomes.getNomes()) {
        // System.out.println("nome: " + nome);
        // }
        String[][] pessoa = { { "jose", "22", "123.123.123-12" } };
        nomes.setCivil(pessoa);
        for (String[] cidadao : nomes.getCivil()) {
            System.out.println("-----------------------------");
            System.out.println("Nome: " + cidadao[0]);
            System.out.println("idade: " + cidadao[1]);
            System.out.println("cpf: " + cidadao[2]);
        }
    }
}
