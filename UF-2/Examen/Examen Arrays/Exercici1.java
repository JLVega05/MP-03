import java.util.Scanner;
public class Exercici1 {
    public static void main(String[] args){
        Scanner lector = new Scanner((System.in));
        int numeros = 0;

        //Se pide la longitud de los vectores y se asigna a los 3.
        System.out.print("Ingresa la longitud de los vectores: ");
        while(!lector.hasNextInt()){
            System.out.println("Ingresa un numero valido");
            lector.nextLine();
        }
        int[] array1 = new int[lector.nextInt()];
        int[] array2 = new int[array1.length];
        int[] array3 = new int[array1.length];

        //Se ingresan los numeros dentro de los vectores a sumar
        System.out.println("Ingrese los elementos del primer vector:");
        while(numeros < array1.length){
            System.out.print("Elemento " +(numeros+1)+": ");
            if(lector.hasNextInt()){
                array1[numeros] = lector.nextInt();
                numeros++;
            }
            else {
                System.out.println("Ingresa un numero valido");
                lector.next();
            }
        }

        System.out.println("Ingrese los elementos del segundo vector: ");
        numeros = 0;
        while(numeros < array1.length){
            System.out.print("Elemento " +(numeros+1)+": ");
            if(lector.hasNextInt()){
                array2[numeros] = lector.nextInt();
                numeros++;
            }
            else {
                System.out.println("Ingresa un numero valido");
                lector.next();
            }
        }
        lector.close();
        //Se realiza la suma y se ingresan los numeros en el tercer array
        for(int i = 0; i < array1.length ; i++){
            array3[i] = array1[i] + array2[i];
        }
        System.out.println("La suma de los vectores és: ");
        for(int i = 0; i < array1.length ; i++){
            System.out.print(array3[i] + " ");
        }
        

    } 
}
