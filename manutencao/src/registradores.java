public class registradores {
    private int pc = 0;
    private int MAR =0;
    private String MBR;
    private String IR;
    private String comando;
    private String[] mem = new String[100];
            
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

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
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

}