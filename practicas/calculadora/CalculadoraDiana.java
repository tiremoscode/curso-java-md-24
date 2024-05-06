package practicas.calculadora;

public class CalculadoraDiana {

    public static void main(String args []){
        //Variables donde haré el calculo.
        int numero1 = 30;
        int numero2 = 50;      
        
        // Suma
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;

        // mostrar en consola las respuestas
        System.out.println("El resultado de la sema es :" + suma);
        System.out.println("El resultado de la resta es : " + resta);
        System.out.println("El resultado de la multiplicacion es:" + multiplicacion);
        System.out.println("El resultado de la division es " + division);


    }
}
