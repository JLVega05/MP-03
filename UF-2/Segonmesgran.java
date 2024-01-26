import java.util.Scanner;
public class Segonmesgran {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int tamany = 0;
        float max1 = 0;
        float max2 = 0;


        System.out.println("Introdueix el tamany de l'array");
     
        while(!lector.hasNextInt()){
            if (lector.hasNextInt()){
                tamany = lector.nextInt();
            }
            else {
                System.out.println("Introdueix un nombre vàlid");
                lector.next();
            }
        }
        new int[] array = new int[tamany];
        
        int completar = 0;
        
        
       
   
        
    }
}
