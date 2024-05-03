public class Cine {
    public static void main(String[] args) {
        // Crear un listado de películas
        // disponibles con el costo por oleto, la película disponible
        // y en que sala la puedo visualizar.

        Pelicula[] listado = {
                new Pelicula("Garfield", 60, "Sala 1"),
                new Pelicula("Harry Potter", 90, "Sala 2"),
                new Pelicula("Kung Fu Panda", 45, "Sala 3")
        };

        // Recorrer información de la pelicula;
        // For Each
        /*
         * for (Pelicula pelicula : listado) {
         * pelicula.mostrarInfoCine();
         * }
         */

        // for tradicional
        for (int p = 0; p < listado.length; p++) {
            listado[p].mostrarInfoCine();
        }
    }
}

// Otra clase
