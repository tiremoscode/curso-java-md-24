package practicas.pokemon.Karla_keb;

class PokemonHada extends Pokemon implements Elemento {
    public PokemonHada(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Hada";
    }

    @Override
    public int getEdad() {
        return 20;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " guardia mágica!");
    }
}
