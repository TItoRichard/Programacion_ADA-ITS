import Persona;
public class PruebaPOO {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Paco Pérez Gandía";
        persona.edad = 17;
        persona.altura = 1.75f;
        persona.dni = "48969254J";
        persona.EsMayorEdad();
    }
}