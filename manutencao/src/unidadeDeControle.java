
public class unidadeDeControle{
    private int endereco=0;
    private String stringIR=null;

    registradores r = new registradores();

    public void colocandoPcDentroDeMar(){ //pega o valor do "pc" e coloca dentro do "mar"
        r.setMAR(r.getPc());
        r.incremetaPC();
    } 
    public void colocandoMbrDentroDeIr(){ //IR= MBR
        r.setIR(r.getMBR());
    }
    public void dividirVetor(){
        stringIR =r.getIR();
        String[] spl = stringIR.split(" ");
        endereco = Integer.valueOf(spl[0]);
    }
    public void pegarEnderecoColocarNoMar(){
        r.setMAR(endereco);
    }
}