public class Calculadora {
    public static void main(String args []) {
        // Variables donde haré el cálculo.
        int numero1 = 30;
        int numero2 = 50;      
        
        // Suma
        
        int suma = numero1 + numero2;
        System.out.println("El valor de la suma: " + suma);

        // Resta

        int resta = numero1 - numero2;
        System.out.println("El valor de la resta: " + resta);

        // Multiplicación

        int multiplicacion = numero1 * numero2;
        System.out.println("El valor de la multiplicación: " + multiplicacion);

        // División

        double division = (double) numero1 / numero2;
        System.out.println("El valor de la división: " + division);
    }
}
