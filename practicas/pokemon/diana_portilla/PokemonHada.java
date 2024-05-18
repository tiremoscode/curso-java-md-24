package practicas.pokemon.diana_portilla;

class PokemonHada extends Pokemon implements Elemento{
    public PokemonHada (String nombre, int nivel, int edad){
        super (nombre, nivel, edad);
    }

    @Override
    public String getElementType(){
        return "Hada";
    }

    @Override 
    public int getEdad(){
        return 25;
    }

    @Override
    public void atacar(){
        super.atacar();
        System.out.println(getNombre() + "Poder oculto + Brillo mágico");
    }
    }

