package practicas.pokemon.rey_angeles;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15, 8.5);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15, 9.0);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 50, 12, 6.0);
        PokemonPlanta bulbasaur = new PokemonPlanta("Bulbasaur", 50, 15, 7.0);

        charmander.atacar();
        squirtle.atacar();
        pikachu.atacar();
        bulbasaur.atacar();

        // Obtener el peso de los pokemon
        System.out.println("El peso de mi Squirtle es " + squirtle.getPeso());
        System.out.println("El peso de Charmander es " + charmander.getPeso());
        System.out.println("El peso de Pikachu es " + pikachu.getPeso());
        System.out.println("El peso de Bulbasaur es " + bulbasaur.getPeso());
    }
}
