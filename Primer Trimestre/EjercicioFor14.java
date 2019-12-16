import java.util.Scanner;
public class EjercicioFor14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int sueldo, suma, masde1000;
        masde1000 = 0;
        suma = 0;
        for (int i = 1; i < 10; i++) {
            System.out.print("Introduzca un sueldo: ");
            sueldo = entrada.nextInt();
            if (sueldo > 1000) {
                masde1000++;
            }
            suma = suma + sueldo;
        }
        System.out.println("La suma de los sueldos introducidos es " + suma + " y de esos hay " + masde1000 + " sueldos mayores de 1000€");
    }
}