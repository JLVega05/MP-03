package UF4.Empresa;

public class Transportista {
    private String nom ="";
    private String telefon ="";
    private int numLlicencia;
    //Constructoras
    public Transportista(){}
    public Transportista(String nomTransportista, String telefTransportista){
        nom = nomTransportista;
        telefon = telefTransportista;
    }
    public Transportista(int numLLic){
        numLlicencia = numLLic;
    }  
    //Getters Setters
    public int getNumLlic(){
        return numLlicencia;
    }
    public void setNumLlic(int newNumLlic){
        this.numLlicencia = newNumLlic;
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

    //Funciones
    public void assignarEncarrec(Encarrec e){

    }
    public void anulaEncarrec(Encarrec e){

    }


}
