package UF2;

import java.util.Scanner;
public class CalculNota {
    public static void main(String[] args) {
        CalculNota programa = new CalculNota();
        programa.inici();
    }

    public void inici(){
        mostrarMenu();
        double[] notes = llegirDades();
        double max = calculaMax(notes);
        double min = calculaMin(notes);
        double mitj = calculaMitj(notes);
        imprimir(max, min, mitj);
    }

    public void mostrarMenu() {
        System.out.println("Nota maxima, mínima i mitjana");
        System.out.println("-----------------------------------------------------");
    }


    public double[] llegirDades() {
        Scanner lector = new Scanner(System.in);
        double[] notes = new double[5];
        int i = 0;
        while(i<notes.length){
            System.out.println("Escriu una nota:");
            if(lector.hasNextDouble()){
               notes[i] = lector.nextDouble();
               i++;
            }
            else{
                System.out.println("Introdueix un numero vàlid");
                lector.next();
            }
        }
        return notes;
    }

    public double calculaMax(double notes[]) {
        double max = notes[0];

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] > max) {
                max = notes[i];
            }
        }
        return max;
    }

    public double calculaMin(double[] notes) {
        double min = notes[0];

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] < min) {
                min = notes[i];
            }
        }
        return min;

    }

    public double calculaMitj(double[] notes) {
        double suma = 0;

        for (double nota : notes) {
            suma += nota;
        }

        return suma / notes.length;
    }
    public void imprimir(double max, double min, double mitj){
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("El mes gran es: " + max);
        System.out.println("El mes petit es: " + min);
        System.out.println("La mitjana es: " + mitj);
        System.out.println("--------------------------------------------------------------------------------------------");
    }
}
