import java.util.Scanner;
public class EjercicioArray08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] t = new int[10];
        int numero, posicion;
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduce el valor " + (i+1) + " de la matriz t: ");
            t [i] = entrada.nextInt();
        }

        System.out.print("\nIntroduzca un número: ");
        numero = entrada.nextInt();
        System.out.print("\nIntroduzca una posición entre 0 y 9: ");
        posicion = entrada.nextInt();

        for (int i = 7; i >= posicion; i--) {
            t [i +1] = t[i];
        }

        t[posicion] = numero;

        System.out.println("\nLa tabla queda de la siguiente manera:");
        for (int resultado:t) {
            System.out.println(resultado);
        }
    }
}