package enumeracao.abstracao;

public enum Hierarquia {
    CEO(1,"ceo","por diretores"),
    DIRETOR(2,"diretor","por gerentes"),
    GERENTE(3,"gerente","por operadores"),
    OPERACIONAL(4,"operacional","por fazer");

    // será usado na construção do construtor enum
    // não é necessario colocar modificadores, por padrão é private
    int id;
    String cargo;
    String responsavel;

    Hierarquia(int id,String cargo, String responsavel) {
        this.id = id;
        this.cargo = cargo;
        this.responsavel = responsavel;
    }
    public int getId(){
        return this.id;
    }
    public String getCargo(){
        return this.cargo;
    }
    public String getResponsabilidade(){
        return this.responsavel;
    }
}
