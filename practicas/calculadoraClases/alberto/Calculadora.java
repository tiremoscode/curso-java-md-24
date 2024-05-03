package practicas.calculadoraClases.alberto;

public class Calculadora {

    public static void main(String args[]) {
        // Variables donde haré el calculo.
        int numero1 = 20;
        int numero2 = 15;

        Operaciones ope = new Operaciones();
        // Suma
        System.out.println("Suma de " + numero1 + " +  " + numero2 + " es igual a " + ope.sumar(numero1, numero2));

    }
}