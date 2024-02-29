package UF4.Empresa;

public class Main {
    public static void main(String[] args){
        // Sucursal
        Sucursal s1 = new Sucursal("Sucursal Centre", "Carrer Marie Perie 123", "645877890", "Centre@sucursal.com");

        // Transportista 
        Transportista t1 = new Transportista("Jose Luis", "633789876");
        Transportista t2 = new Transportista(45432374); 

        // Client
        Client c1 = new Client();
        c1.setNom("Empresa X");
        c1.setAdreca("Avenida Siempre Viva 742");
        c1.setTelf("654321987");
        c1.setEmail("contacto@empresax.com");

        // Encarrec
        Encarrec e1 = new Encarrec();
        e1.setDia(15);
        e1.setMes(3);
        e1.setHora(14);
        e1.setMinuts(30);

        // Petició
        Peticio p1 = new Peticio();
        p1.setQuantitat(100); 

        
        //System out de info
        System.out.println("Sucursal: " + s1.getNom());
        System.out.println("Transportista: " + t1.getNom() + " amb llicencia: " + t2.getNumLlic());
        System.out.println("Client: " + c1.getNom());
        System.out.println("Encarrec programat pel dia: " + e1.getDia() + "/" + e1.getMes() + " a las " + e1.getHora() + ":" + e1.getMinuts());
    }
}