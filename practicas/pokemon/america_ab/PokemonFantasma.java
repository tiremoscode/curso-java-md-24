package practicas.pokemon.america_ab;

class PokemonFantasma extends Pokemon implements Elemento {
    public PokemonFantasma(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Fantasma";
    }

    @Override
    public int getEdad() {
        return 15;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un bola sombra!");
    }
}
