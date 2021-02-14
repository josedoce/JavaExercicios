package escolinha.abstracao;
import java.io.FileWriter;
import java.io.IOException;

public class GravarRegistro {
    public static void gravarArquivo(String gravar, String grave){
        try {
            //escreva neste arquivo
            FileWriter minhaGravacao = new FileWriter(DadoFixos.LOCAL_ARQUIVO.local+grave);
            minhaGravacao.write(gravar);
            minhaGravacao.close();
            System.out.println("As alterações foram salvas com sucesso.");
        } catch (IOException e) {
            System.out.println("Aconteceu um erro, tente novamente.");
            e.printStackTrace();
        }
    }
}
