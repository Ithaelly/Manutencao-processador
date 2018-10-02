
public class Processador {
    
    unidadeDeControle uc = new unidadeDeControle();
    unidadeLogicaEAritmetica ula = new unidadeLogicaEAritmetica();
    registradores r= new registradores();
    memoria mem= new memoria();
     
    public void busca(){
        uc.atualizaRegistradores(r);
        uc.atualizaMemoria(mem);
        uc.colocandoPcDentroDeMar();        
    }
    
    public void busca2(){    
        uc.atualizaRegistradores(r);
        uc.atualizaMemoria(mem);
        uc.colocandoMbrDentroDeIr();        
    }
    public void decodifica(){
        uc.atualizaRegistradores(r);
        uc.atualizaMemoria(mem);
        uc.dividirVetor();
    }
    
    public void buscarDados(){
        uc.atualizaRegistradores(r);
        uc.atualizaMemoria(mem);
        uc.pegarEnderecoColocarNoMar();    
    }
    
    public void executa(){   
        if (uc.getComando().equals("Carregar")){
            r.setAcc(Integer.valueOf(r.getMBR()));
            
            if(r.getEscolha()==3){
                System.out.println("entrou em Carregar");
                System.out.print(r.imprimirtudo()); 
                System.out.println("  Memória:"+ mem.getMem());  
                System.out.println("  ");
             } 
        }
        
        else if(uc.getComando().equals("Somar")){
             ula.setSoma(r.getAcc(), Integer.parseInt(r.getMBR()));   //manda os parametros(acc, mbr) para fazer a soma
             r.setAcc(ula.getSoma());
            
             if(r.getEscolha()==3){
                 System.out.println("entrou em Somar");
                 System.out.print(r.imprimirtudo());
                 System.out.println("  Memória:"+ mem.getMem());
                 System.out.println("  ");
             }
        }
        
        else if(uc.getComando().equals("Subtrair")){        
            ula.setSubtrair(r.getAcc(), Integer.parseInt(r.getMBR())); //manda os parametros(acc, mbr) para fazer a subtrair
            r.setAcc(ula.getSubtrair());
            
            if(r.getEscolha()==3){
                System.out.println("entrou em Subtrair"); 
                System.out.print(r.imprimirtudo());
                System.out.println("  Memória:"+ mem.getMem());   
                System.out.println("  ");
            }
        }
        
        else if(uc.getComando().equals("Salvar")){ //pegar o valor que está em mbr e colocar dentro da memória
            uc.pegarEnderecoColocarNoMar();
            r.setMBR( Integer.toString(r.getAcc()));//coloca acc dentro de mbr (mbr=acc;)
        }
    }
}
