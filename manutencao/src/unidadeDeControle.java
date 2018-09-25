
import java.util.Arrays;


public class unidadeDeControle{
    private int endereco=0;
    private String comando = null;

    registradores r = new registradores();
    
    public void atualizaRegistradores(registradores i){
       r=i;
    }

    public void colocandoPcDentroDeMar(){ //pega o valor do "pc" e coloca dentro do "mar"
        r.setMAR(r.getPc());
        r.incremetaPC();
    } 
    public void colocandoMbrDentroDeIr(){ //IR= MBR
        r.setIR(r.getMBR());
    }
    public void dividirVetor(){
        comando=r.getIR();       
        String[] spl =  comando.split(" ");
        comando=spl[0];    
        endereco = Integer.valueOf(spl[1]);
    }
    public void pegarEnderecoColocarNoMar(){
        r.setMAR(endereco);
    }
}