public class EjercicioFor11 {
    public static void main (String[] args) {
        long product=1;
        for (int i = 1; i < 20; i += 2) {
            product = product * i;
        }
        System.out.println("El producto de los 10 primeros impares es igual a " + product);
    }
}