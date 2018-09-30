
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

                    p.busca();//MAR=pc
                    mem.setMem(p.r.getMAR());//passa o "mar" como a posição da memória 
                    p.r.setMBR(mem.getMem());//pega o valor da "memória" nesta posição, e coloca dentro de "mbr"    
                    p.busca2();//coloca "mbr" dentro de "ir"
                    p.decodifica();//dividir os dados do vetor
                    p.buscarDados();//pega o endereco e colocar no mar
                    mem.setMem(p.r.getMAR());//passa o "mar" como a posição da memória 
                    p.r.setMBR(mem.getMem());//pega o valor da "memória" nesta posição, e coloca dentro de "mbr"    
                    p.executa();//tipo faz a soma se for somar
                    if(p.uc.getComando()=="Salvar"){
                        mem.setMem(p.r.getMAR());//passa o "mar" como a posição da memória 
                       // mem.setMem(p.r.getMBR());//pega o valor de mbr e coloca dentro da memória
                     }              
    }
}