package escolinha.abstracao;

import java.io.File;

public class DeletarRegistro {
    public static void deleteArquivo(String arquivo){
        File meuArquivo = new File(DadoFixos.LOCAL_ARQUIVO.local+arquivo);
        if(meuArquivo.delete()){
            System.out.println("Arquivo "+meuArquivo.getName()+" deletado com sucesso.");
        }else{
            System.out.println("Falha ao deletar este arquivo.");
        }
    }
}
