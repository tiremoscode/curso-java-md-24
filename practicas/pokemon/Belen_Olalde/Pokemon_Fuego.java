package practicas.pokemon.Belen_Olalde;

class Pokemon_Fuego extends Pokemon implements Elemento {
    public Pokemon_Fuego(String nombre, int nivel, int edad) {
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
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " lanza una llama!");
    }
}
