package UF4.ProjecteFigura;

public abstract class Figura {
    private String figura;
    private static int contadorId = 0;
    private int id;

    public Figura(){}
    public Figura(String figura) {
        this.figura = figura;
        this.id = ++contadorId;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Método para imprimir datos de la figura
    public void imprimirDades() {
        System.out.println("La figura amb id " + id + " és un " + figura + ".");
        System.out.println("L'area del " + figura + " és: " + calcularArea());
    }

    // Método para calcular el área de la figura
    public double calcularArea() {
        return 0.0;
    }
}