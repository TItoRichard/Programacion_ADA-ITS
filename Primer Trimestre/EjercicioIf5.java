import java.util.*;
public class EjercicioIf5 {
    public static void main (String[] args) {
        double valor, descuento, recargo, total;
        String tipo_pago;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese el valor de la compra: ");
        valor = entrada.nextDouble();
        System.out.print("Ingrese el método de pago: ");
        tipo_pago = entrada.next();
        descuento = 0.05*valor;
        recargo = 0.03*valor;
        if (tipo_pago.equals("contado")) {
            System.out.println("El total del descuento es de " + descuento);
            total = valor - descuento;
            System.out.println("El total de la compra es: " + total);
        } else if (tipo_pago.equals("tarjeta")) {
            System.out.println("El total del recargo es de " + recargo);
            total = valor + recargo;
            System.out.println ("El total de la compra es: " + total);
        } else {
            System.out.println("Faltan datos para completar el proceso");
        }
    }
}