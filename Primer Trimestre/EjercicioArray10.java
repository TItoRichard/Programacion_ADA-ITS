import java.util.Scanner;

public class EjercicioArray10 {
    public static void main(String[] args) {
        //Declaración de variables
        Scanner entrada = new Scanner(System.in);
        int[] t = new int[10];
        int ultimo;
        int posicion;

        //Entrada de valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce el valor " + (i+1) + " de la matriz t: ");
            t [i] = entrada.nextInt();
        }

        //Introducimos cuantas posiciones vamos a desplazar
        System.out.print("\nIntroduzca cuantas posiciones va a desplazar: ");
        posicion = entrada.nextInt();

        /*Iniciamos un bucle para repetir en cambio a la ultima 
        posición las veces que sean necesarias para realizar el 
        desplacamiento.*/
        for (int vueltas = 1; vueltas <= posicion; vueltas++) {
            //Almacen del último elemento de la tabla
            ultimo = t[9];

            //Desplazamos los valores
            for (int i = 8; i >= 0; i--) {
                t [i+1] = t[i];
            }

            //Asignamos el valor del último elemento anterior a la primera posición
            t[0] = ultimo;
        }

        //Mostramos de nuevo el array
        for (int i = 0; i < 10; i++) {
            System.out.print("\nEl valor " + (i+1) + " del array actual es: " + t[i]);
        }
    }
}