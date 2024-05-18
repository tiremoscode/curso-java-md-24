package pokemon.VeronicaSalinas;

public class PokemonElectrico extends Pokemon implements Elemento {

    public PokemonElectrico (String nombre, int nivel, int edad) {
        super (nombre,nivel,edad);

    }

    @Override
    public String getElementType() {
        return "Electrico";

    }

    @Override
    public int getEdad() {
        return 1;
    }

    @Override
    public int getNivel() {
        return 111;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza hipertrueno");
    }
    
}
