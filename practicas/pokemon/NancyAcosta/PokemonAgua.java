package practicas.pokemon.NancyAcosta;

class PokemonAgua extends Pokemon implements Elemento {
    public PokemonAgua(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Agua";
    }

   
    @Override
    public void atacar() {
        super.atacar();
        System.out.println("Edad " + getEdad() + " y nivel de ataque " + getNivel() + " Lanza un chorro de agua!");
    }

}