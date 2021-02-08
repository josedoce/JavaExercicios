package projetin.abstracao;

public class AptidaoFisica {
    public void relatorio(Pessoa[] pessoas){
        for(Pessoa pessoa : pessoas){
            if(pessoa instanceof Medico){
                Medico m = (Medico) pessoa; //convertendo pessoa para medico
                //agora tenho acesso aos metodos de medico
                System.out.println("-----------------------------");
                System.out.println("aptidao fisica: " +m.getSituacao());
                System.out.println("cargo: " +m.cargo.getCargo());
                System.out.println("-----------------------------");
            }
        }
    }
    public void isAutorizado(String credenciais){
        if(credenciais == null){
            throw new IllegalArgumentException("preencha todos os parametros!");
        }
        System.out.println("Autorizado");
    }
    
    public void isFormado(String[] cursos) throws MeuErroArray, MeuErroParametro{
        
    }
}
