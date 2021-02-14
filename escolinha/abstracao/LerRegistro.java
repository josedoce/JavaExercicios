package escolinha.abstracao;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerRegistro {
    public static void leiaArquivo(String arquivo){
        try {
            File minhaLeitura = new File(DadoFixos.LOCAL_ARQUIVO.local+arquivo);
            Scanner leiaMe = new Scanner(minhaLeitura);
            while(leiaMe.hasNextLine()){
                String dados = leiaMe.nextLine();
                System.out.println(dados);
            }
            leiaMe.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
