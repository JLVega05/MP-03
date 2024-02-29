package EstudiantiCurs;
import java.util.Scanner;
public class ProgramaPrincipal {

    public static void main(String[] args) {
        Estudiant estudiant = new Estudiant();
        Curs curs = new Curs();
    
      
        estudiant.mostrarInformació("Maria", 20);
        
     
        boolean esMajor = estudiant.esMajorEdat(20);
        System.out.println("L'estudiant és major d'edat? " + esMajor);
        
        // Saluda a l'estudiant
        estudiant.saludar("Maria");
        
        
        curs.mostrarInformacio("Programació en Java", 4);
        
        
        int hores = curs.obtenirHores(4);
        System.out.println("El curs té un total de " + hores + " hores.");
    }
}
