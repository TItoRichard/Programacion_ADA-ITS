public class Persona {

    //Variables
    public String nombre;
    public int edad;
    public float altura;
    public String dni;

    //Metodos
    public boolean EsMayorEdad () {
        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
            return true;
        } else {
            System.out.println("No es mayor de edad.");
            return false;
        }
    }

    public boolean dniValido () {
       
        return true;
    }
}