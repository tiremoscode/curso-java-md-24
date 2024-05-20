package practicas.pokemon.gabriela_marquez;

class PokemonElectrico extends Pokemon implements Elemento {
    public PokemonElectrico(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Electricidad";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " con edad " + getEdad() + " y con nivel de ataque " + getNivel() + " lanza un rayo de electricidad.");
    }
}
