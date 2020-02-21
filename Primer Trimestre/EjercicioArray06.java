import java.util.Scanner;
public class EjercicioArray06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] a = new int[12];
        int [] b = new int[12];
        int [] c = new int[24];
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
        
        for (i = 0; i < 12; i += 3) {
            for (int k = 0; k < 3; k++) {
                c[j] = a[i+k];
                j++;
            }

            for (int k = 0; k < 3; k++) {
                c[j] = b[i+k];
                j++;
            }
        }

        for (i = 0; i < c.length; i++) {
            System.out.print("\nEl valor " + (i+1) + " de la matriz C es: " + c[i]);
        }
    }
}