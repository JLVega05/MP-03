package UF4.Persona;

public class Manager extends Employee {
    private int numTrabajadores;
    
    public Manager(){}
    public Manager(String name, String direccion, int salario, String puestoTrabajo, int numTrabajadores) {
        super(name, direccion, salario, puestoTrabajo);
        this.numTrabajadores = numTrabajadores;
    }


    public void gestionProyecto(){
        System.out.println(getPuestoTrabajo() + " " + getName() + " is managing a project with " + numTrabajadores + " workers.");
    }
}
