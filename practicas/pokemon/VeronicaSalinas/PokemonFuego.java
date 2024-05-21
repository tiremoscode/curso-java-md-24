package pokemon.VeronicaSalinas;

class PokemonFuego extends Pokemon implements Elemento {
    
    public PokemonFuego(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Fuego";
    }

    @Override
    public int getEdad() {
        return 20;
    }

    @Override
    public int getNivel() {
        return 88;
    }


    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza una llama!");
    }
}
