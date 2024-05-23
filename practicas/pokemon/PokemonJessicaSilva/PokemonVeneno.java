package practicas.pokemon.PokemonJessicaSilva;

public class PokemonVeneno extends Pokemon implements Elemento {
    public PokemonVeneno (String nombre, int nivel, int edad){
        super (nombre,nivel,edad);
    }
    @Override
    public String getElementType(){
        return "Veneno";
    }    

    @Override
    public int getEdad () {
        return 25;

    }
    @Override 
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + "Envenenar a los enemigos con su aguijón.!");
    }
}