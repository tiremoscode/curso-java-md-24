package practicas.pokemon.Karla_keb;
    
    class PokemonVeneno extends Pokemon implements Elemento {
        public PokemonVeneno(String nombre, int nivel, int edad) {
            super(nombre, nivel, edad);
        }
    
        @Override
        public String getElementType() {
            return "Veneno";
        }
    
        @Override
        public int getEdad() {
            return 20;
        }
    
        @Override
        public void atacar() {
            super.atacar();
            System.out.println(getNombre() + " Intimida!");
        }
    }

