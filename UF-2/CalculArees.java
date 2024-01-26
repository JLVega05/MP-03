import java.util.Scanner;

public class CalculArees {
  double area = 0;
  Boolean fi=false;
  public static void main (String args[]){
    CalculArees programa = new CalculArees();
    programa.inici();
  }

  public void inici() {
      Scanner lector = new Scanner(System.in);
      boolean fi = false;

      while (!fi) {
          mostrarMenu();
          fi = opcioUsuari(lector);
      }

      lector.close();
  }

  public static void mostrarMenu() {
      System.out.println("De quina figura vols calcular l'area? Tens les següents opcions:\nquadrat, cercle, trapezi, rectangle, rombe, paralelogram, triangle.\nEscriu 'fi' per tancar el programa");
  }

  public boolean opcioUsuari(Scanner lector) {
      String figura = lector.nextLine();
      double area;

      if (figura.equalsIgnoreCase("fi")) {
          return true;
      }

      switch (figura.toLowerCase()) {
          case "triangle":
              area = triangle();
              mostrarResultat(area);
              break;
          case "quadrat":
              area = quadrat();
              mostrarResultat(area);
              break;
          case "rectangle":
              area = rectangle();
              mostrarResultat(area);
              break;
          case "trapezi":
              area = trapezi();
              mostrarResultat(area);
              break;
          case "rombe":
              area = rombe();
              mostrarResultat(area);
              break;
          case "paralelogram":
              area = paralelogram();
              mostrarResultat(area);
              break;
          case "cercle":
              System.out.println("Introdueix el radi del cercle:");
              double rC = lector.nextDouble();
              // Consume the remaining newline character
              lector.nextLine();
              area = cercle(rC);
              mostrarResultat(area);
              break;
          default:
              System.out.println("Opció incorrecta!");
              break;
      }

      return false;
  }

  public static void mostrarResultat(double area) {
      System.out.println("L'area de la figura és: " + area);
      System.out.println("-------------------------------");
  }

  public static double triangle() {
      double b = 23.0;
      double h = 8.0;
      return (b * h) / 2;
  }

  public static double quadrat() {
      double r = 37.0;
      return Math.pow(r, 2);
  }

  public static double rectangle() {
      double a = 68.0;
      double b = 39.0;
      return a * b;
  }

  public static double trapezi() {
      double a = 35.0;
      double b = 16.0;
      double h = 5.0;
      return ((a + b) * h) / 2;
  }

  public static double rombe() {
      double dM = 75.0;
      double dm = 30.0;
      return (dM * dm) / 2;
  }

  public static double paralelogram() {
      double b = 45.0;
      double h = 13.0;
      return b * h;
  }

  public static double cercle(double r) {
      return Math.PI * Math.pow(r, 2);
  }
}