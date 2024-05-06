package practicas.calculadoraClases.Calculadora_Belen;

public class Calculadora {

    public static void main(String args[]) {
        // Variables:
        double numero1 = 28.8, numero2 = 7.7;

        // Objeto:
        Operaciones op = new Operaciones();

        // Suma
        System.out.println("Suma de " + numero1 + " + " + numero2 + " es igual a " + op.sumar(numero1, numero2));

        // Resta
        System.out.println("Resta de " + numero1 + " - " + numero2 + " es igual a " + op.restar(numero1, numero2));

        // Multiplicación
        System.out.println("Multiplicación de " + numero1 + " * " + numero2 + " es igual a " + op.multiplicar(numero1, numero2));

        // División
        System.out.println("División " + numero1 + " / " + numero2 + " es igual a " + op.dividir(numero1, numero2));
    }
}
