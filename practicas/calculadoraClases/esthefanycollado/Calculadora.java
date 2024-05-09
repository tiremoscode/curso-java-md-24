package practicas.calculadoraClases.EsthefanyCollado;

public class Calculadora {
    public static void main(String args[]) {

        // Variables donde haré el calculo.

        double num1 = 10.5;
        double num2 = 6.2;

        System.out.println("Primer numero" + num1);
        System.out.println("Segundo numero " + num2);

        Operaciones ope = new Operaciones();
        // Suma
        System.out.println("La suma de " + num1 + " +  " + num2 + " = " + ope.sumar(num1, num2));
        System.out.println("La resta de " + num1 + " -  " + num2 + " = " + ope.restar(num1, num2));
        System.out.println("La multiplicación de " + num1 + " *  " + num2 + " = " + ope.multiplicacion(num1, num2));
        System.out.println("La división de " + num1 + " /  " + num2 + " = " + ope.dividir(num1, num2));
}
}