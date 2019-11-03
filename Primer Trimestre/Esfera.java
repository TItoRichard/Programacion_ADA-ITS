import java.util.Scanner;

//Area = 4 * pi * r^2
//Volumen = 4/3 * pi * r^3
//Radio = Diametro / 2

public class Esfera {
    public static void main (String [] args) {
        System.out.print("Introduce un diametro de esfera: ");
        Scanner diametro = new Scanner (System.in);
        int r = diametro.nextInt();
        int radio = r/2;
        System.out.println(radio);
    }
}