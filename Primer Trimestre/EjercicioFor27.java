import java.util.Scanner;
public class EjercicioFor27 {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       System.out.print("Introduzca el número de elementos por lado: ");
       int n = entrada.nextInt();
       for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n; j++) {
               System.out.print("* ");
           }
           System.out.println("");
       }
    }
}