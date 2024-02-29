package EstudiantiCurs;

public class Curs {
    public void mostrarInformacio(String nom, int credits){
        System.out.println("Nom del curs: " + nom + "\nCredits: " + credits);
    }

    public int obtenirHores(int credits){
        int hores = credits * 15;
        return hores;
        
    }
}
