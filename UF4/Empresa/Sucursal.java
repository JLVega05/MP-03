package UF4.Empresa;
public class Sucursal {
    private String nom = "";
    private String adreca = "";
    private String telefon = "";
    private String email = "";

    //Constructores
    public Sucursal(){}
    public Sucursal(String nomSucursal, String adrecaSucursal, String telefonSucursal, String emailSucursal){
        nom = nomSucursal;
        adreca = adrecaSucursal;
        telefon = telefonSucursal;
        email = emailSucursal;
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



    public void descansa(Transportista t){

    }
    public void treballa(Transportista t){

    }
    public void altaClient(Client c){

    }
    public void baixaClient(Client c){

    }
    public void altaEncarrec(Client c, Transportista t, Encarrec e){

    }
    public void anulaEncarrec(Encarrec e){

    }

}
