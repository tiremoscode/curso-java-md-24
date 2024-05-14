package pokemon.VeronicaSalinas;

public class Pokedex {
    public static void main(String[] args) {
        PokemonFuego charmander = new PokemonFuego("Charmander", 50, 15);
        PokemonAgua squirtle = new PokemonAgua("Squirtle", 50, 15);
        PokemonBicho butterfree = new PokemonBicho("Butterfree", 10, 1);
        PokemonElectrico pikachu = new PokemonElectrico("Pikachu", 100, 100);
        PokemonElectrico raichu = new PokemonElectrico("Raichu", 10, 10);

        System.out.println("------------------------------------");
        charmander.atacar();
       int edadCharmarder = charmander.getEdad();
       int nivelCharmander = charmander.getNivel();
       System.out.println("la edad de charmander es: "+ edadCharmarder+" el nivel es: "+nivelCharmander);
       System.out.println("------------------------------------");
    
    
       squirtle.atacar();
       int edadSquirtle = squirtle.getEdad();
       int nivelSquirtle = squirtle.getNivel();
       System.out.println("la edad de Squirtle es: "+ edadSquirtle+" el nivel es: "+nivelSquirtle);
        System.out.println("------------------------------------");


       butterfree.atacar();
       int edadButterfree = butterfree.getEdad();
       int nivelButterfree = butterfree.getNivel();
       System.out.println("la edad de Butterfree es: "+ edadButterfree+" el nivel es: "+nivelButterfree);
        
       System.out.println("------------------------------------");
       pikachu.atacar();
       int edadPikachu = pikachu.getEdad();
       int nivelPikachu = pikachu.getNivel();
       System.out.println("la edad de Pikachu es: "+ edadPikachu+" el nivel es: "+nivelPikachu);


       System.out.println("------------------------------------");
       raichu.atacar();
       int edadRaichu = raichu.getEdad();
       int nivelRaichu = raichu.getNivel();
       System.out.println("la edad de Pikachu es: "+ edadRaichu +" el nivel es: "+nivelRaichu);



    }
}
