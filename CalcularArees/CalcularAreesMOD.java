import java.util.Scanner;
public class CalcularAreesMOD {

    public static void main(String args[]) {
        CalcularAreesMOD programa = new CalcularAreesMOD();
        programa.inici();
    }

    public Boolean fi = false;

    public void inici() {
        CalculArees calcular = new CalculArees();
            calcular.mostrarMenu();
            double area = calcular.opcioUsuari();
            CalculArees fin = new CalculArees();
                calcular.resultat(area);
            }    }
    