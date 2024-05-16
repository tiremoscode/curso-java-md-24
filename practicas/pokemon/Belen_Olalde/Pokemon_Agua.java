package practicas.pokemon.Belen_Olalde;

class Pokemon_Agua extends Pokemon implements Elemento {
    public Pokemon_Agua(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Agua";
    }

    @Override
    public int getEdad() {
        return 15;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza un chorro de agua!");
    }
}
