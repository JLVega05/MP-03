package UF4.Persones;

public class Persona {
    private String id;
    private int edad;
    private String nom;
    private String cognom;
    private String adreca;

    

    public Persona(String id, int edad, String nom, String cognom, String adreca) {
        this.id = id;
        this.edad = edad;
        this.nom = nom;
        this.cognom = cognom;
        this.adreca = adreca;
    }
    public String getId() {
        return id;
    }
    public int getEdad() {
        return edad;
    }
    public String getNom() {
        return nom;
    }
    public String getCognom() {
        return cognom;
    }
    public String getAdreca() {
        return adreca;
    }
    
    




}


