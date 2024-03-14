package UF4.Activitat_Herencia;

public class Main {
    public static void main(String[] args) {
        //No se si era lo que pedias pero me gusta probar que todas las partes de la estructura del codigo funcionen

        MP3 mp3 = new MP3();
        mp3.setMode(2);
        
        Musica musica = new Musica("Jairon Vega","Rock");
       
        Ogg ogg = new Ogg();
        ogg.setVersio(3);
        

        
        Video video = new Video("Steven Spielberg", "Angles");
        

        System.out.println("Modo de MP3: " + mp3.getMode());
        System.out.println("Versión de Ogg: " + ogg.getVersio());
        System.out.println("Director del video: " + video.getDirector());
        System.out.println("Idioma del video: " + video.getIdioma());
        System.out.println("Artista musical: " + musica.getArtista() + ", estilo: " + musica.getEstil());
    }
}