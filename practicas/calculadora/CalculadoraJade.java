package practicas.calculadora;

public class CalculadoraJade {
    public static void main(String[] args) {
        //variables donde haré el cambio//
        int numero1 = 30;
        int numero2 = 50;

        //suma//
        int suma = numero1 + numero2;
        System.out.println("el valor de la suma es " + suma);

        //Resta//

        int resta = numero1 - numero2;
        System.out.println("el valor de la resta es " + resta);

        //Multiplicación//

        int multiplicacion = numero1 * numero2;
        System.out.println("el valor de la multiplicación es " +multiplicacion);

        //División//

        double division = (double) numero2 / numero1;
        System.out.println("el valor de la división es " + division);
    }
}
