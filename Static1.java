class MiClase {
    static int contador = 0;

    // Variables estaticas
    // Una variables estratica es cmpartida entre todas las instancias
    // de una sola clase.

    public MiClase() {
        contador++;
    }
}

public class Static1 {
    public static void main(String args[]) {
        MiClase obj1 = new MiClase();
        MiClase obj2 = new MiClase();
        MiClase obj3 = new MiClase();

        System.out.println("Valor del contador " + MiClase.contador);
    }
}
