import java.util.Scanner;
public class EjercicioFor27 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n;
        System.out.print("Introduzca el tamaño del lado del cuadrado: ");
        n = entrada.nextInt();
        for (int fila = 1; fila <= n; fila++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}