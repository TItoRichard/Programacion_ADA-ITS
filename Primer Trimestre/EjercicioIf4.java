import java.util.*;
public class EjercicioIf4 {
    public static void main (String[] args) {
        String nombre,clave;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca su nombre de usuario: ");
        nombre = entrada.nextLine();
        System.out.print("Introduzca su contraseña: ");
        clave = entrada.nextLine();
        if (nombre.equals("Juan") && clave.equals("123456")) {
            System.out.println("Willkommen im System");
        } else {
            System.out.println("Gaskammern für alle");
        }
    }
}