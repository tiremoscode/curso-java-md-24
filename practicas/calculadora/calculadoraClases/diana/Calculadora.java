package practicas.calculadora.calculadoraClases.diana;

public class Calculadora {
    public static void main(String[] args) {
        double num1 = 15.2;
        double num2 = 8.5;

        Operaciones ope = new Operaciones ();
        System.out.println("Suma de " + num1 + "+" + num2 + "es igual a :"  + ope.sumar(num1, num2));
        System.out.println("Resta de " + num1 + "+" + num2 + "es igual a :"  + ope.restar(num1, num2));
        System.out.println("Multiplicacion de " + num1 + "+" + num2 + "es igual a :"  + ope.multiplicar(num1, num2));
        System.out.println(" Division de " + num1 + "+" + num2 + "es igual a :"  + ope.dividir(num1, num2));
    }
    
}
