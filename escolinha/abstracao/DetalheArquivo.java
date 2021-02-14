package escolinha.abstracao;
import java.io.File;

public class DetalheArquivo {
    public static void detalheArquivo(String arquivo){
        File meuArquivo = new File(DadoFixos.LOCAL_ARQUIVO.local, arquivo);
        if(meuArquivo.exists()){
            System.out.println("Nome do arquivo: "+meuArquivo.getName());
            System.out.println("Nome absoluto do caminho: "+meuArquivo.getAbsolutePath());
            System.out.println("Leitura: "+(meuArquivo.canRead()?"sim":"não"));
            System.out.println("Escrita: "+(meuArquivo.canWrite()?"sim":"não"));
            System.out.println("Tamanho em bytes: "+meuArquivo.length()+"bytes");
            System.out.println("-------arquivos no diretorio-------");
            for(String arquivos : meuArquivo.list()){
                System.out.println(arquivos);
            }
        }else{
            System.out.println("O arquivo não existe.");
        }
    }
}
