import java.util.*;
public class EjercicioIf1 {
    public static void main (String[] args) {
        int n1, n2;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        n1 = entrada.nextInt();
        System.out.print("Introduzca el segundo número: ");
        n2 = entrada.nextInt();
        if (n1 > n2) {
            System.out.println("El número más grande es " + n1);
        } else if (n2 > n1) {
            System.out.println("El número más grande es " + n2);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}