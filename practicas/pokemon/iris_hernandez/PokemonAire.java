package practicas.pokemon.iris_hernandez;

class PokemonAire extends Pokemon implements Elemento {
    public PokemonAire(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Aire";
    }

    @Override
    public int getEdad() {
        return 17;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza tornado!");
    }

}
