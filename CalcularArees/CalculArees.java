import java.util.Scanner;
public class CalculArees {
    public void mostrarMenu() {
        System.out.println("De quina figura vols l'area?");
        System.out.println("Tens les següents opcions: quadrat, triangle, trapezi, paralelogram, rectangle, rombe o cercle.");
    }

    public double opcioUsuari() {
        Scanner lector = new Scanner(System.in);
        String figura = lector.nextLine();
        double area = 0;

        if (figura.equalsIgnoreCase("triangle")) {
            triangle triangle = new triangle();
            area = triangle.triangle(23.0, 8.0);
        } else if (figura.equalsIgnoreCase("quadrat")) {
            quadrat quadrat = new quadrat();
            area = quadrat.quadrat(37.0);
        } else if (figura.equalsIgnoreCase("rectangle")) {
            rectangle rectangle = new rectangle();
            area = rectangle.rectangle(68.0, 39.0);
        } else if (figura.equalsIgnoreCase("trapezi")) {
            trapezi trapezi = new trapezi();
            area = trapezi.trapezi(35.0, 16.0, 5.0);
        } else if (figura.equalsIgnoreCase("rombe")) {
            rombe rombe = new rombe();
            area = rombe.rombe(75.0, 30.0);
        } else if (figura.equalsIgnoreCase("paralelogram")) {
            paralelogram paralelogram = new paralelogram();
            area = paralelogram.paralelogram(45.0, 13.0);
        } else if (figura.equalsIgnoreCase("cercle")) {
            cercle cercle = new cercle();
            area = cercle.cercle();
        } else if (figura.equalsIgnoreCase("fi")) {
            CalcularAreesMOD fin = new CalcularAreesMOD();
            fin.fi = true;
            System.out.println("Que tinguis un bon dia.");
        } else {
            System.out.println("Si us plau, inserta una figura vàlida!");
        }

        return area;
    }

    public void resultat(double area) {
        CalcularAreesMOD fin = new CalcularAreesMOD();
        if (!fin.fi) {
            System.out.println("L'area de la figura és " + area + "\n--------------------------------------------------");
        }
    }
}