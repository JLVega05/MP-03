public class Manager extends Esclavo {

    private int numTrabajo;

    public Manager(String nombre, double salario, String puesto, int numTrabajo) {
        super(nombre, salario, puesto);
        this.numTrabajo = numTrabajo;
    }

    public int getNumTrabajo() {
        return numTrabajo;
    }

    public void setNumTrabajo(int numTrabajo) {
        this.numTrabajo = numTrabajo;
    }

    public void gestionProyecto(){

        System.out.println("Manager " + getNombre() + " is managing a project" );
    }

    
    @Override
    public double calcularBonus(){
        // double bonus = getSalario() * 1.15;
        double bonus = getSalario() * 0.15;
        imprimirBonus(bonus);
        return bonus;
    }
   
    public String generarReporte(){
        String reporte = "PERFECT";
        imprimirRep(reporte);
        return reporte;
    }
}
