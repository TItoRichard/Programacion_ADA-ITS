import java.util.*;
public class EjercicioIf3 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escriba su numero: ");
        numero = entrada.nextInt();
        if (numero < 10) {
            System.out.println("El número " + numero + " tiene 1 cifra");
        } else if (numero < 100) {
            System.out.println("El número " + numero + " tiene 2 cifras");
        } else if (numero < 1000) {
            System.out.println("El número " + numero + " tiene 3 cifras");
        } else if (numero < 10000) {
            System.out.println("El número " + numero + " tiene 4 cifras");
        } else if (numero < 100000) {
            System.out.println("El número " + numero + " tiene 5 cifras");
        } else {
            System.out.println("El número es demasiado largo");
        }
    }
}