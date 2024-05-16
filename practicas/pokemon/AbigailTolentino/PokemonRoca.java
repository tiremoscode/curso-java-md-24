package practicas.pokemon.AbigailTolentino;

    public class PokemonRoca extends Pokemon implements Elemento {
        public PokemonRoca(String nombre, int nivel, int edad) {
            super(nombre, nivel, edad);
        }
    
        @Override
        public String getElementType() {
            return "Roca";
        }

        @Override
        public int getNivel() {
            return 10;
        }

        @Override
        public int getEdad() {
            return 2;
        }
    
        @Override
        public void atacar() {
            super.atacar();
            System.out.println(getNombre() + " ¡lanza cola ferrea!");
        }
    }

