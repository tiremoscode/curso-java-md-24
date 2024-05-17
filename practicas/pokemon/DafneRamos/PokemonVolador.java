package practicas.pokemon.DafneRamos;

class PokemonVolador extends Pokemon implements Elemento {
    public PokemonVolador(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Volador";
    }

    @Override
    public int getEdad() {
        return 15;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " Ataque aereo!");
    }
    
}