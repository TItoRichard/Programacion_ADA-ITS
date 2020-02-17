import java.util.Scanner;
public class EjercicioArray03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int [] numeros = new int[5];
        int cont_pos, cont_neg, cont_ceros, suma_pos, suma_neg;
        cont_pos = 0;
        cont_neg = 0;
        cont_ceros = 0;
        suma_pos = 0;
        suma_neg = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i+1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                suma_pos = suma_pos + numeros[i];
                cont_pos++;
            } else if (numeros[i] < 0) {
                suma_neg = suma_neg + numeros[i];
                cont_neg++;
            } else {
                cont_ceros++;
            }
        }
        System.out.println("\nSe han introducido " + cont_pos + " números positivos y su media es " + (float)(suma_pos/cont_pos));
        System.out.println("\nSe han introducido " + cont_neg + " números negativos y su media es " + (float)(suma_neg/cont_neg));
        System.out.println("\nSe han introducido " + cont_ceros + " ceros.");
    }
}