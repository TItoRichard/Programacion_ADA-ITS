import java.util.Scanner;
public class EjercicioFor29 {
    public static void main(String[] args) {
        int num, cont_pri, j;
        boolean primo;
        Scanner entrada = new Scanner(System.in);

        cont_pri = 0;
        System.out.print("Introduce un número: ");
        num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {
            primo = true;
            j = 2;
            while (j <= i-1 && primo == true) {
                if (i % j == 0) {
                    primo = false;
                }
                j++;
            }
            if (primo == true) {
                cont_pri++;
                System.out.println(i + " es primo.");
            }
        }
        System.out.println("En el rango 1-" + num + " hay " + cont_pri + " números primos.");
    }
}