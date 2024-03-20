package UF4.ProjecteFigura;

public class Quadrat extends Figura {
    private int costat;

    public Quadrat(){}
    public Quadrat(int r) {
        super("Quadrat");
        this.costat = r;
    }

    public int getCostat() {
        return costat;
    }
    public void setCostat(int costat) {
        this.costat = costat;
    }

    @Override
    public double calcularArea() {
        return costat * costat;
    }
}
