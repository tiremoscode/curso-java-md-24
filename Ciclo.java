public class Ciclo {
    public static void main(String[] args) {
        String nombre = "Dafne";
        // Ciclos
        // for
        // es una estructura de control que repite
        // un bloque de código un número determinado de veces.

        // Ejemplo - 500 veces no debo hablar en clase
        for (int j = 1; j <= 10; j++){
            System.out.println(j + ".- " + nombre + " No debe hablar en clase");
        }

        // while
        // Estructura de control que permite repetir un bloque de código
        // mientras una condicion especififa sea verdadera

        int x = 1; // Variable de inicialización
        while (x <= 5){
            System.out.println(x);
            String nombre2 = "Karla";
            System.out.println("Nombre 2 "+nombre2);
            x++;
        }

        // do while
        // Estructrua de contr que nos va a permitir ejecutar un 
        // bloque de código al menos una vez y después
        // mientras una confici+ón de código se mantenga verdadera

        int numero = 10;
        do {
            System.out.println(numero);
            numero++;
            System.out.println("Primer nombre "+nombre);
        } while (numero <= 15);

        

       }
}
