package practicas.pokemon.Belen_Olalde;

public class Pokedex {
    public static void main(String[] args) {
        Pokemon_Fuego charmander = new Pokemon_Fuego("Charmander", 50, 15);
        System.out.println(charmander.getNombre() + " tiene " + charmander.getEdad() + " años"
            + " y su nivel es de " + charmander.getNivel() + ".");

        Pokemon_Agua squirtle = new Pokemon_Agua("Squirtle", 50, 15);
        System.out.println(squirtle.getNombre() + " tiene " + squirtle.getEdad() + " años"
            + " y su nivel es de " + squirtle.getNivel() + ".");

        Pokemon_Planta grookey = new Pokemon_Planta("Grookey", 10, 12);
        System.out.println(grookey.getNombre() + " tiene " + grookey.getEdad() + " años"
            + " y su nivel es de " + grookey.getNivel() + ".");

        Pokemon_Psiquico alakazam = new Pokemon_Psiquico("Alakazam", 30, 20);
        System.out.println(alakazam.getNombre() + " tiene " + alakazam.getEdad() + " años"
            + " y su nivel es de " + alakazam.getNivel() + ".");

        Pokemon_Planta bulbasaur = new Pokemon_Planta("Bulbasaur", 20, 14);
        System.out.println(bulbasaur.getNombre() + " tiene " + bulbasaur.getEdad() + " años"
            + " y su nivel es de " + bulbasaur.getNivel() + ".");

        /*System.out.println("\nAtaquen!\n");
        grookey.atacar();
        System.out.println("\n");
        alakazam.atacar();
        System.out.println("\n");
        bulbasaur.atacar();*/
    }
}
