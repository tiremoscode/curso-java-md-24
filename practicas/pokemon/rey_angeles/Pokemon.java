package practicas.pokemon.rey_angeles;

interface Elemento {
    String getElementType();
}

class Pokemon {
    private String nombre;
    private int nivel;
    private int edad;
    private double peso;

    public Pokemon(String nombre, int nivel, int edad, double peso) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.edad = edad;
        this.peso = peso;
    }

    public void atacar() {
        System.out.println(nombre + " esta en ataque!");
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNivel() {
        return nivel;
    }
    public double getPeso(){
        return peso;
    }
}
