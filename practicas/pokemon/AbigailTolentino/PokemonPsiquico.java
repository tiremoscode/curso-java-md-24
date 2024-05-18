package practicas.pokemon.AbigailTolentino;


    public class PokemonPsiquico extends Pokemon implements Elemento {
        public PokemonPsiquico(String nombre, int nivel, int edad) {
            super(nombre, nivel, edad);
        }
    
        @Override
        public String getElementType() {
            return "Psiquico";
        }

        @Override
        public int getNivel() {
            return 35;
        }
        @Override
        public int getEdad() {
            return 10;
        }
    
        @Override
        public void atacar() {
            super.atacar();
            System.out.println(getNombre() + " ¡Lanza confisión!");
        }
    }
