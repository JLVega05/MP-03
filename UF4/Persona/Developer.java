package UF4.Persona;

public class Developer extends Employee {
    private String lenguajeProgramacion;

    public Developer() {}

    public Developer(String name, String direccion, int salario, String puestoTrabajo, String lenguajeProgramacion) {
        super(name, direccion, salario, puestoTrabajo);
        this.lenguajeProgramacion = lenguajeProgramacion;
    }

    public void escribirCodigo() {
        System.out.println(getPuestoTrabajo() + " " + getName() + " is writing code in " + lenguajeProgramacion);
    }
}
