import java.util.Scanner;

public class Escaner {
    public static void main (String [] args) {
        System.out.print("Introduce un texto: ");
        Scanner entrada = new Scanner(System.in);
        String texto = entrada.nextLine();
        System.out.println("El texto introducido es: " + texto);
    }
}