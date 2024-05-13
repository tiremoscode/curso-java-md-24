package practicas.calculadoraClases.VeronicaS;

public class Calculadora {

    public static void main(String[] args) {
        double numero1=10;
        double numero2 =10;

        Operaciones ope = new Operaciones();
       // Suma
       System.out.println("Suma de " + numero1 + " +  " + numero2 + " es igual a " + ope.sumar(numero1, numero2));

       System.out.println("resta de " + numero1 + " +  " + numero2 + " es igual a " + ope.restar(numero1, numero2));

       System.out.println("multiplicacion de " + numero1 + " +  " + numero2 + " es igual a " + ope.multiplicar(numero1, numero2));

       System.out.println("división  de " + numero1 + " +  " + numero2 + " es igual a " + ope.dividir(numero1, numero2));


    }
    
}
