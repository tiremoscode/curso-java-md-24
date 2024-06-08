package sos_repaso;

public class IterativasWhile {
    public static void main(String args[]) {
        // While
        int x = 0;

        while (x < 5) {
            System.out.println("El valor de y es " + x);
            x++; // Incremento a la variable y para evitar un bucle infinito.
        }

        // Nuria
        // Japón
        // 60,000 pesitos
        // hoy tienes 5000 pesos
        // Yo tengo capaciudad de ahorrar $1000 pesos a la quincena.

        double ahorro = 5000.00;
        double metaAhorro = 60000.00;

        // Simulación de depositos para alcanzar su objetivo.

        while (ahorro < metaAhorro) {
            System.out.println("Saldo actual: $ " + ahorro);
            System.out.println("Deposito cada quincena $ 1000.00...");
            ahorro += 1000.00;
        }

        System.out.println("¡Objetivo logrado, me voy a Japón porque tengo $:" + ahorro);

    }
}
