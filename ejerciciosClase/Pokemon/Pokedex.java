package ejerciciosClase.Pokemon;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15, 0);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15, 9.0);

        charmander.atacar();
        squirtle.atacar();

        /// Obtener el peso de unicamente
        // los pokemon de tipo agua.
        System.out.println("El peso de mi squirtle es" + squirtle.getPeso());
        System.out.println("El peso de Charmander es " + charmander.getPeso());
    }
}