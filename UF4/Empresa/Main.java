package UF4.Empresa;
public class Main {
    public static void main(String[] args){
        Sucursal s = new Sucursal();
        Transportista t = new Transportista();

        t.setNom("Vera");
        t.setTelf("653123340");
        t.setNumLlic(5747393);
        s.descansa(t);
        Transportista t1 = new Transportista("Jose Luis", "633789876");
        Transportista t2 = new Transportista(45432374);
        Sucursal s1 = new Sucursal("Nombre" , "Adreca" , "645877890" , "Nombre@gmail.com");
    }
    

}
