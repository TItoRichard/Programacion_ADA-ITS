public class CondicionalIf {
    public static void main (String[] args) {
        char variable = '1';

        if(variable >= 'a' && variable <= 'z') {
            System.out.println("Es un caracter válido");
        }
        else {
            System.out.println("No es un caracter válido");
        }
    }
}