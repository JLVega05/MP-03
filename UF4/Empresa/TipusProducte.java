package UF4.Empresa;

public class TipusProducte {
    private String nom;
    private String codiIdentificador;
    private float preu;
    private int estoc;
    private Boolean aLaVenda;

    public String getNom(){
        return nom;
    }
    public void setNom(String newNom){
        this.nom = newNom;
    }
    public String getCodi(){
        return codiIdentificador;
    }
    public void setCodi(String newCodi){
        this.codiIdentificador = newCodi;
    }
    public float getPreu(){
        return preu;
    }
    public void setPreu(float newPreu){
        this.preu = newPreu;
    }
    public int getEstoc(){
        return estoc;
    }
    public void setEstoc(int newEstoc){
        this.estoc = newEstoc;
    }
    public Boolean getVenda(){
        return aLaVenda;
    }
    public void setVenda(Boolean newVenda){
        this.aLaVenda = newVenda;
    }



}
