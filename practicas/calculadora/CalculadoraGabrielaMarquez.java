package practicas.calculadora;

public class CalculadoraGabrielaMarquez {
    public static void main(String args []){
        //Variables donde haré el calculo.
        int numero1 = 30;
        int numero2 = 50;      
        
        // Suma
        int suma = numero1 + numero2;
        System.out.println("El valor de la suma es: "+suma);

        // Resta
        int resta = numero1 - numero2;
        System.out.println("El valor de la resta es: "+resta);

        // Multiplicación
        int multiplicacion = numero1 * numero2;
        System.out.println("El valor de la multiplicación es: "+ multiplicacion);

        // División
        int division = numero1 / numero2;
        System.out.println("El valor de la división es: "+ division);

    }
}