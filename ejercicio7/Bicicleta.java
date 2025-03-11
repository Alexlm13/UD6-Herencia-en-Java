package relacion11.ejercicio7;

public class Bicicleta extends Vehiculo{
    private String tipo;

    public Bicicleta(String tipo){
        super();
        this.tipo=tipo;
    }

    void andarBicicleta(){
        System.out.println("La bicicleta está avanzando");
    };

    void hacerCaballitoBicicleta(){
        System.out.println("La bicicleta está haciendo el caballito");
    }

    @Override
    public void hacerRuido() {       
        System.out.println("La bicicleta hace ruido");
    }
}
