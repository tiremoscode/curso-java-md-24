package pokemon.lourdes.lourdes;

class PokemonElectrico extends Pokemon implements Elemento {
    public PokemonElectrico(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Electrico";
    }

    @Override
    public int getEdad() {
        return 25;
    }


    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un rayo!");
    }



}
