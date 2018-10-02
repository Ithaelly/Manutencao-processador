
import java.util.Scanner;

public class computador {
         public static void main(String[] args) {
            
                memoria mem = new memoria();
                Processador p = new Processador();

                System.out.println("############### SEJA BEM VINDO ###############");
                System.out.println("  ");
                System.out.println("Este código simula o FUNCIONAMENTO DE UM PROCESSADOR");
                System.out.println("Será impresso os registradores: PC, MBR, MAR, ACC, IR e a memória");
                System.out.println("  ");
                System.out.println("Você precisa escolher quando estas informações serão mostradas. Portanto, digite a opção desejada:");
                System.out.println("1- mostrar os registradores a cada passo");
                System.out.println("2- mostrar os registradores a cada grande grupo, como: buscar, decodificar");
                System.out.println("3- mostrar os registradores a cada instrução, como: soma 5; carr 10;");
                 Scanner ler = new Scanner(System.in);
                System.out.println("  ");
                p.r.setEscolha(ler.nextInt());
                

                p.busca();//MAR=pc
                if(p.r.getEscolha()==2){
                    System.out.println("entrou em Busca");
                    System.out.print(p.r.imprimirtudo());
                    System.out.println("  Memória:"+ mem.getMem());
                    System.out.println("  ");
                }
                
                mem.setMem(p.r.getMAR());//passa o "mar" como a posição da memória 
                p.r.setMBR(mem.getMem());//pega o valor da "memória" nesta posição, e coloca dentro de "mbr"    
                
                p.busca2();//coloca "mbr" dentro de "ir"
                if(p.r.getEscolha()==2){
                    System.out.println("entrou em Busca2");
                    System.out.print(p.r.imprimirtudo());
                    System.out.println("  Memória:"+ mem.getMem());  
                    System.out.println("  ");
                }
                
                p.decodifica();//dividir os dados do vetor
                if(p.r.getEscolha()==2){
                    System.out.println("entrou em Decodificar");
                    System.out.print(p.r.imprimirtudo());
                    System.out.println("  Memória:"+ mem.getMem()); 
                    System.out.println("  ");
                }
                
                p.buscarDados();//pega o endereco e colocar no mar
                if(p.r.getEscolha()==2){
                    System.out.println("entrou em Buscar Dados");
                    System.out.print(p.r.imprimirtudo());
                    System.out.println("  Memória:"+ mem.getMem()); 
                    System.out.println("  ");
                }

                mem.setMem(p.r.getMAR());//passa o "mar" como a posição da memória 
                p.r.setMBR(mem.getMem());//pega o valor da "memória" nesta posição, e coloca dentro de "mbr"    

                p.executa();//tipo faz a soma se for somar
                if(p.r.getEscolha()==2){
                    System.out.println("entrou em Executar");
                    System.out.print(p.r.imprimirtudo());
                    System.out.println("  Memória:"+ mem.getMem());
                    System.out.println("  ");
                }
                
                if(p.uc.getComando().equals("Salvar")){
                    mem.setMem(p.r.getMAR());//passa o "mar" como a posição da memória 
                    p.r.setMBR(mem.getMem());//pega o valor de mbr e coloca dentro da memória
                    
                    if(p.r.getEscolha()==3) {
                        System.out.println("entrou em Salvar"); 
                        System.out.print(p.r.imprimirtudo());
                        System.out.println("  Memória:"+ mem.getMem());   
                        System.out.println("  ");
                    }
                 }
    }
}