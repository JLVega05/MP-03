package UF2.Examen;
import java.util.Scanner;

//Un programa per jugar al MasterMind.
public class Mastermind_Prova {
    //Constants
    public final static char TOT_CORRECTE = '0';
    public final static char MALA_POSICIO = 'X';
    public final static char INCORRECTE = '-';
    public final int LONG_SECRET = 3;
    public final static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static String secret = "";
    public static String resposta = "";

    //Mètodes associats al problema general
    public static void main(String[] args) {
        Mastermind_Prova mastermind = new Mastermind_Prova();
        mastermind.inici();
    }

    //Param. entrada: cap
    //Param. sortida: cap
    public void inici() {
        secret = generarParaulaSecreta();
        while (!resoldreResposta(secret, preguntarResposta())) {
            // continuar fins que l'usuari posa bé la paraula
        }
    }

    //Param. entrada: cap 
    //Param. sortida: la paraula de la resposta (un String)
    public String generarParaulaSecreta() {
        String res = "";
        for (int i = 0; i < LONG_SECRET; i++) {
            res = res + generarLletraAleatoria();
        }
        return res;
    }

    //Param. entrada: cap
    //Param. sortida: la paraula de resposta (un String)
    public String preguntarResposta() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduiu la resposta (3 caracters): ");
        String resposta = scanner.nextLine();
        while (!comprovarResposta(resposta)) {
            System.out.println("Resposta incorrecta, torna a provar: ");
            resposta = scanner.nextLine();
        }
        return resposta;
    }

    //Param. entrada: la paraula secreta i la resposta de l'usuari (dos String)
    //Param. sortida: un valor booleà indicant si la resposta és correcta o no
    public boolean resoldreResposta(String secret, String resposta) {
        String res = generarPista(secret, resposta);
        boolean fi = false;
        System.out.print("La resposta és [" + res + "].");
        if (resposta.equals(secret)){
            System.out.println("Has encertat!");
            fi = true;
        } else {
            System.out.println("Continua intentant−ho!");
        }
        return fi;
    }

    //Param. entrada: cap
    //Param. sortida: una lletra aleatoria (un char)
    public char generarLletraAleatoria() {
        long nano = System.nanoTime();
        int index = (int) (nano % abc.length());
        return abc.charAt(index);
    }

    //Param. entrada: la resposta de l'usuari (un String)
    //Param. sortida: un valor boolea que indica si es correcte o no
    public boolean comprovarResposta(String resposta) {
        if (resposta.length() != LONG_SECRET) {
            return false;
        }
        for (int i = 0; i < resposta.length(); i++) {
            char c = resposta.charAt(i);
            if ( -1 == abc.indexOf(c)){
                return false;
            }
        }
        return true;
    }

    //Param. entrada: la paraula secreta i la resposta de l'usuari (dos String)
    //Param. sortida: la pista generada (un String)
    public String generarPista(String s, String r) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char charSecret = s.charAt(i);
            char charResposta = r.charAt(i);
            if (charSecret == charResposta) {
                res = res + TOT_CORRECTE;
            }
            else if (s.indexOf(charResposta) != - 1){
                res = res + MALA_POSICIO;
            }
            else {
                res = res + INCORRECTE;
            }
        }
        return res;
    }
}