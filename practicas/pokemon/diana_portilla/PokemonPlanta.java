package practicas.pokemon.diana_portilla;

class PokemonPlanta extends Pokemon implements Elemento{
    public PokemonPlanta (String nombre, int nivel, int edad){
        super (nombre, nivel, edad);
    }

    @Override
    public String getElementType(){
        return "Planta";
    }

    @Override 
    public int getEdad(){
        return 27;
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + " Llueve hojas + látigo cepa");
    }
    }
