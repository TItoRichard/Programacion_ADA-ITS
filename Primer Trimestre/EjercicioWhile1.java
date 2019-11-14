import java.util.Scanner;
public class EjercicioWhile1 {
    public static void main (String[] args) {
        int num, cuadrado; //declaramos variables del número a introducir y el cuadrado de dicho número
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el número a operar: ");
        num = entrada.nextInt();
        while (num >= 0) {
            cuadrado = num * num;
            System.out.println("El cuadrado de " + num + " es " + cuadrado);
            System.out.println("Introduzca otro número, por favor: ");
            num = entrada.nextInt();
        }
        System.out.println("El número introducido es negativo. Saliendo del programa.");
    }
}