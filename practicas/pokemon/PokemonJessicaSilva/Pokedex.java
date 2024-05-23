package practicas.pokemon.PokemonJessicaSilva;

   public class Pokedex {
    public static void main (String[]args){
        PokemonFuego slugma = new PokemonFuego("slugma", 50, 15);
        PokemonAgua remoraid = new PokemonAgua("remoraid,",60, 15);
        PokemonVeneno kakuna = new PokemonVeneno("kakuna,",100, 25);
        PokemonBicho butterfly = new PokemonBicho("butterfly,",50, 35);
        PokemonPlanta lvynsaur = new PokemonPlanta("lvtnsaur,",100, 15);

        slugma.atacar();
        remoraid.atacar();
        
        

    }
  
    
}
