public class Main {
    public static void main(String[] args){
        Programado p = new Programado("David", 72000, "Programador"); /* He borrado "direcció" de las constructoras */
        Manager m = new Manager("Rocio", 75000, "Manager", 10);
        Desarrollador d = new Desarrollador("Valentina", 80000, "Desarrollador", "C#");
        p.calcularBonus();
        m.calcularBonus();
        d.calcularBonus();
        p.generarReporte();
        m.generarReporte();
        d.generarReporte();
        p.debug();
        m.gestionProyecto();
        d.EscCodigo();
    }
}
