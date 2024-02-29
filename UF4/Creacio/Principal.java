package UF4.Creacio;

public class Principal {
    public static void main(String[] args) {
        Rectangle r0 = new Rectangle();
        Rectangle r1 = new Rectangle("blau");
        Rectangle r2 = new Rectangle(5,3,"verd");
        
        Quadrat q1 = new Quadrat(3, "vermell");
        Quadrat q2 = new Quadrat();
        q2.setColor("blau");

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(4,4,3,"verd");

        Cercle c1 = new Cercle(2.5,"blau");
        Cercle c2 = new Cercle();
        
        
    }
}
