
public class Processador {
    
    unidadeDeControle uc = new unidadeDeControle();
    unidadeLogicaEAritmetica ula = new unidadeLogicaEAritmetica();
    registradores r= new registradores();
    memoria mem= new memoria();
     
    public void busca(){
        uc.atualizaRegistradores(r);
        uc.atualizaMemoria(mem);
        uc.colocandoPcDentroDeMar();        
        System.out.println("entrou em busca");
    }
    
    public void busca2(){    
        uc.atualizaRegistradores(r);
        uc.atualizaMemoria(mem);
        uc.colocandoMbrDentroDeIr();        
         System.out.println("entrou em busca2");
    }
    public void decodifica(){
        uc.atualizaRegistradores(r);
        uc.atualizaMemoria(mem);
        uc.dividirVetor();
        System.out.println("entrou em decodificar");
    }
    
    public void buscarDados(){
        uc.atualizaRegistradores(r);
        uc.atualizaMemoria(mem);
        uc.pegarEnderecoColocarNoMar();    
        System.out.println("entrou em buscaDados");
    }
    
    public void executa(){
        System.out.println("entrou em executar");
    
        if (uc.getComando().equals("Carregar")){
           System.out.println("entrou em executar/carregar");
            r.setAcc(Integer.valueOf(r.getMBR()));
            if(r.getEscolha()==3) System.out.print(r.imprimirtudo()); System.out.println("  Memória:"+ mem.getMem()); System.out.println("  ");
        }
        
        else if(uc.getComando().equals("Somar")){
              System.out.println("entrou em executar/somar");
             ula.setSoma(r.getAcc(), Integer.parseInt(r.getMBR()));   //manda os parametros(acc, mbr) para fazer a soma
             r.setAcc(ula.getSoma());
             if(r.getEscolha()==3) System.out.print(r.imprimirtudo()); System.out.println("  Memória:"+ mem.getMem()); System.out.println("  ");
        }
        
        else if(uc.getComando().equals("Subtrair")){
              System.out.println("entrou em executar/subtrair");
            ula.setSubtrair(r.getAcc(), Integer.parseInt(r.getMBR())); //manda os parametros(acc, mbr) para fazer a subtrair
            r.setAcc(ula.getSubtrair());
            if(r.getEscolha()==3) System.out.print(r.imprimirtudo()); System.out.println("  Memória:"+ mem.getMem()); System.out.println("  ");
        }
        
        else if(uc.getComando().equals("Salvar")){ //pegar o valor que está em mbr e colocar dentro da memória
              System.out.println("entrou em executar/salvar");
            uc.pegarEnderecoColocarNoMar();
            r.setMBR( Integer.toString(r.getAcc()));//coloca acc dentro de mbr (mbr=acc;)
        }
    }
}
