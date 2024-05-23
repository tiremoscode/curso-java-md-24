package practicas.pokemon.NancyAcosta;

class PokemonTierra extends Pokemon implements Elemento {
    public PokemonTierra(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Tierra";
    }


    @Override
    public void atacar() {
        super.atacar();
        System.out.println("Edad " + getEdad() + " y nivel de ataque " + getNivel() + " Lanza una roca!");
    }

}
