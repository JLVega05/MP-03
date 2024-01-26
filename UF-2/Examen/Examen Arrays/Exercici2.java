import java.util.Scanner;
public class Exercici2 {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        
        //Preguntar longitud del vector
        System.out.print("Ingresa la longitud del vector: ");
        while(!lector.hasNextInt()){
            System.out.println("Ingresa un numero valido");
            lector.nextLine();
        }
        int[] array1 = new int[lector.nextInt()];

        //Preguntar numeros del vector
        System.out.println("Ingrese los elementos del vector");
        int i = 0;
        while(i < array1.length){
            System.out.print("Elemento " + (i + 1) + ": ");
            if(lector.hasNextInt()){
                array1[i] = lector.nextInt();
                i++;
            }
            else {
                System.out.println("Ingresa un numero valido");
                lector.next();
            }
        }

        //Preguntar que numero se debe buscar
        System.out.println("Ingrese el numero a buscar:");
        while(!lector.hasNextInt()){
            System.out.println("Ingresa un numero valido");
            lector.nextLine();
        }

        int buscar = lector.nextInt();
        lector.close();
        Boolean encontrado = false; 

        //Buscar el numero introducido y terminar el loop si se encuentra
        int posicion = 0;
        for(i = 0; i < array1.length && !encontrado; i++){
            if (array1[i] == buscar){
                encontrado = true;
                posicion = i;
            }
        }

        if (encontrado){
            System.out.println("El valor " + buscar + " se encontró en la posición " + posicion + " del vector.");
        }
        else {
            System.out.println("El valor buscado no se ha encontrado en el vector.");
        }
    }
}
