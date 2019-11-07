import java.util.Scanner;
public class EjercicioIf7 {
    public static void main (String[] args) {
        double temp;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Ingrese su temperatura: ");
        temp = entrada.nextDouble();
        if (temp <= 10) {
            System.out.println("Killo que frio ase cabesa");
        } else if (temp > 10 && temp <= 20) {
            System.out.println("Está nublada la cosa, eh");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Ayyy que caló miarma");
        } else if (temp > 30) {
            System.out.println("Parese que estamos en Hawaii con estas temperaturas tropicaleh");
        }
    }
}