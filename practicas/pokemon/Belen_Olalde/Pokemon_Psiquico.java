package practicas.pokemon.Belen_Olalde;

public class Pokemon_Psiquico extends Pokemon implements Elemento {
    public Pokemon_Psiquico(String nombre, int nivel, int edad) {
        super(nombre, nivel, edad);
    }

    public String getElementType() {
        return "Psquico";
    }

    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + " cancelar poder!");
    }
}
