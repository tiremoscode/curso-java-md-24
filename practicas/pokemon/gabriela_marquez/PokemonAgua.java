package practicas.pokemon.gabriela_marquez;

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
        System.out.println(getNombre() + " con edad " + getEdad() + " y con nivel de ataque " + getNivel() + " lanza un chorro de agua!");
    }
}
