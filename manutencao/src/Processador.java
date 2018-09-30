
public class Processador {
    int acc;
    
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
        System.out.println("entrou em executar");
        if (uc.getComando()== "Carregar"){
           System.out.println("entrou em executar/carregar");
            acc=Integer.valueOf(r.getMBR());
            System.out.println("ACC: "+ acc);
        }
        else if(uc.getComando()=="Soma"){
             ula.setSoma(acc, Integer.parseInt(r.getMBR()));   //manda os parametros(acc, mbr) para fazer a soma
             acc = ula.getSoma();
        }
        else if(uc.getComando()=="Subtrair"){
            ula.setSubtrair(acc, Integer.parseInt(r.getMBR())); //manda os parametros(acc, mbr) para fazer a subtrair
            acc = ula.getSubtrair();
        }
        else if(uc.getComando()=="Salvar"){ //pegar o valor que está em mbr e colocar dentro da memória
            r.setMBR( Integer.toString(acc));//coloca acc dentro de mbr (mbr=acc;)
        }
    }
}
