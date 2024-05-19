package UF2;

public class EstrellesGuionsNums {
    public static void main(String[] args) {
        EstrellesGuionsNums programa = new EstrellesGuionsNums();
        programa.inici();
    }

    public void inici(){

        imprimirChar(12,'*');
        imprimirChar(1,'-');
        imprimirChar(6,'5');

        imprimirChar(4,'*');
        imprimirChar(4,'-');
        imprimirChar(2,'3');



        imprimirChar(6,'!');
        imprimirChar(1,'¿');
    }

    public void imprimirChar(int num, char c){
        for(int i = 0; i < num; ++i){
            System.out.print(c);
        }
        System.out.println(" ");
    }
    public void numeros(int repeticiones, int numero) {
        for(int i = 0; i < repeticiones; ++i){
            System.out.print(numero);
        }
        System.out.println(" ");
    }

    public void guions(int num) {
        for(int i = 0; i < num; ++i){
            System.out.print('-');
        }
        System.out.println(" ");
    }

    public void estrelles(int num){
        for(int i = 0; i < num; ++i){
            System.out.print('*');
        }
        System.out.println(" ");
    }
}