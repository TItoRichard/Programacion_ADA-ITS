import java.util.Scanner;
public class EjercicioArray01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] array = new int [5];
        for (int i = 0; i <array.length; i++) {
            System.out.print("Introduce el valor " + (i+1) + ": ");
            array[i] = entrada.nextInt();
        }
        for (String lectura:array) {
            System.out.println("Número: " + lectura);
        }
    }
}