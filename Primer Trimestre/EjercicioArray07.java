import java.util.Scanner;
public class EjercicioArray07 {
    public static void main(final String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean creciente, decreciente;
        creciente = false;
        decreciente = false;
        int i;
        
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el valor " + (i+1) + " de la matriz Numeros: ");
            numeros [i] = entrada.nextInt();
        }

        for (i = 0; i < (numeros.length - 1); i++) {
            if (numeros[i] < numeros[i+1]) {
                creciente = true;
            } else if (numeros[i] > numeros[i+1]) {
                decreciente = true;
            }
        }

        if ((creciente == true) && (decreciente == false)) {
            System.out.println("\nLos números están ordenados de manera creciente.");
        } else if ((creciente == false) && (decreciente == true)) {
            System.out.println("\nLos números están ordenados de manera decreciente.");
        } else if ((creciente == true) && (decreciente == true)) {
            System.out.println("\nLos números no están ordenados.");
        } else if ((creciente == false) && (decreciente == false)) {
            System.out.println("\nLos números son iguales.");
        }
    }
}