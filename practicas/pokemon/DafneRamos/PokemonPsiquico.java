package practicas.pokemon.DafneRamos;

public class PokemonPsiquico extends Pokemon implements Elemento {
    public PokemonPsiquico(String nombre, int nivel, int edad){
        super(nombre, nivel, edad);
    }

    @Override
    public String getElementType() {
        return "Psiquico";
    }

    @Override
    public int getEdad() {
        return 25;
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println(getNombre() + "Fuerza zen!");
    }
}
