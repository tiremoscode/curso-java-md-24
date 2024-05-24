class SaldosInsuficientesException extends Exception {
    public SaldosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void retiro(double monto) throws SaldosInsuficientesException {
        if (saldo < monto) {
            throw new SaldosInsuficientesException("Saldo insuficiente para retirar");
        }
        saldo -= monto;
    }

}

public class Excepciones {
    public static void main(String args[]) {
        // Excepciones

        // Maneja de manejar situaciones inesperadas que ocurren durante
        // la ejecución de un programa.
        
        // Tipos de Excepciones en Java.
        // Checked Exceptions - IOException o SQException.

        // Unchecked exceptions (Excepciones no verificadas).
        // Durante la ejecución y no son verificadas en tiempo de compilación.
        // NullPointerException o ArrayIndexOutOfBoundsException.


        // Cuenta con 1000 pesos de saldo inicial.
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        try {
            System.out.println("Intentando retiurar 200");
            cuenta.retiro(200);
            System.out.println("REtiro exitoso. Saldo restante: " + cuenta.obtenerSaldo());

            System.out.println("Intentando retirar 300");
            cuenta.retiro(300);
            System.out.println("Que saldo tengo " + cuenta.obtenerSaldo());

            System.out.println("Intentando retirar 600");
            cuenta.retiro(600);

        } catch (SaldosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
