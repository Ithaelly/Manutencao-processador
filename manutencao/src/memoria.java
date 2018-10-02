
public class memoria { 
    private int mar=0;
    private String []mem = new String[101];
    
    public memoria(){
        for(int i=4;i<100; i++){
            mem[i] ="0";
        } 
        mem[0] = "Carregar 100";
        mem[1] = "Somar 98"; 
        mem[2] = "Somar 99";
        mem[3] = "Salvar 97";
        mem[4] = "Carregar 90";
        mem[5] = "Subtrair 91";
        mem[6] = "Salvar 90";
        mem[7] = "VaParaSeZero 10";
        mem[8] = "VaPara 0";
        mem[10] = "VaPara 10";
        mem[90] = "5";
        mem[91] = "1";
        mem[97] = "3";
        mem[98] = "4";
        mem[99] = "5";
        mem[100] = "2";    
    }
     
    public String getMem() { //mostrar o valor da memória
        return mem[mar];
    }

    public void setMem(int mar) { //pega o valor da memória
        this.mar = mar;
    }
}
