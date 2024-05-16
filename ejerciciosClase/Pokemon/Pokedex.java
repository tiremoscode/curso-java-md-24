package ejerciciosClase.Pokemon;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15);
        PokemonElectrico emolga = new PokemonElectrico("Emolga", 30, 15);
        PokemonHada jigglypuff = new PokemonHada("Jigglypuff", 20, 10); 
        PokemonAcero lucario = new PokemonAcero("Lucario", 100, 200);

        charmander.atacar();
        squirtle.atacar();
        emolga.atacar();
        jigglypuff.atacar();
        lucario.atacar();
    }
}
