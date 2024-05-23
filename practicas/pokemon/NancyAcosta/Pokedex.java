package practicas.pokemon.NancyAcosta;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 40, 15);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 35, 18);
        PokemonVolador pidgey = new PokemonVolador("Pidgey", 50, 20);
        PokemonTierra geodude = new PokemonTierra("Geodude", 80, 25);

        charmander.atacar();
        squirtle.atacar();
        pidgey.atacar();
        geodude.atacar();
    }

}
