import java.util.Scanner;
public class EjercicioArray04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] numeros = new int [10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
            System.out.println(numeros[9-i]);
        }
    }
}