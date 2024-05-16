package practicas.pokemon.AbigailTolentino;

    public class PokemonElectrico extends Pokemon implements Elemento {
        public PokemonElectrico(String nombre, int nivel, int edad) {
            super(nombre, nivel, edad);
        }
    
        @Override
        public String getElementType() {
            return "Electrico";
        }

        @Override
        public int getNivel() {
            return 70;
        }
        @Override
        public int getEdad() {
            return 14;
        }
    
        @Override
        public void atacar() {
            super.atacar();
            System.out.println(getNombre() + " ¡Lanza un rayo!");
        }
    }

