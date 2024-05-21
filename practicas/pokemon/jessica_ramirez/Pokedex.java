package pokemon.jessica_ramirez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15);
        PokemonSiniestro umbreon = new PokemonSiniestro("Umbreon", 60, 5);
        PokemonSiniestro inkay = new PokemonSiniestro("Inkay", 60, 5);
        PokemonElectrico jolteon = new PokemonElectrico("Jolteon", 70, 10);
        PokemonElectrico helioptile = new PokemonElectrico("Helioptile", 80, 10);


        charmander.atacar();
        squirtle.atacar();
        umbreon.atacar();
        inkay.atacar();
        jolteon.atacar();
        helioptile.atacar();
    }
}
