public class TiposDatos {
    public static void main(String args[]) {
        // Enteros - int
        // Valores enteros de 32 bits
        // Rango - -2 elevado a la 31 y hasta 2 elevado a 31 -1
        int edad = 70;
        int boletoMetro = 5;

        // Flotante - Float
        // Un número de punto flotante de precisión de 32 bits.
        // Rango de 1.4 exponente -45 hasta 3.4 exponente 38
        float numeroPi = 3.1416f;

        // Double
        // Un número de punto flotante de doble precisión 64 bits
        // Rango 4.9 exponente -324 hasta 1.7 exponente 308
        double numeroPICompleto = 3.141592656;

        // Byte
        // Un número de 8 bits
        // Ranglo -128 hasta 127
        // Tamaño: 1 byte
        byte edadByte = 70;

        // char
        // Un solo carácter Unicode de 16 bits
        char letra = 'A';

        // Boolean
        // Un tipo de dato que representa un valor de verdad.
        // Valores posibles: true, false

        // Objeto.

        // String
        // Byte
        // Integer
        // Float
        // Double
        // Boolean
        // Characterss

        // String
        String saludo = "Hola Cohorte 3 MD";

        // Integer
        // Utilizando en un ArrayList.
        Integer edadInteger = 70;

        // Float
        Float valorFlotante = 10.5f;

        // Double
        Double valorDouble = 20.5;

        // Casting Implicito
        int numero = 5;
        Integer numeroObjeto = numero;

        // Casting Explicito
        Double doubleNumero = 10.5;
        Integer intNumero = doubleNumero.intValue();

        System.out.println("doubleNumero " + doubleNumero);
        System.out.println("intNumero " + intNumero);

        Double duda1 = 10.6;
        Double duda2 = 10.7;

        Integer duda1Int = duda1.intValue();
        Integer duda2Int = duda2.intValue();

        System.out.println("duda 1: " + duda1Int);
        System.out.println("duda 2: " + duda2Int);

        // De Integer a double.
        Integer numeroP = 42;
        Double doubleConvertir = numeroP.doubleValue();

        System.out.println("Convettir 42 entero a double " + doubleConvertir);
    }
}