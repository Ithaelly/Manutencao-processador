
import java.util.Arrays;


public class unidadeDeControle{
    private int endereco=0;
    private String comando = null;

    registradores r = new registradores();
    memoria mem= new memoria();
    
    public void setEndereco(int endereco){
        this.endereco = endereco;
    }
    
    public int getEndereco(){
        return endereco;
    }
    
    public void setComando(String comando){
        this.comando = comando;
    }
    
    public String getComando(){
        return comando;
    }
 
    public void atualizaRegistradores(registradores i){
       r=i;
    }
    
    public void atualizaMemoria(memoria m){
        mem=m;
    }
    
    public void colocandoPcDentroDeMar(){ //pega o valor do "pc" e coloca dentro do "mar"
        r.setMAR(r.getPc());
        r.incremetaPC();
        System.out.println("Colocando PC dentro de MAR");
         if(r.getEscolha()==1) System.out.print(r.imprimirtudo());  System.out.println("  Memória:"+ mem.getMem()); System.out.println("  ");
    } 
    public void colocandoMbrDentroDeIr(){ //IR= MBR
        r.setIR(r.getMBR());
        System.out.println("Colocando MBR dentro de IR");
        if(r.getEscolha()==1) System.out.print(r.imprimirtudo());  System.out.println("  Memória:"+ mem.getMem()); System.out.println("  ");
    }
    public void dividirVetor(){
        comando=r.getIR();       
        String[] spl =  comando.split(" ");
        comando=spl[0];    
        endereco = Integer.valueOf(spl[1]);
        System.out.println("Dividindo o vetor");
        if(r.getEscolha()==1) System.out.print(r.imprimirtudo());  System.out.println("  Memória:"+ mem.getMem()); System.out.println("  ");
    }
    public void pegarEnderecoColocarNoMar(){
        r.setMAR(endereco);
        System.out.println("Pega o endereco e coloca no MAR");
        if(r.getEscolha()==1) System.out.print(r.imprimirtudo());  System.out.println("  Memória:"+ mem.getMem()); System.out.println("  ");
    }
}