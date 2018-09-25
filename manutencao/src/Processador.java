
public class Processador {
    unidadeDeControle uc = new unidadeDeControle();
    unidadeLogicaEAritmetica ula = new unidadeLogicaEAritmetica();
    registradores r= new registradores();
     
    public void busca(){
        uc.atualizaRegistradores(r);
       uc.colocandoPcDentroDeMar();
        System.out.println("entrou em busca");
    }
    public void busca2(){    
        uc.atualizaRegistradores(r);
        uc.colocandoMbrDentroDeIr();
         System.out.println("entrou em busca2");
    }
    public void decodifica(){
        uc.atualizaRegistradores(r);
        uc.dividirVetor();
         System.out.println("entrou em decodificar");
    }
    public void buscarDados(){
        uc.atualizaRegistradores(r);
        uc.pegarEnderecoColocarNoMar();
         System.out.println("entrou em buscaDados");
    }
    public void executa(){
//ula.
    }
}
