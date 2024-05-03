public class Tipos {
    
    public static void main(String[] args) {
        // tipos de Datos
        // Nos sirven para almacenar información
        // de tipo númerico, texto, booleanos u objetos.

        // Datos Primitivos
        // enteros - integers (int)
        // Tipo de dato entero(decimal)
        // edad
        // Rango de valores - ====================================================
        // Tipo de datos de 32 bits.@interface
        int numeroEntero = 100;
        int edad = 29;

        // float - flotante
        // valor numerico acompañado de valores decimales
        // 32 bits
        // rango de valores 1.4 e-45 a 3.4 e+38
        float numeroFlotantePositivo = 3.1416F;
        float numeroFlotanteNegativo = -3.1416F;
        
        // ejemplo de aplicación
        // Conversion grados centigrados a fahrenheit
        // (28 °C × 9/5) + 32 = 82.4 °F

        float gradosC = 28.5f;
        float gradosF = convertirCelsiusAFahrenheit(gradosC);
        System.out.println("Los grados a fahrenheit son: "+gradosF);


        // Double
        // Tipo de datos con valores decimales
        // rango de datos 4.9 e-324 a 1.8 e+308
        // 64 bits
        double pi = 3.141592656;

        // char
        // tipo de dato tiene un rango de 0 a 65535 en valor decimal
        // 6 bits.
        char letra = 'A';
        /// RFC 
        // Primer nombre

        // boolean
        // Tipo de dato que representa
        // el resultado de una expresión lógica
        boolean yaComiHoy = true;

        // datos de Referencia
        // String
        // Cadena de caracteres y ahí almacenamos y manipulamos texto.
        // Es definida por el uso de comillas dobles.
        String alumna1 = "Jessica Silva";
        String aluman2 = "Dafne Obregón";
        String alumna3 = "Aylin 05";
        String email = "alberto@ideashappy.com";

        String hola1 = "Hola mundo";
        String hola2 = "Holamundo";

        System.out.println("Hola1 mide "+hola1.length());
        System.out.println("Hola2 mide "+hola2.length());

        // Array
        // Es una estructura de datos que permite alamacenar un conjunto
        // de elementos del mismo tipo en una sola variables.

        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;
        //numeros[5] = 'cincuenta';

        for (int i = 0; i < numeros.length; i++){
            System.out.println("Elemento en indice "+i + " valor arreglo "+numeros[i]);
        }


    }

    public static float convertirCelsiusAFahrenheit(float celsius) {
        return celsius * 9 /5 + 32;
    }

}
