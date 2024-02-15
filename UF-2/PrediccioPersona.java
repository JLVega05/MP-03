import java.util.Scanner;

public class PrediccioPersona {
  private String equipFutbol = "";
  private String llenguatgeProgramacio = "";
  private double numSort = 0;

  public static void main(String args[]) {
    PrediccioPersona programa = new PrediccioPersona();
    programa.inici();
  }

  public void inici() {
      String mes = mesNacimiento();
      String nom = nomUsuari();
      double edat = edatUsuari();
      analisiDades(mes,nom,edat);
      resultatDades(nom);
    }

  public String mesNacimiento() {
    Scanner lector = new Scanner(System.in);

    System.out.print("Escriu el mes en què vas nèixer.\n");
    System.out.print("Gener\tFebrer\tMarc\n");
    System.out.print("Abril\tMaig\tJuny\n");
    System.out.print("Juliol\tAgost\tSetembre\n");
    System.out.print("Octubre\tNovembre\tDesembre");
    System.out.print("\n\n");

    String mesNaixement = lector.nextLine();

    return mesNaixement;
  }

  public String nomUsuari() {
    Scanner lector = new Scanner(System.in);
    System.out.print("Com et dius?\n");

    String nom = lector.nextLine();

    return nom;
  }

  private double edatUsuari() {
    Scanner lector = new Scanner(System.in);
    System.out.print("Per acabar, quants anys tens?\n");
    double edat = 0;
    while(!lector.hasNextDouble()){
      System.out.println("Escriu un numero valid");
    }
    edat = lector.nextDouble();

    return edat;
  }


  public void analisiDades(String mesNaixement, String nom, double edat) {
    if (mesNaixement.equalsIgnoreCase("Gener")) {
      numSort = edat * 3 / 2;
      equipFutbol = "Bayern de Munich";
      llenguatgeProgramacio = "C++";
    } else if (mesNaixement.equalsIgnoreCase("Febrer")) {
      numSort = edat - 4;
      equipFutbol = "Atlético de Madrid";
      llenguatgeProgramacio = "Python";
    } else if (mesNaixement.equalsIgnoreCase("Marc")) {
      numSort = edat / 2;
      equipFutbol = "Chelsea";
      llenguatgeProgramacio = "JavaScript";
    } else if (mesNaixement.equalsIgnoreCase("Abril")) {
      numSort = edat % 4;
      equipFutbol = "Manchester city";
      llenguatgeProgramacio = "Node.js";
    } else if (mesNaixement.equalsIgnoreCase("Maig")) {
      numSort = edat * 3 / 6;
      equipFutbol = "Liverpool";
      llenguatgeProgramacio = "React";
    } else if (mesNaixement.equalsIgnoreCase("Juny")) {
      numSort = edat + edat;
      equipFutbol = "Real Madrid";
      llenguatgeProgramacio = "C#";
    } else if (mesNaixement.equalsIgnoreCase("Juliol")) {
      numSort = edat * edat / 5;
      equipFutbol = "BVB";
      llenguatgeProgramacio = "Swift";
    } else if (mesNaixement.equalsIgnoreCase("Agost")) {
      numSort = edat * 1 / 2 * edat;
      equipFutbol = "FCB";
      llenguatgeProgramacio = "Java";
    } else if (mesNaixement.equalsIgnoreCase("Setembre")) {
      numSort = edat / edat;
      equipFutbol = "Juve";
      llenguatgeProgramacio = "PHP";
    } else if (mesNaixement.equalsIgnoreCase("Octubre")) {
      numSort = edat * 4 / 3;
      equipFutbol = "PSG";
      llenguatgeProgramacio = "R";
    } else if (mesNaixement.equalsIgnoreCase("Novembre")) {
      numSort = edat % 2 + 23;
      equipFutbol = "Sevilla CF";
      llenguatgeProgramacio = "Go";
    } else if (mesNaixement.equalsIgnoreCase("Desembre")) {
      numSort = (edat + edat) / 2;
      equipFutbol = "Manchester United";
      llenguatgeProgramacio = "Ruby";
    } else {
      numSort = 0;
      equipFutbol = "no tinc equip de fútbol perquè m'he equivocat escrivint el meu mes d'aniversari";
      llenguatgeProgramacio = "no tinc llenguatge de programació preferit perquè m'he equivocat escrivint el meu mes d'aniversari";
      System.out.print("No he entès el que m'has dit!!!!!!!!!!!!\n\n");
    }
  }

  public void resultatDades(String nom) {
    System.out.print("------------------------------------------------\n");

    System.out.print("Un plaer conèixer-te " + nom + ". Amb les dades que m'has donat, mira què he arribat a saber de tu... \n");
    System.out.print("\n\n");

    System.out.print(">>> El teu número de la sort és el " + numSort + "!");
    System.out.print("\n\n");

    System.out.print(">>> El teu equip de fútbol preferit, encara que no ho diguis en veu alta, és el " + equipFutbol + ".");
    System.out.print("\n\n");

    System.out.print(">>> El teu llenguatge de programació més estimat serà " + llenguatgeProgramacio + "!");
    System.out.print("\n\n");

    System.out.print("Torna quan vulguis!\n");
    System.out.print("------------------------------------------------\n\n\n");
  }
}
