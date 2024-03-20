package UF4.ProjecteFigura;

public class Trapezi extends Figura{
    private int a;
    private int b;
    private int h;
    
    public Trapezi(){} 
    public Trapezi(int a, int b, int h) {
        super("Trapezi");
        this.a = a;
        this.b = b;
        this.h = h;
    }
  
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
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
        return (a + b) * h / 2.0;
    }
}
