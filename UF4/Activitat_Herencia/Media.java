package UF4.Activitat_Herencia;

public class Media {
    private String nom;
    private int durada;

    public Media(){}

    public Media(String nom, int durada) {
        this.nom = nom;
        this.durada = durada;
    }

    // GettersSetters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getDurada() {
        return durada;
    }
    public void setDurada(int durada) {
        this.durada = durada;
    }

    
}
