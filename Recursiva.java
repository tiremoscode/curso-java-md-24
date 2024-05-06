import java.util.Scanner;

public class Recursiva{
    public static void main(String[] args) {

        Scanner sca = new Scanner(System.in);

        System.out.println("Ingresa el número que generaremos el factorial");
        int numeroFactorial = sca.nextInt();

        int resultado = factorial(numeroFactorial);
        System.out.println("El número factorial de "+numeroFactorial +  " es " + resultado);

        sca.close();
    }

    // Calculo de un número factorial
    // Tomamos el valor inicial 
    // y este se multiplicará
    // hacía los números inferiores
    // en un orden descendente.

    // Ejemplo. Número factorial de 5
    // 5 x 4 x 3 x 2 x 1
    // 20 x 3 x 2 x 1
    // 60 x 2 x 1
    // 120 x 1
    // 120

    // El número factorial de 1

    public static int factorial(int n){
        // añadimos caso base
        if (n == 0 || n == 1){
            System.out.println("Aqui");
            return 1;
        }
        // caso recursivo
        else {
            System.out.println("aca");
            return n * factorial(n-1);
        }
    }

}