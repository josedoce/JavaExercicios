package escolinha.abstracao;

import java.io.File;

public class CriandoPastas {
    public static void criePasta(String pasta){
        File minhaPasta = new File(DadoFixos.LOCAL_ARQUIVO.local+pasta);
        if(minhaPasta.exists()){
            System.out.println("Esta pasta '"+minhaPasta.getName()+"' já existe.");
        }else{
            minhaPasta.mkdir();
            System.out.println("Pasta criada com sucesso.");
        }
    }

}
