package practicas.pokemon.gabriela_marquez;

class PokemonVenenoso extends Pokemon implements Elemento {
    public PokemonVenenoso(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Veneno";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " con edad " + getEdad() + " y con nivel de ataque " + getNivel() + "  lanza veneno.");
    }
}
