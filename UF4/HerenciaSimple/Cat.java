package UF4.HerenciaSimple;

public class Cat extends Animal {
    private void meow(){
        System.out.println("Cat '" + getId() + "' is meowing");
    }

    @Override
    public void sound() {
        meow();
    }
}
