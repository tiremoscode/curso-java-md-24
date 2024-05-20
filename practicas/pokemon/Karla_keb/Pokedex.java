package practicas.pokemon.Karla_keb;

public class Pokedex {
public static void main(String[] args) {
    PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15);
    PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15);
    PokemonVeneno ekans = new PokemonVeneno("Ekans" , 70, 20); 
    PokemonHada clefairy = new PokemonHada("Clefairy", 60, 10); 
    PokemonBicho caterpie = new PokemonBicho("Caterpie", 50, 20);

    charmander.atacar();
    squirtle.atacar();
    ekans.atacar();
    clefairy.atacar(); 
    caterpie.atacar();
}
}