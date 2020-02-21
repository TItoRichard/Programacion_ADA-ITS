import java.util.Scanner;
public class EjercicioArray05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] a = new int[10];
        int [] b = new int[10];
        int [] c = new int[20];
        int i, j;
        j = 0;
        
        for (i = 0; i < a.length; i++) {
            System.out.print("Introduce el valor " + (i+1) + " de la matriz A: ");
            a [i] = entrada.nextInt();
        }
        
        for (i = 0; i < b.length; i++) {
            System.out.print("Introduce el valor " + (i+1) + " de la matriz B: ");
            b [i] = entrada.nextInt();
        }
        
        for (i = 0; i < 10; i++) {
            c [j] = a[i];
            j++;
            c [j] = b[i];
            j++;
        }

        for (i = 0; i < c.length; i++) {
            System.out.print("\nEl valor " + (i+1) + " de la matriz C es: " + c[i]);
        }
    }
}