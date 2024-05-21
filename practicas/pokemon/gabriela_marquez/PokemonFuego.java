package practicas.pokemon.gabriela_marquez;

class PokemonFuego extends Pokemon implements Elemento {
    public PokemonFuego(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Fuego";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " con edad " + getEdad() + " y con nivel de ataque " + getNivel() + " lanza una llama!");
    }
}
