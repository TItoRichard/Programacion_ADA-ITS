import java.util.Scanner;

public class EjercicioArray09 {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner entrada = new Scanner(System.in);
        int[] t = new int[10];
        int ultimo;

        //Entrada de valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor " + (i+1) + " de la matriz t: ");
            t [i] = entrada.nextInt();
        }

        //Almacen del último elemento de la tabla
        ultimo = t[9];

        //Desplazamos los valores
        for (int i = 8; i >= 0; i--) {
            t [i+1] = t[i];
        }

        //Asignamos el valor del último elemento anterior a la primera posición
        t[0] = ultimo;

        //Mostramos de nuevo el array
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEl valor " + (i+1) + " del array actual es: " + t[i]);
        }
    }
}