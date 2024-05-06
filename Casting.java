
import java.util.Scanner;
import java.util.InputMismatchException;

public class Casting {
    public static void main(String[] args) {
        // Casting
        // Cambiar el tipo de dato a una variable
        // asignada previamente.

        // Try y Catch

        int numeroEntero = 22;
        double numeroDouble = numeroEntero;

        // Imprimir los 2 valores para verificar la conversión de datos.
        System.out.println("Valor entero: " + numeroEntero);
        System.out.println("Valor double: " + numeroDouble);

        Scanner sca = new Scanner(System.in);

        try {
            System.out.println("Ingresa un numero entero: ");
            int num1 = sca.nextInt();

            System.out.println("Ingrea otro número entero: ");
            int num2 = sca.nextInt();

            int suma = num1 + num2;
            System.out.println("Suma es igual a " + suma);

            float division = (float) num1 / num2;
            System.out.println("Division es igual a " + division);

            double divDouble = (double) num1 / num2;
            System.out.println("Division es igual a " + divDouble);

            System.out.println("Dame tu edad");
            int edad = sca.nextInt();

            System.out.println("Edad " + edad);

        } catch (InputMismatchException e) {
            System.out.println("Se ha introducido un valor no númerico o entero");
        } finally {
            sca.close();
        }
    }
}
