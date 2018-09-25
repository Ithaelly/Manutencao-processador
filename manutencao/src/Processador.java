
public class Processador {
    unidadeDeControle uc = new unidadeDeControle();
    registradores r= new registradores();
     
    public void busca(){
       uc.colocandoPcDentroDeMar();
    }
    public void busca2(){    
        uc.colocandoMbrDentroDeIr();
    }
    public void decodifica(){
        uc.dividirVetor();
    }
    public void buscarDados(){
        uc.pegarEnderecoColocarNoMar();
    }
}
