package UF4.Persona;

public class Employee {
    public String name;
    private String direccion;
    private int salario;
    private String puestoTrabajo;
    
    public Employee() {}

    public Employee(String name, String direccion, int salario, String puestoTrabajo) {
        this.name = name;
        this.direccion = direccion;
        this.salario = salario;
        this.puestoTrabajo = puestoTrabajo;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    
    /* public double calcularBonus() {
        double bonus = 0;
        if (puestoTrabajo.equalsIgnoreCase("programmer")) {
            bonus = salario * 0.12;
        } else if (puestoTrabajo.equalsIgnoreCase("manager")) {
            bonus = salario * 0.15;
        } else if (puestoTrabajo.equalsIgnoreCase("developer")) {
            bonus = salario * 0.10;
        } else {
            System.out.println("Couldn't calculate bonus");
        }
        return bonus;
    } */
    public double calcularBonus() {
        return double bonus = 0;
    }

    /* public String generarReport() {
        String report = "";
        if (puestoTrabajo.equalsIgnoreCase("manager")) {
            report = "Performance report for Manager " + name + ": ";
        } else if (puestoTrabajo.equalsIgnoreCase("developer")) {
            report = "Performance report for Developer " + name + ": ";
        } else if (puestoTrabajo.equalsIgnoreCase("programmer")) {
            report = "Performance report for Programmer " + name + ": ";
        }
        return report;
    } */
    public String generarReport() {
        return String report = "";
    }
}