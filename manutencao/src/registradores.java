public class registradores {
    private int pc = 0;
    private int MAR =0;
    private int acc;
    private int escolha;
    private String MBR;
    private String IR;
    private String[] mem = new String[100];
    
    public int getAcc(){
        return acc;
    }
    
    public void setAcc(int acc){
        this.acc=acc;
    }
  
    public int getEscolha(){
        return escolha;
    }
    
    public void setEscolha(int escolha){
        this.escolha = escolha;
    }
    
    public int getPc() {
        return pc;
    }

    public void setPc(int pc) {
        this.pc = pc;
    }

    public int getMAR() {
        return MAR;
    }

    public void setMAR(int MAR) {
        this.MAR = MAR;
    }

    public String getMBR() {
        return MBR;
    }

    public void setMBR(String MBR) {     
        this.MBR = MBR;
    }

    public String getIR() {
        return IR;
    }

    public void setIR(String IR) {
        this.IR = IR;
    }

    public String[] getMem() {
        return mem;
    }

    public void setMem(String[] mem) {
        this.mem = mem;
    }
    
    public int incremetaPC(){
        return pc++;
    }

    void colocandoPcDentroDeMar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String imprimirtudo(){
           return "PC:"+ getPc()+"  MBR:"+ getMBR() + "  MAR:"+ getMAR() + "  ACC:"+ getAcc() + "  IR:"+getIR();
        }
}
