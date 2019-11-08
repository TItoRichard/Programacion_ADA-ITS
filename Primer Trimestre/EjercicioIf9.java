import java.util.Scanner;
public class EjercicioIf9 {
    public static void main (String[] args) {
        final int s_inicial = 1000;
        int opt;
        double ingreso, retirada, s_actual;
        Scanner entrada = new Scanner(System.in);
        System.out.println("1. Ingresar dinero.");
        System.out.println("2. Retirar dinero.");
        System.out.println("3. Salir");
        System.out.print("Seleccione la opción deseada: ");
        opt = entrada.nextInt();
        switch (opt) {
            case 1:
                System.out.print("Teclee la cantidad que desea ingresar: ");
                ingreso = entrada.nextDouble();
                s_actual = s_inicial + ingreso;
                System.out.println("El saldo actual es de " + s_actual + "€");
                break;
            case 2:
                System.out.print("Teclee la cantidad que desea retirar: ");
                retirada = entrada.nextDouble();
                if (retirada <= s_inicial) {
                    s_actual = s_inicial - retirada;
                    System.out.println("El saldo actual es de " + s_actual + "€");
                } else {
                    System.out.println("No dispone de saldo suficiente.");
                }
                break;
            case 3:
                System.out.println("Que tenga un buen día");
                break;
        }
    }
}