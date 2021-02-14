package escolinha.abstracao;
import java.io.File;
import java.io.IOException;

public class CriarRegistro {
    public static void criarArquivo(String nome){
        try {
            //estou definindo aqui o local e o nome do arquivo
            File meuArquivo = new File(DadoFixos.LOCAL_ARQUIVO.local, nome);
            //se tudo correr bem, meuArquivo.creteNewFile() retorna verdadeiro
            if(meuArquivo.createNewFile()){
                System.out.println("O arquivo "+meuArquivo.getName()+" foi criado com sucesso.");
            }else{
                System.out.println("O arquivo "+meuArquivo.getName()+" já exite.");
            }
        } catch (IOException e) {
            System.out.println("Um erro aconteceu, tente novamente.");
            e.printStackTrace();
        }
    }
}
