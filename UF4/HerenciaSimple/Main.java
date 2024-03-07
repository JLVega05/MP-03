package UF4.HerenciaSimple;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        Cat c1 = new Cat();
        a1.sound();
        System.out.println(a1.getId());
        a2.sound();
        System.out.println(a2.getId());
        d1.sound();
        d2.sound();
        c1.sound();
    }
}
