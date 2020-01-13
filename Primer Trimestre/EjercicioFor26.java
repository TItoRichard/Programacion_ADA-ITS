public class EjercicioFor26 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nTabla del " + i + "\n");
            for (int tabla = 1; tabla <= 10; tabla++) {
                System.out.println(i + " x " + tabla + " = " + i*tabla);
            }
        }
    }
}