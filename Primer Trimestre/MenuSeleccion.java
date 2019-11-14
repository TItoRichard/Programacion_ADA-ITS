import java.util.Scanner;
public class MenuSeleccion {
    public static void main (String[] args) {
        int opt;
        double num1, num2;
        Scanner entrada = new Scanner (System.in);
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Factorial");
        System.out.println("7. Salir");
        System.out.println("Seleccione una opción: ");
        opt = entrada.nextInt();
        switch (opt) {
            case 1:
                System.out.print("Introduzca el primer número: ");
                num1 = entrada.nextInt();
                System.out.println("Introduzca el segundo número: ");
                num2 = entrada.nextInt();
                double suma = num1 + num2;
                System.out.println("El resultado de la suma de " +  num1 + " y " + num2 + " es " + suma);
                break;
            case 2:
                System.out.print("Introduzca el primer número: ");
                num1 = entrada.nextInt();
                System.out.println("Introduzca el segundo número: ");
                num2 = entrada.nextInt();
                double resta = num1 - num2;
                System.out.println("El resultado de la resta de " +  num1 + " y " + num2 + " es " + resta);
                break;
            case 3:
                System.out.print("Introduzca el primer número: ");
                num1 = entrada.nextInt();
                System.out.println("Introduzca el segundo número: ");
                num2 = entrada.nextInt();
                double multi = num1 * num2;
                System.out.println("El resultado de la multiplicación de " +  num1 + " y " + num2 + " es " + multi);
                break;
            case 4:
                System.out.print("Introduzca el primer número: ");
                num1 = entrada.nextInt();
                System.out.println("Introduzca el segundo número: ");
                num2 = entrada.nextInt();
                double div = num1 / num2;
                System.out.println("El resultado de la división de " +  num1 + " y " + num2 + " es " + div);
                break;
            case 5:
                System.out.print("Introduzca la base: ");
                num1 = entrada.nextInt();
                System.out.println("Introduzca el exponente: ");
                num2 = entrada.nextInt();
                double pot = Math.pow(num1, num2);
                System.out.println("El resultado de " +  num1 + " elevado a " + num2 + " es " + pot);
                break;
            case 6:
                double factorial = 1;
                System.out.print("Introduzca el número al que hacerle el factorial: ");
                num1 = entrada.nextDouble();
                while (num1 != 0) {
                    factorial = factorial * num1;
                    num1--;
                }
                System.out.println("El resultado del factorial del número introducido es " + factorial);
                break;
            case 7:
                break;
        }
    }
}