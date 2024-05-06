import java.io.File;
import java.util.Scanner;
public class ObrirFitxer {
    public static void main(String[] args){
        ObrirFitxer programa = new ObrirFitxer();
        programa.inici();
    }
    public void inici() {
        try{
            File f = new File("C:\\Users\\jairo\\OneDrive\\Clase\\MP-03\\UF3\\ObrirFitxer\\Document.txt");
            Scanner lector = new Scanner(f);
            System.out.println("Fitxer obert correctament");
        }
        catch (Exception e){
            System.out.println("Error: " + e);
        }

    }
}