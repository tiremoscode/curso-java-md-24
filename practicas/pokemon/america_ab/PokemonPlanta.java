package practicas.pokemon.america_ab;

class PokemonPlanta extends Pokemon implements Elemento {
    public PokemonPlanta(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Planta";
    }

    @Override
    public int getEdad() {
        return 20;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza una hoja afilada!");
    }
}
