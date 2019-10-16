import java.util.Scanner;

public class EjercicioWhile {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = 1;
       System.out.print("Introduce un numero: ");
       n = sc.nextInt();
       while (n != 0){
           System.out.println("La potencia de "+n+" es: "+ n*n);
           System.out.print("Introduce un numero: ");
           n = sc.nextInt();
       }
    }
}