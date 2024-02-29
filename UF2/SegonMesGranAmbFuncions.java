import java.util.Scanner;

public class SegonMesGranAmbFuncions {
    public static void main(String[] args) {
        SegonMesGranAmbFuncions programa = new SegonMesGranAmbFuncions();
        programa.inici();
    }

    public void inici(){
        System.out.println("Entra la mida");
        int mida = llegirEntero();
        float[] vector = new float [mida];
        System.out.println("Ara, has de posar els nombres del vector");

        for (int i = 0; i < vector.length; i++){
            vector[i] = llegirFloat();
        }

        float max2 = calcular2oNumeroMasGrande(vector);
        System.out.println("El segon nombre més gran es " + max2);
    }

    public float calcular2oNumeroMasGrande(float[] arrayFloat) {
        float max1 = 0;
        float max2 = 0;

        for(int i = 0; i < arrayFloat.length; i++){
            if(max1 < arrayFloat[i]){
                max1 = arrayFloat[i];
            }
        }

        for(int i = 0; i < arrayFloat.length; i++){
            float j = arrayFloat[i];
            if(arrayFloat[i] == max1){
            }
            else if(max2 < arrayFloat[i]){
                max2 = arrayFloat[i];
            }
        }
        return max2;
    }

    public int llegirEntero(){
        Scanner lector = new Scanner(System.in);
        int numLlegit = 0;
        boolean valorOk = false;
        while(!valorOk){
            System.out.println("Si us plau, un nombre enter");
            if (lector.hasNextInt()) {
                numLlegit = lector.nextInt();
                valorOk = true;
            }
            else {
                lector.next();
            }
        }
        return numLlegit;
    }

    public float llegirFloat(){
        Scanner lector = new Scanner(System.in);
        float numLlegit = 0;
        boolean valorOk = false;
        while(!valorOk){
            System.out.println("Si us plau, un nombre float");
            if (lector.hasNextFloat()) {
                numLlegit = lector.nextFloat();
                valorOk = true;
            }
            else {
                lector.next();
            }
        }
        return numLlegit;
    }

}