public class Array1 {
    public static void main(String[] args) {
        int [] array = new int [4];
        int [] array2 = {1,2,3,4,5};
        int lng = 0;
        lng = longitud(array);
        System.out.println(lng);
        mostrar(array2);
    }

    public static int longitud (int[] array) {
        return array.length;
    }

    public static void mostrar (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}