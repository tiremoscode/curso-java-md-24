package practicas.pokemon.DafneRamos;

public class Pokedex {
    public static void main(String[] args){
        PokemonDragon dragonite = new PokemonDragon(nombre:"Dragonite",nivel:55,edad:20);
        PokemonVolador Altaria = new PokemonVolador(nombre:"Altaria", nivel:35,edad:15);
        PokemonPsiquico Alakazam = new PokemonPsiquico(nombre:"Alakazam",nivel:20,edad:25);
    
        dragonite.atacar();
        altaria.atacar();
        alakazam.atacar();

    }
   
}
