package UF4.ProjecteFigura;

public class Rombe extends Figura {
    private int dM;
    private int dm;

    public Rombe(){}
    public Rombe(int dM, int dm){
        super("Rombe");
        this.dM = dM;
        this.dm = dm;
    }
    


    public int getDM() {
        return dM;
    }
    public void setDM(int dM) {
        this.dM = dM;
    }
    public int getDm() {
        return dm;
    }
    public void setDm(int dm) {
        this.dm = dm;
    }

    @Override
    public double calcularArea() {
        return (dM * dm) / 2.0;
    }
}
