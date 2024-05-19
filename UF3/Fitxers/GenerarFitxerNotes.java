package Fitxers;
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class GenerarFitxerNotes {
	//la paraula fi serveix com a marca de final de fitxer
	public static final String MARCA_FI = "fi";
	public static void main (String[] args) {
	GenerarFitxerNotes programa = new GenerarFitxerNotes();
	programa.inici();
	}
	public void inici() {
		try {
			File f = new File("C:\\Users\\jairo\\OneDrive\\Clase\\MP-03\\UF3\\Fitxers\\Notes.txt");
			File g = new File("C:\\Users\\jairo\\OneDrive\\Clase\\MP-03\\UF3\\Fitxers\\NotaMitja.txt");
			Scanner lector = new Scanner(f);
			PrintWriter escritor = new PrintWriter(g);

			boolean llegir = true;
			while (llegir) {
				String nom = lector.next();
				if (MARCA_FI.equals(nom)) {
					llegir = false;
				}
				else {
					String cognom = lector.next();
                    escritor.print("Estudiant: " + nom + " " + cognom);
                    
                    double mitjana = llegirNotes(lector);
                    escritor.println(" - Mitjana: " + mitjana);
				}
			}
			//Cal tancar el fitxer
			lector.close();
			escritor.close();
		}
		catch(Exception e) {
			//Excepció!
			System.out.println("Error llegint estudiants: " + e);
		}
	}

	/** Donat un Scanner en un fitxer quan l’apuntador es troba sobre l’inici
	* de les notes, s’extreuen i es calcula la mitjana.
	*
	* @param lector Scanner a processar
	* @return Mitjana de notes
	*/
	public double llegirNotes(Scanner lector) {
		double res = 0;
		try {
			//Es fan lectures. Cal controlar excepcions també!
			int numNotes = 0;
			double nota = lector.nextDouble();
			while (nota != -1) {
				res += nota;
				nota = lector.nextDouble();
				numNotes++;
			}
			//Es calcula nota mitjana
			res = res/numNotes;
		}
		catch (Exception e) {
			//Excepció!
			System.out.println("Error llegint notes: " + e);
		}
		return res;
	}
}