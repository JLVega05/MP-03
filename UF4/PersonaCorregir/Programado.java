public class Programado extends Esclavo {

    public Programado(String nombre , double salario, String puesto) {
        super(nombre, salario, puesto);

    }

    public void debug() {

        System.out.println("Programmer " + getNombre() + " is debugging code in C++"  );
    }
    @Override
    public double calcularBonus() {
        // double bonus = getSalario() * 1.12;
        double bonus = getSalario() * 0.12;
        imprimirBonus(bonus);
        return bonus;
    }
    public String generarReporte(){
        String reporte = "excelent";
        imprimirRep(reporte);
        return reporte;
    }
}


