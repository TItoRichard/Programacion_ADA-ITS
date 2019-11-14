import java.util.Scanner;
public class EjercicioWhile2 {
    public static void main (String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        num = entrada.nextInt();
        while (num != 0) {
            if (num < 0) {
                System.out.println("El número introducido es negativo.");
            } else if (num > 0) {
                System.out.println("El número introducido es positivo.");
            }
            System.out.println("Introduzca otro número: ");
            num = entrada.nextInt();
        }
        System.out.println("El número introducido es 0");
    }
}