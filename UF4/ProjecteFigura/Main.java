package UF4.ProjecteFigura;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de cada clase
        Triangle triangle = new Triangle(5, 8);
        Quadrat quadrat = new Quadrat(4);
        Trapezi trapezi = new Trapezi(3, 6, 4);
        Rombe rombe = new Rombe(7, 9);
        Paralelogram paralelogram = new Paralelogram(4, 6);
        Cercle cercle = new Cercle(5);
        Rectangle rectangle = new Rectangle(2, 3);

        // Muestra información de cada figura
        triangle.imprimirDades();
        quadrat.imprimirDades();
        trapezi.imprimirDades();
        rombe.imprimirDades();
        paralelogram.imprimirDades();
        cercle.imprimirDades();
        rectangle.imprimirDades();
    }
}