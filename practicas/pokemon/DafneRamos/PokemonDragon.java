package practicas.pokemon.DafneRamos;

class PokemonDragon extends Pokemon implements Elemento {
    public PokemonDragon(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Dragon";
    }

    @Override
    public int getEdad() {
        return 20;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Garra dragon!");
    }
    
}
