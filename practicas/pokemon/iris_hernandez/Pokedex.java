package practicas.pokemon.iris_hernandez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonAire corviknight = new PokemonAire("Corviknight", 50, 17);
        PokemonElectrico electrike = new PokemonElectrico("Electrike", 50, 25);
        PokemonElectrico luxray = new PokemonElectrico("Luxray", 49, 22);

        corviknight.atacar();
        electrike.atacar();
        luxray.atacar();
    }
}
