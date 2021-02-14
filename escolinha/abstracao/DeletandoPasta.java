package escolinha.abstracao;

import java.io.File;

public class DeletandoPasta {
    public static void deletePasta(String pasta){
        File minhaPasta = new File(DadoFixos.LOCAL_ARQUIVO.local+pasta);
        if(minhaPasta.delete()){
            System.out.println("Pasta "+minhaPasta.getName()+" foi deletada com sucesso.");
        }else{
            System.out.println("Ocorreu uma falha ao tentar apagar.");
        }
    }
}
