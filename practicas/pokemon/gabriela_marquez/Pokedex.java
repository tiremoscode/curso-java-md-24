package practicas.pokemon.gabriela_marquez;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 100, 25);
        PokemonElectrico raikou = new PokemonElectrico("Raikou", 243, 20);
        PokemonVenenoso gengar = new PokemonVenenoso("Gengar", 95, 22);

        charmander.atacar();
        //squirtle.atacar();
        //pikachu.atacar();
        //raikou.atacar();
        //gengar.atacar();
    }
    
}
