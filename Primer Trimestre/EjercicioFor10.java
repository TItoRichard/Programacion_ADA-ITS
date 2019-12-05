import java.util.Scanner;
public class EjercicioFor10 {
    public static void main (String[] args) {
        int num, sum_total;
        sum_total = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= 15; i++) {
            System.out.print("Introduzca un número: ");
            num = entrada.nextInt();
            sum_total = sum_total + num;
        }
        System.out.println("La suma total de todos los números es: " + sum_total);
    }
}