package practicas.pokemon.AbigailTolentino;

public class Pokedex {
        public static void main(String[] args) {

                PokemonFuego Charmander = new PokemonFuego("Charmander", 50, 15);
                PokemonAgua Squirtle = new PokemonAgua("Squirtle", 50, 15);
                PokemonElectrico Zapdos = new PokemonElectrico("Zapdos", 70, 14);
                PokemonRoca Onix = new PokemonRoca("Onix", 10, 2);
                PokemonPsiquico Kadabra = new PokemonPsiquico("Kadabra", 10, 36);

                System.out.println("El Pokemon " + Charmander.getNombre() + " tiene " + Charmander.getEdad()
                                + " años y su nivel actual es " + Charmander.getNivel());
                Charmander.atacar();

                System.out.println("El Pokemon " + Squirtle.getNombre() + " tiene " + Squirtle.getEdad()
                                + " años y su nivel actual es " + Squirtle.getNivel());
                Squirtle.atacar();

                System.out.println("El Pokemon " + Zapdos.getNombre() + " tiene " + Zapdos.getEdad()
                                + " años y su nivel actual es " + Zapdos.getNivel());
                Zapdos.atacar();

                System.out.println("El Pokemon " + Onix.getNombre() + " tiene " + Onix.getEdad()
                                + " años y su nivel actual es "
                                + Onix.getNivel());
                Onix.atacar();

                System.out.println("El Pokemon " + Kadabra.getNombre() + " tiene " + Kadabra.getEdad()
                                + " años y su nivel actual es "
                                + Kadabra.getNivel());
                Kadabra.atacar();
        }
}
