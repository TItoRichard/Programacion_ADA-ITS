import java.util.Scanner;

public class Conversiones {
    public static void main (String[] args) {
        System.out.print("Introduzca un caracter: ");
        Scanner sc = Scanner(System.in);
        String texto = sc.nextLine();

        char caracter = texto.charAt(0);
        if (caracter >= 48 && caracter <= 57){
            int n = Integer.parseInt(texto);
            System.out.println(3+n);
        }else{
            System.out.println("No es un numero");
        }
        
        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();
        System.out.println(n);
        
    }
}