package UF4.ProjecteFigura;

public class Cercle extends Figura {
    private int radi;
    
    public Cercle() {}
    
    public Cercle(int radi) {
        super("Cercle");
        this.radi = radi;
    }


    public int getRadi() {
        return radi;
    }
    public void setRadi(int radi) {
        this.radi = radi;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radi * radi;
    }
}
