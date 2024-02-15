import java.util.Scanner;

public class cercle {
    public double cercle() {
        Scanner lector = new Scanner(System.in);
        double radi = -1.0;
        System.out.println("Quin es el radi del cercle?");

        while (radi < 0) {
            if (lector.hasNextDouble()) {
                radi = lector.nextDouble();
                if (radi < 0) {
                    System.out.println("El radi no pot ser negatiu. Torna a intentar-ho.");
                }
            } else {
                System.out.println("Escriu un valor vàlid");
                lector.next();
            }
        }
        return Math.pow(radi, 2) * Math.PI;
    }
}
