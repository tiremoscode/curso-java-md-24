package pokemon.jessica_ramirez;

class PokemonSiniestro extends Pokemon implements Elemento {
    public PokemonSiniestro(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Siniestro";
    }

    @Override
    public int getEdad() {
        return 5;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un pulso sombrío!");
    }
}