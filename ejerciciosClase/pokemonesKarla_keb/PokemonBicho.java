package ejerciciosClase.pokemonesKarla_keb;


class PokemonBicho extends Pokemon implements Elemento {
    public PokemonBicho(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Bicho";
    }

    @Override
    public int getEdad() {
        return 20;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " polvo de escudo!");
    }
}

