package ejerciciosClase.Pokemon;

class PokemonAcero extends Pokemon implements Elemento {
    public PokemonAcero(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Acero";
    }

    @Override
    public int getEdad() {
        return 200;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un esfera aural!");
    }
}

