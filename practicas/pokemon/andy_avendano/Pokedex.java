package practicas.pokemon.andy_avendano;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15);
        PokemonElectrico emolga = new PokemonElectrico("Emolga", 30, 15);
        PokemonHada jigglypuff = new PokemonHada("Jigglypuff", 20, 10);

        charmander.atacar();
        squirtle.atacar();
        emolga.atacar();
        jigglypuff.atacar();
    }
}
