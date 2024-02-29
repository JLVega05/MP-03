package UF4.Creacio;

public class Quadrat {
    private int costat = 0;
    private String color = "";

    public Quadrat(int cos, String col){
        costat = cos;
        color = col;
    }
    public Quadrat(){}



    public int getCostat(){
        return costat;
    }
    public void setCostat (int newCostat){
        this.costat = newCostat;
    }



    public String getColor (){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
}
