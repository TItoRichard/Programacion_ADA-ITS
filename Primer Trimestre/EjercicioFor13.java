import java.util.Scanner;
public class EjercicioFor13 {
    public static void main (String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num, cont_cero, cont_neg, cont_pos, suma_pos, suma_neg, media_pos, media_neg;
        cont_cero = 0;
        cont_neg = 0;
        cont_pos = 0;
        suma_pos = 0;
        suma_neg = 0;
        for (int i = 0; i < 10; i ++) {
            System.out.print("Introduce un número: ");
            num = entrada.nextInt();
            if (num == 0) {
                cont_cero++;
            } else if (num > 0) {
                cont_pos++;
                suma_pos += num;
            } else {
                cont_neg++;
                suma_neg += num;
            }
        }
        if (cont_cero == 0) {
            System.out.println("No se ha introducido ningun cero.");
        } else {
            System.out.println("En los números introducidos hay " + cont_cero +  " ceros.");
        }
        if (cont_pos == 0) {
            System.out.println("No se han introducido números positivos.");
        } else {
            media_pos = suma_pos / cont_pos;
            System.out.println("La media de los números positivos introducidos es: " + media_pos);
        }
        if (cont_neg == 0) {
            System.out.println("No se han introducido números negativos");
        } else {
            media_neg = suma_neg / cont_neg;
            System.out.println("La media de los números negativos introducidos es: " + media_neg);
        }
    }
}