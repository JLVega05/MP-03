package UF4.Empresa;

public class Client {
    private String nom ="";
    private String adreca ="";
    private String telefon ="";
    private String email ="";

    //Constructors
    public Client() {}
    public Client(String nom, String adreca, String telefon, String email) {
        this.nom = nom;
        this.adreca = adreca;
        this.telefon = telefon;
        this.email = email;
    }
    //Getters Setters
    public String getEmail(){
        return email;
    }
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
     public String getAdreca(){
        return adreca;
    }
    public void setAdreca(String newAdreca){
        this.adreca = newAdreca;
    }
    public String getTelf(){
        return telefon;
    }
    public void setTelf(String newTelf){
        this.telefon = newTelf;
    }
    public String getNom(){
        return nom;
    }
    public void setNom(String newNom){
        this.nom = newNom;
    }

    // Funcions
    public void assignarEncarrec(Encarrec e) {
    }

    public void anulaEncarrec(Encarrec e) {
    }
}

