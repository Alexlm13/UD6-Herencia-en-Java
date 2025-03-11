package relacion11.ejercicio7;

public class Coche extends Vehiculo {
    private String marca;

    public Coche(String marca){
        super();
        this.marca=marca;
    }

    void andarCoche(){
        System.out.println("El coche está avanzando");
    }

    void quemarRuedaCoche(){
        System.out.println("El coche está quemando rueda");
    }

    @Override
    public void hacerRuido(){
        System.out.println("El coche hace ruido");
    }
}
