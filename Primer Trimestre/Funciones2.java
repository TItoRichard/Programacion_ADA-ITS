import java.util.Scanner;
public class Funciones2 {
    public static void main (String[] args) {
        int opt;
        double num1, num2, resultado;
        Scanner entrada = new Scanner (System.in);
        System.out.print("Introduzca el primer número: ");
        num1 = entrada.nextInt();
        System.out.print("Introduzca el segundo número: ");
        num2 = entrada.nextInt();
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        opt = entrada.nextInt();
        switch (opt) {
            case 1:
                resultado = suma(num1, num2);
                System.out.println("El resultado de la suma de " +  num1 + " y " + num2 + " es " + resultado);
                break;
            case 2:
                resultado = resta(num1, num2);
                System.out.println("El resultado de la resta de " +  num1 + " y " + num2 + " es " + resultado);
                break;
            case 3:
                resultado = multiplicacion(num1, num2);
                System.out.println("El resultado de la multiplicación de " +  num1 + " y " + num2 + " es " + resultado);
                break;
            case 4:
                resultado = division(num1, num2);
                System.out.println("El resultado de la división de " +  num1 + " y " + num2 + " es " + resultado);
                break;
            case 5:
                System.out.println("Saliendo del programa");
                break;
        }        
    }

    public static double suma (Double num1, Double num2) {
        return num1 + num2;
    }

    public static double resta (Double num1, Double num2) {
        return num1 - num2;
    }

    public static double multiplicacion (Double num1, Double num2) {
        return num1 * num2;
    }

    public static double division (Double num1, Double num2) {
        return num1 / num2;
    }
}