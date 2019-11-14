import java.util.Scanner;
public class PruebaFactorial {
    public static void main (String[] args) {
        double factorial = 1;
        double numero;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el número al que hacerle el factorial: ");
        numero = entrada.nextDouble();
        while (numero != 0) {
            factorial = factorial * numero;
            numero--;
        }
        System.out.println("El resultado del factorial del número introducido es " + factorial);
    }
}