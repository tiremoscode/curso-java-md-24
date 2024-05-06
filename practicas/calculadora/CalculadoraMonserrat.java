package practicas.calculadora;

import java.util.Scanner;

public class CalculadoraMonserrat {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Primero, solicitamos que el usuario ingrese dos numeros
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            // Ahora solicitamos la operación que el usuario desee realizar
            System.out.println("Seleccione la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");

            int opcion = scanner.nextInt();

            double resultado = 0;

            // Realizar la operación seleccionada con una estructura switch-case
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("No se puede dividir por cero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    return;
            }

            // Imprimimos el resultado en la terminal :)
            System.out.println("El resultado es: " + resultado);
        }
    }
}
