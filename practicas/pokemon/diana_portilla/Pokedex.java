package practicas.pokemon.diana_portilla;

public class Pokedex {
    public static void main(String[] args) {

        //Pokemon Hada
        PokemonHada togepi = new PokemonHada("Togepi", 50, 23);
        PokemonHada jigglypuff = new PokemonHada("jigglypuff", 80, 25);
        PokemonHada clefairy = new PokemonHada("Clefairy", 40, 20);
     
        togepi.atacar();
        jigglypuff.atacar();
        clefairy.atacar();

       //Pokemon Psiquico
       PokemonPlanta leafeon= new PokemonPlanta ("Lefaeon", 70, 33);
       PokemonPlanta cacturne = new PokemonPlanta ("Cacturne", 60, 28);
       PokemonPlanta torterra = new PokemonPlanta ("Torterra", 80, 24);
     
       leafeon.atacar();
       cacturne.atacar();
       torterra.atacar();

    }
}
