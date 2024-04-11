package UF4.Persona;

public class Programmer extends Employee {

    public Programmer(String name, String direccion, int salario, String puestoTrabajo) {
        super(name, direccion, salario, puestoTrabajo);
    }

    public void debug() {
        System.out.println(getPuestoTrabajo() + " " + getName() + " is debugging code in Python");
    }
}