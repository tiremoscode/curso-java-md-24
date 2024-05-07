public class Objetos {
    public static void main(String[] args) {
        // Objetos
        // Estado - Representado por atriutiso o propiedades
        // Comportamiento
        // Identidad - Un identificador unico que distinguir a cada objeto

        // Creación de objetos de la clase Auto
        Auto miauto = new Auto("rojo", "Toyota ", 2024);
        Auto tuAuto = new Auto("negro", "Honda", 2022);

        // Mandando llamar a diferentes métodos creados.
        miauto.acelerar();
        tuAuto.frenar();
    }
}

class Auto {
    // Atributos
    String color;
    String marca;
    int modelo;

    public Auto(String color, String marca, int modelo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para acelerar
    public void acelerar() {
        System.out.println(marca + " acelera el coche");
    }

    // Método para frenar
    public void frenar() {
        System.out.println(marca + " frena el coche");
    }
}