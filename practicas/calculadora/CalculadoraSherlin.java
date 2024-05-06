package practicas.calculadora;

import java.util.Scanner;

public class CalculadoraSherlin {
    public static void main(String[] args) {
        int num1;
        int num2; 
        Scanner src = new Scanner (System.in);

        System.out.println("Ingresa primer numero");
        num1=src.nextInt();
        System.out.println("Ingresa segundo numero");
        num2=src.nextInt();

        int suma=num1+num2;

        System.out.println("La suma de los dos numeros es " + suma);

        int resta=num1-num2;
        System.out.println("La resta de los dos numeros es " + resta);

        int multiplicacion=num1*num2;
        System.out.println("La multiplicacion de los dos numeros es " + multiplicacion);

        float division=(float)num1/num2;
        System.out.println("La division de los dos numeros es " + division);
    }
}
