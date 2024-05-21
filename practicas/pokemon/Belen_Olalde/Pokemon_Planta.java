package practicas.pokemon.Belen_Olalde;

public class Pokemon_Planta extends Pokemon implements Elemento {
    public Pokemon_Planta (String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Planta";
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " golpe de furia!");
    }
}
