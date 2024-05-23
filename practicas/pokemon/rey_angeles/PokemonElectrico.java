package practicas.pokemon.rey_angeles;

class PokemonElectrico extends Pokemon implements Elemento {
    public Electrico(String nombre, int nivel, int edad, double peso) {
        super(nombre, nivel, edad, peso);
    }

    public double checkPeso = getPeso();

    @Override
    public String getElementType() {
        return "Electrico";
    }

    @Override
    public int getEdad() {
        return 20;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " ¡lanza rayo!");
    }
}
