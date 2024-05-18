package esthefany.collado;

class PokemonTierra extends Pokemon implements Elemento {
    public PokemonTierra(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Tierra";
    }

    @Override
    public int getEdad() {
        return 15;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un huesomerang!");
    }
}
