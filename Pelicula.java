class Pelicula {
    public String titulo;
    public int precio;
    public String nombreSala;

    // Constructor
    public Pelicula(String titulo, int precio, String nombreSala) {
        this.titulo = titulo;
        this.precio = precio;
        this.nombreSala = nombreSala;
    }

    // get - Getter
    // set - Setter

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void mostrarInfoCine() {
        System.out.println(
                "Pelicula " + getTitulo() + " Precio " + getPrecio() + " Nombre de la sala " + getNombreSala());
    }
}
