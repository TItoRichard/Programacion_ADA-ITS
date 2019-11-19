import java.util.Scanner;
public class Ahorcado {
    public static void main (String [] args) {
        Scanner entrada = new Scanner (System.in);
        String secreta;
        System.out.print("Introduzca su palabra: ");
        secreta = entrada.next();
        System.out.println("Su palabra tiene " + secreta.length() + " caracteres.");

        // formar una palabra de '_' de longitud la palabra leida
    }
}