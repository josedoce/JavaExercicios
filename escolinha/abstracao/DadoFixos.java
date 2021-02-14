package escolinha.abstracao;

public enum DadoFixos {
    LOCAL_ARQUIVO("C:\\Users\\JoseNervoso\\Desktop\\");

    String local;
    DadoFixos(String local){
        this.local = local;
    }
    public String getLocal(){
        return this.local;
    }
}
