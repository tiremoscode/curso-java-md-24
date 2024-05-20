package ejerciciosClase.Pokemon;

class PokemonFuego extends Pokemon implements Elemento {
    public PokemonFuego(String nombre, int nivel, int edad, double peso) {
        super(nombre, nivel, edad, peso);
    }

    public double checkPeso = getPeso();

    @Override
    public String getElementType() {
        return "Fuego";
    }

    @Override
    public int getEdad() {
        return 20;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza una llama!");
    }

    @Override
    public double getPeso() {
        if (checkPeso != 0) {
            return checkPeso;
        } else {
            return 100;
        }
    }
}
