import java.util.*;
public class EjercicioIf6 {
    public static void main (String[] args) {
        String dia;
        Double monto_compra, descuento, total;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el total inicial de la compra: ");
        monto_compra = entrada.nextDouble();
        System.out.print("Introduzca el día de la semana: ");
        dia = entrada.next();
        if (dia.equals("martes") || dia.equals("jueves")) {
            descuento = monto_compra*0.15;
            System.out.println("Tienes un descuento del 15% con un valor total de " + descuento + "€");
            total = monto_compra-descuento;
            System.out.println("El total de la compra se queda en " + total + "€");
        } else {
            System.out.println("Hoy no hay descuento ninguno. El total de la compra se queda en " + monto_compra + "€");
        }
    }
}