package relacion11.ejercicio1;

public class TestPersona {
    public static void main(String[] args) {
        Persona persona1=new Persona();
        Persona persona2=new Persona("12345678A", 200, 28);

        System.out.println("Los datos de la primera persona son: ");
        System.out.println(persona1);

        System.out.println("Los datos de la segunda persona son: ");
        System.out.println(persona2);
    }
}
