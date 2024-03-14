package UF4.Activitat_Herencia;

public class MP3 extends Musica {
    private int mode;

    public MP3(){}

    
    public MP3(int mode) {
        this.mode = mode;
    }


    // GettersSetters
    public int getMode() {
        return mode;
    }
    public void setMode(int mode) {
        this.mode = mode;
    }


    
}
