package UF4.Activitat_Herencia;

public class Ogg extends Musica{
    private int versio;

    public Ogg(){}

    
    public Ogg(int versio) {
        this.versio = versio;
    }

    // GettersSetters
    public int getVersio() {
        return versio;
    }
    public void setVersio(int versio) {
        this.versio = versio;
    }
}
