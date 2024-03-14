package UF4.Activitat_Herencia;

public class Video extends Media {
    private String director;
    private String idioma;
    
    public Video(){}

    
    public Video(String nom, int durada, String director, String idioma) {
        super(nom, durada);
        this.director = director;
        this.idioma = idioma;
    }


    public Video(String director, String idioma) {
        this.director = director;
        this.idioma = idioma;
    }


    // GettersSetters
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getIdioma() {
        return idioma;
    }
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
}
