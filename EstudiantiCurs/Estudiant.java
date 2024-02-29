package EstudiantiCurs;
public class Estudiant{
    public void mostrarInformació(String nom, int edat){
        System.out.println("Nom de l'estudiant: " + nom + "\nEdat de l'estudiant: " + edat);
    }

    public Boolean esMajorEdat(int edat){
        Boolean major = true;
        if(edat<18){
            System.out.println("L'estudiant és major d'edat.");
            major = true;
        }
        else{
            System.out.println("L'estudiant no és major d'edat.");
        }
        return major;
    }

    public void saludar(String nom){
        System.out.println("Salutacions, " + nom + "!");
    }
}