interface Vehiculo {
    void arrancar();

    void acelerar();
}

class Moto implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Arrancando la moto");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando la moto");
    }
}

class Camion implements Vehiculo {
    @Override
    public void arrancar() {
        System.out.println("Arrancando el camión");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el camión");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        // Implementando Interfaces
        // Moto moto = new Moto();
        // Camion camion = new Camion();

        // Haciendolo con Polimorfismo
        Vehiculo moto = new Moto();
        Vehiculo camion = new Camion();

        moto.arrancar();
        moto.acelerar();

        camion.arrancar();
        camion.acelerar();
    }
}
