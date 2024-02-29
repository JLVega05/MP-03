package UF4.Creacio;

public class Rectangle {
    private int alcada;
    private int base;
    private String color;

    public Rectangle(){}

    public Rectangle(String col){
        color = col;
    }
    public Rectangle(int ba, int al, String col){
        base = ba;
        alcada = al;
        color = col;
    }



    // Getters i Setters
    public int getAlcada(){
        return alcada;
    }
    public void setAlcada (int newAlcada){
        this.alcada = newAlcada;
    }


    public int getBase(){
        return base;
    }
    public void setBase (int newBase){
        this.base = newBase;
    }

    
    public String getColor (){
        return color;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
}
