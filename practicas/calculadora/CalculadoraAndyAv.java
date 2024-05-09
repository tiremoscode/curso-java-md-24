package practicas.calculadora;

import java.util.Scanner;

public class CalculadoraAndyAv {

     public static void main(String args []){
        //Variables donde haré el calculo. 
       Scanner scn = new Scanner(System.in);     
        //double n1;
        //double n2;
        // Suma
        System.out.println("Esta es una calculadora, introduzca dos digitos y despues seleccione una operación");
        System.out.println("Ingrese el primer numero");
        double n1 = scn.nextDouble();
        System.out.println("Ingrese el segundo numero");
        double n2 = scn.nextDouble();
        double suma = n1 + n2;

        System.out.println("Seleccione una operación:");
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        System.out.println("3.-Multiplicación");
        System.out.println("4.-División");
        int operacion = scn.nextInt();

        double resultado = 0;
        switch (operacion) {
            case 1:
                resultado = n1+n2;
                break;
            case 2:
                resultado = n1-n2;
                break;
            case 3: 
                resultado = n1*n2;
                break;
            case 4: 
                resultado = n1/n2;
                break;
            default:
        
            System.out.println("Operación invalida");
        }
        System.out.println("El resultado es: "+resultado);
        

    }
}