import java.util.Scanner();
public class CalcularAreesMOD {
    public static void main(String args[]) {
        CalcularAreesMOD programa = new CalcularAreesMOD();
        programa.inici();
    }
    public void inici() {
        CalculArees calcular = new CalculArees();
        while (!fi) {
            mostrarMenu();
            double area = opcioUsuari();
            if (!fi) {
                resultat(area);
            }
        }
    }
}
