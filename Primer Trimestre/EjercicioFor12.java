import java.util.Scanner;
public class EjercicioFor12 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        double factorial = 1;
        System.out.print("Introduzca un número: ");
        num = entrada.nextInt();
        for (int i = num; i > 0; i --) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " +  num + " es " + factorial);
    }
}