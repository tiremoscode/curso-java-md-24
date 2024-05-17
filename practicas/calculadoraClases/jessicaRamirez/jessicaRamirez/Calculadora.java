package calculadoraClases.jessicaRamirez.jessicaRamirez;

public class Calculadora {
    public static void main(String args[]) {
        // Variables donde haré el calculo.
        double numero1 = 20.8;
        double numero2 = 10.4;

        Operaciones ope = new Operaciones();
        
        // Suma
        System.out.println("Suma de " + numero1 + " +  " + numero2 + " es igual a " + ope.sumar(numero1, numero2));

        // Resta
        System.out.println("Resta de " + numero1 + " -  " + numero2 + " es igual a " + ope.restar(numero1, numero2));

        //Multiplicacion
        System.out.println("Multiplicacion de " + numero1 + " *  " + numero2 + " es igual a " + ope.multiplicar(numero1, numero2));

        //Division
        System.out.println("Division de " + numero1 + " /  " + numero2 + " es igual a " + ope.dividir(numero1, numero2));


    } 
}

