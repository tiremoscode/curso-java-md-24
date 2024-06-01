package sos_repaso;

public class Objetos {

    // Propiedades
    private String nombre;
    private int edad;
    private String raza;
    private double peso;

    // Método constructor.
    public Objetos(String nombre, int edad, String raza, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
    }

    // ToDO - Explicar los Métodos Construcor Chaining ****

    // Métodos o comportamientos
    public void ladrar() {
        System.out.println("guau");
    }

    public void comer() {
        System.out.println("comer");
    }

    public void dormir() {
        System.out.println(nombre + " esta durmiendo");
    }

    // Getters y Setters

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setPeso() {
        this.peso = peso;
    }

    public static void main(String args[]) {
        Objetos perro = new Objetos("Laika", 3, "Labrador", 30);

        // Usar los métodos de esta clase.
        perro.ladrar();
        perro.comer();
        perro.dormir();

        // Imprimir la informacion del perro
        System.out.println("El nombre de mi nuevo perro es " + perro.getNombre());
        System.out.println("La raza de mi perro es " + perro.getRaza());
        // Podemos asignar nuevas propiedades
        perro.setNombre("Firulais");
        perro.setRaza("electrico");

        // Obtenemos el nombre del perrito
        System.out.println("El nuevo nombre es " + perro.getNombre());
        System.out.println("La nueva raza es " + perro.getRaza());

        // Manipulacion
        // A través de estos métodos
        // puedo convertir la informació
        // o manipularla de acuerdo a mis necesidades.

        String nuevaRaza = perro.getRaza().toUpperCase();
        System.out.println("La raza en mayúsculas es " + nuevaRaza);

        if (nuevaRaza.equals(nuevaRaza.toUpperCase())) {
            System.out.println("Entonces es un perro mestizo");
        } else {
            System.out.println("Es un perro de raza");
        }

        String frase = "OlA quE HazE";
        String mayusculas = frase.toUpperCase();
        String minusculas = frase.toLowerCase();

        System.out.println("frase 1 " + frase);
        System.out.println("frase 2 " + mayusculas);
        System.out.println("frase 3 " + minusculas);
    }

}
