
public class memoria { 
    int mar=0;
    String []mem = new String[100];
    
    public void memoria(){
        for(int i=4;i<100; i++){
            mem[i] ="0";
        } 
        mem[0] = "Carregar 100";
        mem[1] = "Soma 98"; 
        mem[2] = "Soma 99";
        mem[3] = "Salva 97";
        mem[4] = "Carregar 90";
        mem[5] = "Subtrair 91";
        mem[6] = "Salva 90";
        mem[7] = "VaParaSeZero 10";
        mem[8] = "VaPara 0";
        mem[10] = "VaPara 10";
        mem[90] = " 5";
        mem[91] = " 1";
        mem[97] = " 3";
        mem[98] = " 4";
        mem[99] = " 5";
        mem[100] = " 2";    
    }
     
    public String getMem() { //mostrar o valor da memória
        return mem[mar];
    }

    public void setMem(int mar) { //pega o valor da memória
        this.mar = mar;
    }
 
}
