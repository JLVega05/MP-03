package UF4.Persona;

public class Main {
    public static void main (String[] args) {

        //Los salarios los he puesto asi por la salida que aparece en el enunciado
        Manager manager = new Manager("Avril Aroldo", "Calle Que bonito me ha quedado 35", 80000, "Manager", 21);
        Developer developer = new Developer("Iver Dipali", "Calle Uriel Perez 42", 60000, "Developer", "Java");
        Programmer programmer = new Programmer("Yaron Gabriel", "Calle Iker Lario 24", 76000, "Programmer"); 
        
        double BonusManager = manager.calcularBonus();
        double BonusDeveloper = developer.calcularBonus();
        double BonusProgrammer = programmer.calcularBonus();

        String ReportManager = manager.generarReport() + "Excellent";
        String ReportDeveloper = developer.generarReport() + "Good";
        String ReportProgrammer = programmer.generarReport() + "Excellent";


        //System outs
        System.out.println("Manager's Bonus: $" + BonusManager);
        System.out.println("Developer's Bonus: $" + BonusDeveloper);
        System.out.println("Programmer's Bonus: $" + BonusProgrammer);


        System.out.println(ReportManager);
        System.out.println(ReportDeveloper);
        System.out.println(ReportProgrammer);


        manager.gestionProyecto();
        developer.escribirCodigo();
        programmer.debug();
    }
}