package practicas.pokemon.lourdes;

public class pokedex {
    public static void main(String[] args) {
        pokemonAgua corviknight = new PokemonAgua ("Corviknight", 50, 17);
        pokemonElectro electrike = new PokemonElectro("Electrike", 50, 25);
        pokemonElectro luxray = new pokemonElectro ();

        corviknight.atacar();
        electrike.atacar();
        luxray.atacar();
    }
}
