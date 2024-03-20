package UF4.ProjecteFigura;

public class Paralelogram extends Figura {
    private int b;
    private int h;

    public Paralelogram(){}
    public Paralelogram(int b, int h){
        super("Paralelogram");
        this.b = b;
        this.h = h;
    }

    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getH() {
        return h;
    }
    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calcularArea() {
        return b * h;
    }
}
