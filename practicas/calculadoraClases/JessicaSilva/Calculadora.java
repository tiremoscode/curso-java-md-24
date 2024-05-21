package calculadora.calculadoraClases.JessicaSilva;

public class Calculadora {
    public static void main(String[] args) {

        //Variables donde are el calculo

        double num1 = 25.9;
        double num2 = 17.8;

        System.out.println("Primer numero" +num1);
        System.out.println("Segundo numero" +num2);

        Operaciones ope = new Operaciones();
        //suma
        System.out.println("La suma de " + num1 + " +  " + num2 + " = " + ope.sumar(num1, num2));
        System.out.println("La resta de " + num1 + " -  " + num2 + " = " + ope.restar(num1, num2));
        System.out.println("La multiplicación de " + num1 + " *  " + num2 + " = " + ope.multiplicacion(num1, num2));
        System.out.println("La división de " + num1 + " /  " + num2 + " = " + ope.dividir(num1, num2));

}
}
