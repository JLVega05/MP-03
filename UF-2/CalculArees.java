import java.util.Scanner;

public class CalculArees {
  private boolean fi = false;

  public static void main(String args[]) {
    CalculArees programa = new CalculArees();
    programa.inici();
  }

  public void inici() {
    while (!fi) {
      mostrarMenu();
      double area = opcioUsuari();
      if (!fi) {
        resultat(area);
      }
    }
  }

  public void mostrarMenu() {
    System.out.println("De quina figura vols l'area?");
    System.out.println("Tens les següents opcions: quadrat, triangle, trapezi, paralelogram, rectangle, rombe o cercle.");
    System.out.println("Per acabar el programa, introdueix 'fi'.");
  }

  public double opcioUsuari() {
    Scanner lector = new Scanner(System.in);
    String figura = lector.nextLine();
    double area = 0;

    if (figura.equalsIgnoreCase("triangle")) {
      area = triangle(23.0, 8.0);
    } else if (figura.equalsIgnoreCase("quadrat")) {
      area = quadrat(37.0);
    } else if (figura.equalsIgnoreCase("rectangle")) {
      area = rectangle(68.0, 39.0);
    } else if (figura.equalsIgnoreCase("trapezi")) {
      area = trapezi(35.0, 16.0, 5.0);
    } else if (figura.equalsIgnoreCase("rombe")) {
      area = rombe(75.0, 30.0);
    } else if (figura.equalsIgnoreCase("paralelogram")) {
      area = paralelogram(45.0, 13.0);
    } else if (figura.equalsIgnoreCase("cercle")) {
      area = cercle();
    } else if (figura.equalsIgnoreCase("fi")) {
      fi = true;
      System.out.println("Que tinguis un bon dia.");
    } else {
      System.out.println("Si us plau, inserta una figura vàlida!");
    }

    return area;
  }

  public void resultat(double area) {
    if (!fi) {
      System.out.println("L'area de la figura és " + area + "\n--------------------------------------------------");
    }
  }

  public double triangle(double b, double a) {
    return (b * a) / 2;
  }

  public double quadrat(double l) {
    return Math.pow(l, 2);
  }

  public double rectangle(double l, double a) {
    return l * a;
  }

  public double trapezi(double a, double b, double h) {
    return ((a + b) * h) / 2;
  }

  public double rombe(double d1, double d2) {
    return (d1 * d2) / 2;
  }

  public double paralelogram(double b, double h) {
    return b * h;
  }

  public double cercle() {
    Scanner lector = new Scanner(System.in);
    double radi = -1.0;
    System.out.println("Quin es el radi del cercle?");

    while (radi < 0) {
      if (lector.hasNextDouble()) {
        radi = lector.nextDouble();
        if (radi < 0) {
          System.out.println("El radi no pot ser negatiu. Torna a intentar-ho.");
        }
      } else {
        System.out.println("Escriu un valor vàlid");
        lector.next();
      }
    }
    return Math.pow(radi, 2) * Math.PI;
  }
}