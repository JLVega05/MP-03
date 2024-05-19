package ContadorParaules;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class ContadorParaules {
    public static void main (String[] args) {
        ContadorParaules programa = new ContadorParaules();
        programa.inici();
    }
    
    public void inici() {
        File entrada = new File("C:\\Users\\jairo\\OneDrive\\Clase\\MP-03\\UF3\\ContadorParaules\\entrada.txt");
        File sortida = new File("C:\\Users\\jairo\\OneDrive\\Clase\\MP-03\\UF3\\ContadorParaules\\sortida.txt");

        try {
            if (!entrada.exists()) {
                System.out.println("Error: l'arxiu d'entrada no s'ha trobat.");
                return; 
            }
            
            Scanner lector = new Scanner(entrada);
            PrintWriter escritor = new PrintWriter(sortida);

            int paraules = 0;
            while (lector.hasNext()) {
                lector.next();
                paraules++; 
            }
            escritor.println("El document tenia un total de " + paraules + " paraules.");

			lector.close();
			escritor.close();
        } catch(Exception e) {
            System.out.println("Error durante la cuenta de palabras: " + e);
        }
	}
}