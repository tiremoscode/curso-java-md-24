package practicas.pokemon.PokemonJessicaSilva;

public class PokemonBicho extends Pokemon implements Elemento {
    public PokemonBicho (String nombre, int nivel, int edad){
        super (nombre,nivel,edad);
    }
    @Override
    public String getElementType(){
        return "Bicho";
    }    

    @Override
    public int getEdad () {
        return 35;

    }
    @Override 
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + "lanza polen!");
    }

}
