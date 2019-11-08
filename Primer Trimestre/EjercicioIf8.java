import java.util.Scanner;
public class EjercicioIf8 {
    public static void main (String[] args) {
        int num;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese el número a comprobar: ");
        num = entrada.nextInt();
        if (num % 10 == 0) {
            System.out.println("El número es multiplo de 10.");
        } else {
            System.out.println("Lo siento, no has tenido suerte.");
        }
    }
}