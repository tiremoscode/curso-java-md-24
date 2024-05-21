package practicas.pokemon.america_ab;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15);
        PokemonFantasma gengar = new PokemonFantasma("Gengar", 50, 15);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 50, 15);



        charmander.atacar();
        squirtle.atacar();
        gengar.atacar();
        bulbasaur.atacar();

    }
}
