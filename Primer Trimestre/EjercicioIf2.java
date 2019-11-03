import java.util.*;
public class EjercicioIf2 {
    public static void main (String[] args) {
        int n1, n2, n3;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        n1 = entrada.nextInt();
        System.out.print("Introduzca el segundo número: ");
        n2 = entrada.nextInt();
        System.out.print("Introduzca el tercer número: ");
        n3 = entrada.nextInt();
        if ((n1 > n2) && (n2 > n3)) {
            System.out.println("El orden de los números es " + n1 + " > " + n2 + " > " + n3);
        } else if ((n1 > n3) && (n3 > n2)) {
            System.out.println("El orden de los números es " + n1 + " > " + n3 + " > " + n2);
        } else if ((n2 > n1) && (n1 > n3)) {
            System.out.println("El orden de los números es " + n2 + " > " + n1 + " > " + n3);
        } else if ((n2 > n3) && (n3 > n1)) {
            System.out.println("El orden de los números es " + n2 + " > " + n3 + " > " + n1);
        } else if ((n3 > n1) && (n1 > n2)) {
            System.out.println("El orden de los números es " + n3 + " > " + n1 + " > " + n2);
        } else if ((n3 > n2) && (n2 > n1)) {
            System.out.println("El orden de los números es " + n3 + " > " + n2 + " > " + n1);
        } else {
            System.out.println("Los números son iguales");
        }
    }
}