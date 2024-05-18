package esthefany.collado;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15);
        PokemonTierra cubone = new PokemonTierra("Cubone", 50, 30);
        PokemonVeneno ekans = new PokemonVeneno("Squirtle", 30, 10);

        charmander.atacar();
        squirtle.atacar();
        cubone.atacar();
        ekans.atacar();
    }
}
