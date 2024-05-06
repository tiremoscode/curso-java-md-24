
public class Calculadora {

    public static void main(String args[]) {
        // Variables donde haré el calculo.
        double numero1 = 20.8;
        double numero2 = 15.5;

        Operaciones ope = new Operaciones();
        // Suma
        System.out.println("La suma de " + numero1 + " +  " + numero2 + " es igual a " + ope.sumar(numero1, numero2));

        // Resta
        System.out.println("La resta de " + numero1 + " -  " + numero2 + " es igual a " + ope.restar(numero1, numero2));

        // Multiplicación
        System.out.println("La multiplicación de " + numero1 + " *  " + numero2 + " es igual a " + ope.multiplicar(numero1, numero2));

        // División
        System.out.println("La división de " + numero1 + " /  " + numero2 + " es igual a " + ope.dividir(numero1, numero2));



    }
}
