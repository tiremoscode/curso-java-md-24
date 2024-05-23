package practicas.pokemon.NancyAcosta;

class PokemonVolador extends Pokemon implements Elemento {
    public PokemonVolador(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Volador";
    }


    @Override
    public void atacar() {
        super.atacar();
        System.out.println("Edad " + getEdad() + " y nivel de ataque " + getNivel() + " Lanza una ráfaga de arena!");
    }

}
