import java.util.Scanner;
public class EjercicioFor15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad , altura, suma_edad, edad_media, suma_altura, altura_media, edad_mas18, altura_mas175;
        suma_edad = 0;
        edad_media = 0;
        suma_altura = 0;
        altura_media = 0;
        edad_mas18 = 0;
        altura_mas175 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i+1));
            System.out.print("Introduzca la edad: ");
            edad = entrada.nextInt();
            System.out.print("Introduzca la altura en cm: ");
            altura = entrada.nextInt();
            if (edad >= 18) {
                edad_mas18++;
            }
            suma_edad = suma_edad + edad;
            if (altura >= 175) {
                altura_mas175++;
            }
            suma_altura = suma_altura + altura;
        }
        edad_media = suma_edad / 5;
        altura_media = suma_altura / 5;
        System.out.println("La media de edad entre los 5 alumnos es de " + edad_media + " y hay " + edad_mas18 + " alumnos con más de 18 años.");
        System.out.println("La media de altura entre los 5 alumnos es de " + altura_media + " y hay " + altura_mas175 + " alumnos que miden más de 175 cm.");
    }
}